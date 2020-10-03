package day33_jjokji.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import day33_jjokji.Controller;

public class SendBox extends JFrame{
		//보내기 다시쓰기 종료
	Controller main;
	JFrame sFrame;
	JButton sendB, resetB, exitB;
	public JTextArea area;
	JScrollPane jPan;
	JPanel btnPan, idPan;
	public JTextField idField;
	public JLabel idLabel;
	public Btnevt btnevt;
	public SendBox(Controller main) {
		this.main = main;
		setUi();
	}
	public void setUi() {
		this.setTitle("쪽지쓰기");
		this.setSize(500, 500);
		
		this.addWindowListener(new WindowAdapter() {
			public void WindowCloseing(WindowEvent e) {
				SendBox.this.setVisible(false);
				main.listui.setVisible(true);
			}
		});
	
		area = new JTextArea();
		jPan = new JScrollPane(area);
		
		idField = new JTextField();
		
		idLabel = new JLabel(" ID : ");
		idField.setEditable(false);
		
		idPan = new JPanel(new BorderLayout());
		btnevt = new Btnevt(this);
		sendB = new JButton("보내기");
		sendB.addActionListener(btnevt);
		resetB = new JButton("다시쓰기");
		resetB.addActionListener(btnevt);
		exitB = new JButton("종료하기");
		exitB.addActionListener(btnevt);
		btnPan = new JPanel(new GridLayout(1,3));
		
		btnPan.add(sendB);
		btnPan.add(resetB);
		btnPan.add(exitB);
		
		idPan.add("Center",idField);
		idPan.add("West",idLabel);
		
		this.add("North",idPan);
		this.add("Center", jPan);
		this.add("South", btnPan);
		
		this.setVisible(false);
		this.setResizable(false);
		
	}
}
