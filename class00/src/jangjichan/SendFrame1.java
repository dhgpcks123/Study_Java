package jangjichan;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SendFrame1 extends JFrame{
	JTextField field;
	JTextArea area;
	JPanel pan1, pan2;
	JButton sendB, resetB, exitB;
	
	public MainForm main;
	
	public SendFrame1(MainForm main) {
		this.main = main;
		setUI();
	}
	
	public void setUI() {
		this.setTitle("쪽지쓰기");
		this.addWindowListener(new WindowAdapter() {
			public void windowCloseing(ActionEvent e) {
				SendFrame1.this.setVisible(false);
			}
		});
		
		JLabel label = new JLabel("받는사람 : ");
		// 라벨 오른쪽 정렬.
		label.setHorizontalAlignment(label.RIGHT);
		field = new JTextField();
		field.setEditable(false);
		
		// 받는사람 : ID -> 패널
		pan1 = new JPanel(new BorderLayout());
		pan1.add("West", label);
		pan1.add("Center", field);
		
		// 쪽지 작성하는 패널
		area = new JTextArea();
		area.setEditable(true);
		
		// 버튼 패널
		pan2 = new JPanel(new GridLayout(1, 3));
		
		sendB = new JButton("보내기");
		resetB = new JButton("다시쓰기");
		exitB = new JButton("닫기");
		
		// 버튼 이벤트 클래스가 들어갈 곳.
		
		// pan2 에 버튼 추가
		pan2.add(sendB);
		pan2.add(resetB);
		pan2.add(exitB);
	
		
		this.add("North", pan1);
		this.add("Center", area);
		this.add("South", pan2);
		this.setSize(435, 390);
		this.setResizable(false);
		this.setVisible(false);
	}

}
