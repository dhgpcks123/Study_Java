package jangjichan;

import javax.swing.*;
import java.awt.event.*;
import java.net.DatagramPacket;
import java.util.ArrayList;
import java.awt.*;
import jangjichan.*;

public class ReceiveFrame1 extends JFrame{
	JTextField field;
	JTextArea area;
	JPanel pan1, pan2;
	JButton replyB, exitB;
	
	public MainForm main;
	
	public ReceiveFrame1(MainForm main) {
		this.main = main;
		setUI();
		
	}
	
	public void setUI() {
		this.setTitle("쪽지읽기");
		this.addWindowListener(new WindowAdapter() {
			public void windowCloseing(ActionEvent e) {
				ReceiveFrame1.this.setVisible(false);
			}
		});
		
//		ReceiveSetData rData = new ReceiveSetData(main.t.pack);
		
		JLabel label = new JLabel("보낸사람 : ");
		// 라벨 오른쪽 정렬.
		label.setHorizontalAlignment(label.RIGHT);
		field = new JTextField();
		field.setEditable(false);
//		field.setText(rData.id);
		
		// 받는사람 : ID -> 패널
		pan1 = new JPanel(new BorderLayout());
		pan1.add("West", label);
		pan1.add("Center", field);
		
		// 쪽지 작성하는 패널
		area = new JTextArea();
		area.setEditable(false);
//		area.setText(rData.msg);
		
		// 버튼 패널
		pan2 = new JPanel(new GridLayout(1, 3));
		
		replyB = new JButton("답장");
		exitB = new JButton("닫기");
		
		replyB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SendFrame1 sendmsg = new SendFrame1(main);
//				sendmsg.field.setText(rData.ip);
//				sendmsg.setVisible(true);
				ReceiveFrame1.this.setVisible(false);
			}
			
		});
		
		exitB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ReceiveFrame1.this.setVisible(false);
			}
			
		});
		// pan2 에 버튼 추가
		pan2.add(replyB);
		pan2.add(exitB);
	
		
		this.add("North", pan1);
		this.add("Center", area);
		this.add("South", pan2);
		this.setSize(435, 390);
		this.setResizable(false);
		this.setVisible(false);
	}

}
