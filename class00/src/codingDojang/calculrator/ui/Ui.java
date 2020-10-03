package codingDojang.calculrator.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import codingDojang.calculrator.BtnEvent;
import codingDojang.calculrator.Controller;
import codingDojang.calculrator.EnterTrd;
import codingDojang.calculrator.EnterTrd01;

public class Ui extends JFrame {

	Controller main;
	public JButton btn00, btn0 ,btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	public JButton btnP, btnM, btnG, btnN;
	public JButton btnClear;
	
	public JTextArea rField;
	JPanel rPan, numPan;
	public EnterTrd ent;
	
	public Ui(Controller main) {
		this.main = main;
		setUi();
	}

	public void setUi() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,700);
		
		rPan = new JPanel(new GridLayout(4,6));
		rPan.setPreferredSize(new Dimension(600, 500));
		numPan = new JPanel();
		numPan.setPreferredSize(new Dimension(200, 500));
		rField = new JTextArea("");
		rField.setPreferredSize(new Dimension(550,150));
		Font font = new Font("gulim", Font.PLAIN, 20);
		rField.setFont(font);
		rField.setEditable(false);
		btn00 = new JButton("00");
		btn00.setFont(new Font("gulim",Font.PLAIN, 30));
		btn00.setPreferredSize(new Dimension(50,50));
		btn00.addActionListener(new BtnEvent(main));
		btn0 = new JButton("0");
		btn0.setFont(new Font("gulim",Font.PLAIN, 30));
		btn0.addActionListener(new BtnEvent(main));
		btn1 = new JButton("1");
		btn1.setFont(new Font("gulim",Font.PLAIN, 30));
		btn1.addActionListener(new BtnEvent(main));
		btn2 = new JButton("2");
		btn2.setFont(new Font("gulim",Font.PLAIN, 30));
		btn2.addActionListener(new BtnEvent(main));
		btn3 = new JButton("3");
		btn3.setFont(new Font("gulim",Font.PLAIN, 30));
		btn3.addActionListener(new BtnEvent(main));
		btn4 = new JButton("4");
		btn4.setFont(new Font("gulim",Font.PLAIN, 30));
		btn4.addActionListener(new BtnEvent(main));
		btn5 = new JButton("5");
		btn5.setFont(new Font("gulim",Font.PLAIN, 30));
		btn5.addActionListener(new BtnEvent(main));
		btn6 = new JButton("6");
		btn6.setFont(new Font("gulim",Font.PLAIN, 30));
		btn6.addActionListener(new BtnEvent(main));
		btn7 = new JButton("7");
		btn7.setFont(new Font("gulim",Font.PLAIN, 30));
		btn7.addActionListener(new BtnEvent(main));
		btn8 = new JButton("8");
		btn8.setFont(new Font("gulim",Font.PLAIN, 30));
		btn8.addActionListener(new BtnEvent(main));
		btn9 = new JButton("9");
		btn9.setFont(new Font("gulim",Font.PLAIN, 30));
		btn9.addActionListener(new BtnEvent(main));
		btnP = new JButton(" + ");
		btnP.setFont(new Font("gulim",Font.PLAIN, 30));
		btnP.addActionListener(new BtnEvent(main));
		btnM = new JButton(" - ");
		btnM.setFont(new Font("gulim",Font.PLAIN, 30));
		btnM.addActionListener(new BtnEvent(main));
		btnG = new JButton(" * ");
		btnG.setFont(new Font("gulim",Font.PLAIN, 30));
		btnG.addActionListener(new BtnEvent(main));
		btnN = new JButton(" / ");
		btnN.setFont(new Font("gulim",Font.PLAIN, 30));
		btnN.addActionListener(new BtnEvent(main));
		btnClear = new JButton("clear");
		btnClear.setFont(new Font("gulim",Font.PLAIN, 30));
		btnClear.addActionListener(new BtnEvent(main));
		//
		rPan.add(btn9);
		rPan.add(btn8);
		rPan.add(btn7);
		rPan.add(btnP);
		//
		rPan.add(btn6);
		rPan.add(btn5);
		rPan.add(btn4);
		rPan.add(btnM);
		//
		rPan.add(btn3);
		rPan.add(btn2);
		rPan.add(btn1);
		rPan.add(btnG);
		//
		rPan.add(btn00);
		rPan.add(btn0);
		rPan.add(btnClear);
		rPan.add(btnN);
		

		
		numPan.requestFocus();
		numPan.setFocusable(true);
		ent = new EnterTrd(this);
		EnterTrd01 t = new EnterTrd01(this);
		numPan.addKeyListener(t.start());
		numPan.add(rField);
		this.add(rPan, BorderLayout.SOUTH);
		this.add(numPan);
		
		this.setVisible(true);
		this.setResizable(false);
	}
}
