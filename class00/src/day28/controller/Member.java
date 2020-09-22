package day28.controller;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import day28.evt.*;

public class Member {
	public JFrame fr;
	public MemberJoin join;
	JButton btn1, btn2, btn3, btn4, btn5, btn6;

	
	
	public Member() {
		join = new MemberJoin(this);
		
		fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pan = new JPanel(new GridLayout(1, 3));
		
		btn1 = new JButton("회원리스트");
		btn2 = new JButton("회원조회");
		btn3 = new JButton("회원가입");
		btn4 = new JButton("가입test");
		btn5 = new JButton("닫기");

		
		//버튼에 이벤트 추가
		MemberEvent evt = new MemberEvent(this);
		btn1.addActionListener(evt);
		btn2.addActionListener(evt);
		btn3.addActionListener(evt);
		btn4.addActionListener(evt);
		btn5.addActionListener(evt);

		
		pan.add(btn1);
		pan.add(btn2);
		pan.add(btn3);
		pan.add(btn4);
		pan.add(btn5);

		
		fr.add(pan);
		
		fr.setSize(900, 100);
		fr.setResizable(false);
		fr.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Member();
	}

}
