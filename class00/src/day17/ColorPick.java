//★★
package day17;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import event.CloseEvt;
import event.ChooseEvent;
import event.ColorSet;

public class ColorPick extends JFrame {
	public ColorClass main;
	public JPanel panel, bPanel;
	public JButton btn1, btn2, btn3;
	public Color color;
	
	public ColorPick(ColorClass main) {
		this.main = main;
	
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	//판넬 두개를 만들어 주자.
	panel = new JPanel();
	panel.setBackground(Color.WHITE);
	panel.setPreferredSize(new Dimension(250, 250));
	
	bPanel = new JPanel(new BorderLayout());
	bPanel.setPreferredSize(new Dimension(250, 20));

	
	//버튼 초기화
	btn1 = new JButton("색적용");
	btn2 = new JButton("색선택");
	btn3 = new JButton("닫  기");
	
	//버튼에 이벤트 추가하기
	
	
	btn1.addActionListener(new ColorSet(this));
	
	btn2.addActionListener(new ChooseEvent(this));

	btn3.addActionListener(new CloseEvt(this));
	
	
	//버튼 사이즈 적용
	btn1.setPreferredSize(new Dimension(80,20));
	btn2.setPreferredSize(new Dimension(85,20));
	btn3.setPreferredSize(new Dimension(80,20));
	
	//버튼을 넣어줘
	bPanel.add(btn1, BorderLayout.WEST);
	bPanel.add(btn2, BorderLayout.CENTER);
	bPanel.add(btn3, BorderLayout.EAST);
	
	this.add(panel, BorderLayout.CENTER);
	this.add(bPanel, BorderLayout.SOUTH);
	
	this.setSize(250,270);
	this.setVisible(false);

	
	};
}
