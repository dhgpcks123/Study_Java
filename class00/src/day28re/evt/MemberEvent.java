package day28re.evt;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import java.awt.*;
import day28re.controller.*;
import day28re.vo.MemberVO;
import DB.MyJDBC;
import day28re.dao.*;

public class MemberEvent implements ActionListener {
	Member main;

	MemberDao dao;
	public MemberEvent() {
	}
	public MemberEvent(Member main) {
		this.main= main;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("조회")) {
			selecData();
		}else if(e.getActionCommand().equals("가입")) {
			addData();
		}else if(e.getActionCommand().equals("종료")) {
			JOptionPane.showMessageDialog(null, "종료하겠습니다");
			System.exit(0);
		}
			
			
	}

	public void addData() {
		main.frame.setVisible(false);
		main.join.setVisible(true);
		
	}
	public void selecData() {
		dao = new MemberDao();
		ArrayList<MemberVO> list = dao.getlist();
		for(int i = 0 ; i <list.size() ; i ++) {
			System.out.print(list.get(i).getMno()+"|");
			System.out.print(list.get(i).getId()+"|");
			System.out.print(list.get(i).getPw()+"|");
			System.out.print(list.get(i).getName());
			System.out.println(list.get(i).getMail()+"|");
			System.out.print(list.get(i).getTel()+"|");
			System.out.print(list.get(i).getGen()+"|");
			System.out.print(list.get(i).getAvt());
			System.out.println();
			System.out.println("-----------------------------------");
		}
		
	}
}
