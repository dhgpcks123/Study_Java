package day27;
/*
다음 기능을 가진 프로그램을 제작하세요. awt써서 창 띄우시고~
* hello계정의 emp01테이블에서 정보를 뽑아오세요.
	이름(ename) 리스트 조회 기능,	
		--> SELECT ename FROM emp01;
		==> Statement
	회원 상세정보 조회 기능,	
		--> SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno FROM member01 WHERE ename = ?
		==> PreparedStatement
		* mgr은 상사이름으로 바꿔서, hiredate는 날짜만.
	프로그램 종료 기능		
*/
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import DB.MyJDBC;

public class Test01_01 {

	Connection con;
	Statement stmt;
	ResultSet rs;
	PreparedStatement pstmt;
	JFrame frame;
	JPanel pan1, pan2;
	JButton btn1, btn2, btn3;
	JTextArea area;
	MyJDBC db;
	public Test01_01() {
		
			db = new MyJDBC();
			System.out.println("드라이버연결성공");
			setUI();
			
	
	}
	
	public void setUI() {
		frame = new JFrame("회원 조회 테이블");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pan1 = new JPanel(new BorderLayout());
		pan2 = new JPanel(new GridLayout(1,3));
		
		btn1 = new JButton("조회");
		btn2 = new JButton("정보");
		btn3 = new JButton("종료");
		btn1.setPreferredSize(new Dimension(50,50));
		btn2.setPreferredSize(new Dimension(50,50));
		btn3.setPreferredSize(new Dimension(50,50));
		
		area = new JTextArea();
		//조회
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getEname(area);				
			}
			
		});
		
		//정보
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getInfo(area);
			}
			
		});
		
		//종료
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		pan1.add(area);
		
		pan2.add(btn1, BorderLayout.EAST);
		pan2.add(btn2, BorderLayout.CENTER);
		pan2.add(btn3, BorderLayout.WEST);
		
		frame.add(pan1, BorderLayout.CENTER);
		frame.add(pan2, BorderLayout.SOUTH);
		
		frame.setSize(300,430);
		frame.setVisible(true);
		frame.setResizable(false);
	
	}
	
	public void getEname(JTextArea area) {
		
		
		//connection
		con = db.getCon();
		System.out.println("EnameList_connection성공");
		// statement가져오고
		// sql문 작성하고
		String sql = "SELECT ename FROM emp01";
		
		stmt = db.getSTMT(con);
		System.out.println("EnameList_ResultSet성공");
		//ResultSet으로 가져오고
		try {
			rs = stmt.executeQuery(sql);
			System.out.println("EnameList_executeQuery성공");
			
			StringBuffer buff = new StringBuffer();
			int cnt = 1;
			while(rs.next()) {
			String ename = rs.getString("ename")+"\n";
				buff.append(cnt+" ");
				buff.append(ename);
				cnt++;
			}
						
			area.setText(buff.toString());
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
	}

	
	public void getInfo(JTextArea area) {
		//드라이버연결
		con = db.getCon();
		System.out.println("getInfo_드라이버연결성공");
//		String sql = "SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno FROM member01 WHERE ename = ?";
		StringBuffer presql = new StringBuffer();
		presql.append("SELECT e.empno, e.ename, e.job, d.ename dname, e.hiredate, e.sal, e.comm, e.deptno ");
		presql.append("FROM ");
		presql.append("emp01 e, emp01 d ");
		presql.append("	WHERE e.mgr = d.empno(+) ");
		presql.append("	     AND e.ename = ? ");
		String sename = JOptionPane.showInputDialog("이름을 입력하세요.");
		String sql = presql.toString();
		pstmt = db.getPSTMT(con, sql);
		System.out.println("getInfo_statement성공");
		
		try {
			pstmt.setString(1, sename);
			rs = pstmt.executeQuery();
			rs.next();
			StringBuffer buff = new StringBuffer();
			buff.append("회원번호 :");
			buff.append(rs.getInt("empno")+"\n");
			System.out.println("getInfo_회원번호");
			buff.append("회원이름 :");
			buff.append(rs.getString("ename")+"\n");
			System.out.println("getInfo_회원이름");
			buff.append("직업 :");
			buff.append(rs.getString("job")+"\n");
			System.out.println("getInfo_직업");
			buff.append("상사이름 :");
			buff.append(rs.getString("dname")+"\n");
			System.out.println("getInfo_상사이름");
			buff.append("입사일 :");
			buff.append(rs.getDate("hiredate")+"\n");
			System.out.println("getInfo_입사일");
			buff.append("급여 :");
			buff.append(rs.getInt("sal")+"\n");
			System.out.println("getInfo_급여");
			buff.append("커미션 :");
			buff.append(rs.getInt("comm")+"\n");
			System.out.println("getInfo_커미션");
			buff.append("부서번호 :");
			buff.append(rs.getString("deptno")+"\n");
			System.out.println("getInfo_부서번호");
			
			area.setText(buff.toString());
		} catch (Exception e) {
			area.setText("이름을 잘못 입력했습니다.");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		new Test01_01();
	}

}
