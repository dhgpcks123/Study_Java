package day16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test08 {
		JFrame f;
		JPanel pan, sub;
		JButton btn1, btn2;

	public Test08() {
		//JFrame 객체생성해주고!=힙타입에 올려주고.
		f = new JFrame("***여기는 제목입니다***");
		
		//기본셋팅을 해줄껀데 (JFrame의 종료버튼 활성화준거야)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//----------------------------------------------------------------
		//색상이 표현 될 메인 판 만들고
		pan = new JPanel();
		//판의 색상을 지정해줘
		//여기서 pan은 JPanel,
		//클래스안에 setBackground함수(매개변수리스트)
		pan.setBackground(Color.ORANGE);
//---------------------------------------------------------------	
		//버튼 들어갈 판 만들어줘야지 & 레이아웃 정책도 정해서 만든다.
		sub = new JPanel(new BorderLayout());
		//sub크기를 조절해줘볼까?
		sub.setPreferredSize(new Dimension(300,30));
//----------------------------------------------------------------
		//버튼을 만들어주자.
		btn1 = new JButton("색 변경");
		btn2 = new JButton("닫   기");
		//버튼 크기 조절해주고.
		btn1.setPreferredSize(new Dimension(142,30));
		btn2.setPreferredSize(new Dimension(142,30));
		//버튼을 버튼 들어갈 판에 넣어줘야돼.
		sub.add(btn1, BorderLayout.WEST);
		sub.add(btn2, BorderLayout.EAST);
		
		//색상? 버튼 넣을건데 필요없어.
		//판 배치해주자.
		f.add(sub, BorderLayout.SOUTH);
		
		//판을 배치해줘야 됨
		//JFrame에 add함수()에 매개변수리스트 (붙여줄꺼랑,
		//어디에?배치할지에 대한 내용을 정의해놓은 클래스에서 CENTER 상수
		f.add(pan, BorderLayout.CENTER);
		
		//JFrame은 판넬이다. 판넬의 사이즈를 지정해준다.
		f.setSize(300, 500);
		//JFrame 디폴트 안보이게 되어있음. 보이게 해줘.
		f.setVisible(true);
		//크기 못 조절하도록 해준다.
		f.setResizable(false);
		
		
		
//------------------------------버튼에 기능을 넣어준다.	
		BtnEve evt01 = new BtnEve();
		ActionListener evt1 = evt01;
// -> ActionListener evt = new BtnEvent01();//자동형변환
		//근데 이거 왜 자동형변환해주는거지?
//		btn2.addActionListener(evt1);

		//---------무명 내부클래스
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("프로그램을 종료합니다!");
				System.exit(0);
			}
			
		});
	
	
	
	}
	
	
	
	
	public static void main(String[] args) {
		new Test08();
	}

}


//종료버튼에 기능을 먼저 넣어줄건데
//첫 번째 방법
class BtnEve implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("프로그램을 종료합니다");
		System.exit(0);
	}
	
}
