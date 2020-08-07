package day17;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ColorClass {
	public JFrame frame;
	public JPanel panel, bPanel;
	public JButton btn1, btn2;
	public ColorPick cPick;
	
	public ColorClass() {
		frame = new JFrame("★★★ 칼라보기 ★★★");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼 이벤트 처리
		
		frame.setSize(300, 330); //창 사이즈 셋팅
		frame.setResizable(false); // 창크기 변경 불가능 셋팅
		
		// ColorPick 초기화
		cPick = new ColorPick(this); //this 객체자체를 주는 게 아니라 객체주소를 준다.
		//this의 기능? 현재 실행중인 객체주소를 가져오는 예약어
		
		// 패널 만들기
		panel = new JPanel();
		// 패널배경색 설정
		//색 선택하고
		Color color = JColorChooser.showDialog(frame, "초기칼라선택", Color.WHITE);
		//색 적용하고
		panel.setBackground(color);
		
		//버튼 만들기
		btn1 = new JButton("색변경");
		btn2 = new JButton("Close");
		
		//버튼 사이즈 변경
		btn1.setPreferredSize(new Dimension(147, 30));
		btn2.setPreferredSize(new Dimension(147, 30));
		
		
		//버튼 이벤트 추가
		
		//칼라변경 버튼	==> 새 창 띄워짐
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			cPick.setVisible(true);
			}
		});
		
		//닫기 버튼
		btn2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		bPanel = new JPanel(new BorderLayout());
		bPanel.add(btn1, BorderLayout.WEST);
		bPanel.add(btn2, BorderLayout.EAST);
		
		
		// 프레임에 패널추가
		frame.add(panel, BorderLayout.CENTER);
		frame.add(bPanel, BorderLayout. SOUTH);
		
		frame.setVisible(true);	//창 보이게 셋팅 //setVisible하는 순간 다시 읽어와야함
		
	}
	
	public static void main(String[] args) {
		new ColorClass();
	}

}
