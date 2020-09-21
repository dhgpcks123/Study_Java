package day27;



import java.awt.*;
import java.awt.event.*;

import java.sql.*;
import java.sql.Time;
import java.text.*;
import javax.swing.*;

import DB.MyJDBC;
public class Test01 {
	MyJDBC db;
	Connection con ;
	Statement stmt ;
	PreparedStatement pstmt ;
	ResultSet rs;
	
	JFrame frame;
	JPanel pan1, pan2;
	JTextArea area;
	JButton btn1, btn2, btn3;
	
	public Test01() {
		// 이 클래스는 데이터베이스 작업시 반드시 필요한 프로그램이므로
		// 먼저 데이터베이스를 사용하도록 드라이버 로딩 작업을 해놓는다.
		// 우리는 그런 작업들을 이미 클래스로 구현해놓았다.
		db = new MyJDBC();
		
		//화면 만들기
		setUI();
	}
	
	
	public void setUI() {
		frame = new JFrame("회원 조회 서비스");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pan1 = new JPanel(new BorderLayout());
		pan2 = new JPanel(new GridLayout(1, 3)); //row는 하나 column은 세 개
		
		pan1.setPreferredSize(new Dimension(300,400));
		pan2.setPreferredSize(new Dimension(300, 30));
		
		area = new JTextArea();
		pan1.add(area);
		
		//버튼 추가
		btn1 = new JButton("조회");
		btn2 = new JButton("정보");
		btn3 = new JButton("종료");
		
		//버튼에 이벤트 추가
		//1번 조회이벤트
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getList();
			}
		});
		
		//2번 정보 버튼
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getInfo();
			}
		});
		
		//3번 종료 버튼.
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		// pan2 에 버튼 추가
		pan2.add(btn1);
		pan2.add(btn2);
		pan2.add(btn3);
		
		frame.add(pan1, BorderLayout.CENTER);
		frame.add(pan2, BorderLayout.SOUTH);
		
		frame.setSize(300, 430);
		frame.setResizable(false);
		frame.setVisible(true);
	
	}
	
	//회원 리스트 조회 처리 함수
	public void getList() {
		// 할 일
		// 접속부터한다.
		con =db.getCon();
		//질의명령 만든다.
		StringBuffer buff = new StringBuffer();
		buff.append("SELECT id FROM member01 WHERE isshow = 'Y'");
		String sql = buff.toString();
		//statement
		stmt = db.getSTMT(con);
		//실어보내고 ResultSet 결과 받는다.
		try {
			rs= stmt.executeQuery(sql);
		
			StringBuffer msg = new StringBuffer();
			while(rs.next()) {
				String sid =rs.getString("id")+"\n";
				msg.append(sid);
				/*
				 	euns + \n
				 	joo
				 	jiwoo
				 */
			}
			area.setText(msg.toString());
			area.setBackground(Color.WHITE);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
				db.close(rs);
				db.close(stmt);
				db.close(con);
		}
		//결과값 꺼내서 처리해주고.
	}
	//회원 정보 조회 처리 함수
	public void getInfo() {
		// 할일
		// 1. 조회할 아이디 입력받고
		String sid = JOptionPane.showInputDialog("조회할 아이디를 입력하세요");
		// 2.conntion 연결
		con = db.getCon();
		// 3. 질의명령 ?포함
		//질의명령 만든다.
		StringBuffer buff = new StringBuffer();
		buff.append("SELECT mno, name, mail, tel, gen, avt, joinDate ");
		buff.append("FROM member01 ");
		buff.append("WHERE id = ? ");
		
		String sql = buff.toString();
		
		// 4. PreparedStatement
		pstmt = db.getPSTMT(con, sql);
		try {
			// 5. 질의명령 완성. ?채워주고
			pstmt.setString(1, sid);
			// 6. 질의명령 실행요청하고 결과받음
			rs = pstmt.executeQuery();
			//데이터 몇개 조회딥니까? 7개. 아님 1개임 한 행이 한 개임.
			// 7. 데이터 꺼내서 처리
			rs.next();
			StringBuffer b1 = new StringBuffer();
			b1.append("회원번호 : ");
			b1.append(rs.getInt("mno") + "\n");
			b1.append("회원이름 : ");
			b1.append(rs.getString("name")+"\n");
			b1.append("회원메일 : ");
			b1.append(rs.getString("mail")+"\n");
			b1.append("전화번호 : ");
			b1.append(rs.getString("tel")+"\n");
			b1.append("회원성별 : ");
			String gen = rs.getString("gen").equals("M")?"남자":"여자";
			b1.append(gen+"\n");
			b1.append("아 바 타 : ");
			b1.append(rs.getInt("avt")+"\n");
			b1.append("등 록 일 : ");
			
			// 날짜 데이터는 JDBC에서 날짜와 시간을 분리해서 꺼내도록 해 놓았다.
			// 따라서 날짜와 시간을 분리해서 꺼내고 문자열 형태로 만들어줘야 한다.
			// 그래야 보기 편하니까.. 우리가 원하는 형식...
			Date jDate = rs.getDate("joinDate");
			Time jTime = rs.getTime("JoinDate");
			SimpleDateFormat form1 = new SimpleDateFormat("yyyy년 MM월 dd일 ");
			SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
			String sDate = form1.format(jDate)+form2.format(jTime);
			
			b1.append(sDate+"\n");
			
			area.setText(b1.toString());
			area.setBackground(Color.ORANGE);
		} catch (SQLException e) {
			area.setText("없는 정보를 입력했습니다.");
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
	}
	
	
	public static void main(String[] args) {
		new Test01();
	}

}
