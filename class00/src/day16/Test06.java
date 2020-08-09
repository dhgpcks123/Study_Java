//★★★
//내부클래스와 클래스통신- 몹시 중요하다!
package day16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test06 {
	JFrame f;
	JPanel pan, sub;
	JButton btn1, btn2;
	
	public Test06() {
		f = new JFrame("***색 변경***");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//색상이 표현될 메인 판 만들고
		pan = new JPanel();
		pan.setBackground(Color.ORANGE);
		
		//버튼이 위치할 판 만들고
		sub = new JPanel(new GridLayout(1,2));
		sub.setPreferredSize(new Dimension(300,30));
		
		//버튼 만들어주자.
		btn1 = new JButton("색 변경");
		//색상변경 이벤트 추가.
		
//		BtnEvent02 colorChange = new BtnEvent02();
//		btn1.addActionListener(colorChange);
		btn1.addActionListener(new Test06_01(this));
		
		
		btn2 = new JButton("닫  기");
		//버튼에 이벤트 추가하기
		btn2.addActionListener(new BtnEvent01());
//		btn2.addActionListener(new BtnEvent01());
		/*
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		*/
	
		
		//버튼 사이즈
		btn1.setPreferredSize(new Dimension(143, 30));
		btn2.setPreferredSize(new Dimension(143, 30));
		
		//sub판에 버튼 추가하고
		sub.add(btn1, BorderLayout.WEST);
		sub.add(btn2, BorderLayout.EAST);
		
		f.add(pan, BorderLayout.CENTER);
		f.add(sub, BorderLayout.SOUTH);
		f.setSize(300, 350);
		f.setResizable(false);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Test06();
	}
//전역 내부 클래스
	class BtnEvent02 implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//필요한 rgb값 만들고
			int red = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			
			//Color 객체를 만들어
			Color color = new Color(red,green,blue);
			pan.setBackground(color);
		}

	}
//지역 내부 클래스
	//함수를 만든다.
	public ActionListener setBg() {
		class BtnEvent03 implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				// 필요한 rgb 값을 만들고
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				
				// Color 객체를 만들고
				Color color = new Color(red, green, blue);
				pan.setBackground(color);
			}
		}
		return new BtnEvent03();
	}

	
}


class BtnEvent01 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("프로그램 종료한다");
		System.exit(0);
	}
}