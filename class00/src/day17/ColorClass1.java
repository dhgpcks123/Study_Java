package day17;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//Abstract Windows Toolkit
//Java에서 GUI를 지원하는 윈도우 프로그래밍을 위해 필요한 패키지
//윈도우 프로그래밍에 필요한 각종 클래스와 도구가 포함되어있다.
//주 패키지는 java.awt
//운영체제의 윈도 시스템을 사용한다.
public class ColorClass1 {
	public JFrame frame;
	public JPanel panel, bPanel;
	public JButton btn1, btn2;
	public ColorPick1 cPick;
	
	public ColorClass1() {
		//frame을 객체에 올려.
		frame = new JFrame("*** 칼라 보기 ***");
		//frame의 기본 x버튼에 이벤트처리
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		//패널만들기
		panel = new JPanel();
		//패널 배경색 설정
		//색 선택하고 JColorCHooser.showDialog();
		Color color = JColorChooser.showDialog(frame, "초기칼라선택", Color.WHITE);
		//색 적용하고
		panel.setBackground(color);
		
		//버튼 만들기
		btn1 = new JButton("색변경");
		btn2 = new JButton("Close");
		
		//버튼 사이즈 변경
		btn1.setPreferredSize(new Dimension(147,30));
		btn2.setPreferredSize(new Dimension(147,30));

		//버튼 이벤트 추가
		//칼라변경 버튼 ==> 새창 띄워짐
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			cPick.setVisible(true);
			}
		});
		
		//닫기버튼
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		

		
		bPanel = new JPanel(new BorderLayout());
		bPanel.add(btn1, BorderLayout.WEST);
		bPanel.add(btn2, BorderLayout.EAST);
		
		
		
		//프레임에 패널 추가
		frame.add(panel, BorderLayout.CENTER);
		frame.add(bPanel,BorderLayout.SOUTH);
		
		//창 사이즈 셋팅
		frame.setSize(300, 300);
		frame.setVisible(true); //창 보이게 셋팅
		frame.setResizable(false);//창크기 변경 불가능하게 셋팅
	}
	public static void main(String[] args) {
		new ColorClass1();
	}
}
