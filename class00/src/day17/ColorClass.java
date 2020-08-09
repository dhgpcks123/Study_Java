//★★
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
		//프레임을 객체생성 시켜줌.
		frame = new JFrame("**칼라보기**");
		//프레임 기본 x버튼 활성화해줌
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ColorPick 초기화
		cPick = new ColorPick(this);
		
		//패널 만들어줘 센터
		panel = new JPanel();
		//패널 배경색 설정해줘야돼
		
		Color color = JColorChooser.showDialog(frame, "초기칼라선택", Color.WHITE);
		//색 적용하고
		panel.setBackground(color);
		
		//버튼 만들기
		btn1 = new JButton("변경창");
		btn2 = new JButton("닫  기");
		
		//버튼 사이즈 조절
		btn1.setPreferredSize(new Dimension(147, 30));
		btn2.setPreferredSize(new Dimension(147, 30));
		
		//버튼 이벤트 추가
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cPick.setVisible(true);
			}
		});
		
		//b판넬을 만들어주자
		bPanel = new JPanel(new BorderLayout());
		bPanel.add(btn1, BorderLayout.WEST);
		bPanel.add(btn2, BorderLayout.EAST);
		
		//프레임에 패널 추가
		frame.add(panel, BorderLayout.CENTER);
		frame.add(bPanel, BorderLayout.SOUTH);
		
		frame.setSize(300, 330);
		frame.setResizable(false);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		new ColorClass();
	}

}
