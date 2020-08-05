//★★★
package day10;
/*
문제 1]
	반지름을 입력받아서
	원의 넓이와 둘레를 계산하고
	출력하는 프로그램을 작성하세요.
	
	단, 입력, 넓이계산, 둘레계산, 출력은 
	함수를 만들어서 처리하세요.
	
	참고 ]
		double no = 12.3456;
		
		no를 소수 세째자리에서 반올림하는 방법
		
		(int)(no * 100 + 0.5) / 100.

*/
import javax.swing.*;
public class Ex01 {
	final float PI = 3.14f;
	int ban;
	public Ex01() {
		setBan();
	toPrint();
	}
	//반지름 입력받아봐
	public int setBan() {
		String sban = JOptionPane.showInputDialog("반지름 입력해봐");
		ban = Integer.parseInt(sban);
		
		return ban;
	}
	
	//넓이계산
	public float setArea() {
		float area = (int)(ban*ban* PI*100+0.5)/100;
		return area;
	}
	
	//출력
	public void toPrint() {
		System.out.println("반지름"+ban+"넓이"+setArea());
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
