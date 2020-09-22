package day28re.controller;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import day28re.evt.*;
import day28re.controller.*;

public class Member {
	public MemberJoin join;

	public JFrame frame;
	JPanel pan;
	JButton btn1, btn2, btn3;
	
	public Member() {
		join =  new MemberJoin(this);
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pan = new JPanel(new GridLayout(1,3));
		
		btn1 = new JButton("조회");
		btn2 = new JButton("가입");
		btn3 = new JButton("종료");
		
		
		
		MemberEvent evt = new MemberEvent(this);
		btn1.addActionListener(evt);
		btn2.addActionListener(evt);
		btn3.addActionListener(evt);
		
		pan.add(btn1);
		pan.add(btn2);
		pan.add(btn3);
		
		frame.add(pan);
		
		frame.setSize(300, 100);
		frame.setVisible(true);
		frame.setResizable(false);
	}


	public static void main(String[] args) {
		new Member();
	}
}
