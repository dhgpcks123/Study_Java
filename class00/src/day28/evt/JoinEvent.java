package day28.evt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import day28.controller.*;
import day28.dao.*;
import day28.vo.*;

public class JoinEvent implements ActionListener {
	public MemberJoin join;
	MemberDao mDao;
	
	 String sid = null;
	 String sname = null ;
	 String spw = null ;
	String smail = null ;
	 String stel = null ;
	 String sgen = null ;
	
	
	public int sno;
	public JoinEvent() {
	}
	public JoinEvent(MemberJoin join) {
		this.join = join;
		mDao = new MemberDao();
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("가입")) {
			joinProc();
		}else if(e.getActionCommand().equals("종료")) {
			JOptionPane.showMessageDialog(null, "메뉴화면으로 돌아갑니다");
			// join 창을 닫고 main 창을 띄워줘야 한다.
			join.setVisible(false);
			join.main.fr.setVisible(true);
		}
	}
	
	// 회원가입 이베트 처리함수
	public void joinProc() {
		// 입력된 아이디 읽어온다.
		sid = join.id.getText();
		System.out.println("아이디받기");
		// 질의명령 보내서 카운트 받아온다.
		int cnt = mDao.idCount(sid);
		// 카운트 값에 따라 적당히 처리해준다.
		
		
		// 데이터 꺼내온다.
		// 1. 이름
		sname = join.name.getText();
		spw = join.pw.getText();
		smail = join.mail.getText();
		stel = join.tel.getText();
		sgen = join.gen.getText();
		sno = Integer.parseInt(join.avt.getText());
		System.out.println("정보받기");
		// vo 에 담는다.
		System.out.println("테스트0"+sname);

		
		
		// 다 채워진 VO 채로 데이터베이스 처리함수에게 넘겨준다.
		
		MemberVO vo = new MemberVO();
		vo.setId(sid);
		vo.setName(sname);
		vo.setPw(spw);
		vo.setMail(smail);
		vo.setTel(stel);
		vo.setGen(sgen);
		vo.setAno(sno);
		System.out.println("테스트1 " +sid);
		cnt = mDao.joinlist(vo);
		
	}
}
