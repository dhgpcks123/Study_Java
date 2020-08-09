package day13;

import java.awt.Color;
import javax.swing.JFrame;

public class Test05 extends JFrame{
	//JFrame클래스가 갖고 있는 속성들을 가지고 왔어. 거의 뭐 JFrame이라 봐도 되겠지?
	public Test05() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이것은 창입니다.");
		this.setSize(300, 500);
		this.setResizable(false);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Test05();
	}
}
