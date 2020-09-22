package day28re.evt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import day28re.controller.*;
import day28re.dao.MemberDao;

public class JoinEvent implements ActionListener {
	MemberJoin join;
	MemberDao dao;
	public JoinEvent() {}
	public JoinEvent(MemberJoin join) {
		this.join = join;
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand().equals("가입")) {
			intDate();
			System.out.println("가입이 완료되었습니다.");
			
		}else if(e.getActionCommand().equals("종료")){
			premenu();
		}
	}
	
	public void premenu() {
		join.setVisible(false);
		join.main.frame.setVisible(true);
	}
	public void intDate() {
		dao = new MemberDao();
		dao.intmemb();
	}

}
