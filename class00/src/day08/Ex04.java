//★
package day08;
/*
문제 4 ]
	
	도형의 정보를 입력받는데
	입력형식은 
	 	
	 	0/5		- 반지름이 5인 원
	 	3/5/10	- 밑변이 5이고 높이가 10인 삼각형
	 	4/3/4	- 가로가 3이고 세로가  4인 사각형
	 	
	의 형식으로 입력 받은 도형의 넓이를 계산해서 출력하세요.
	
참고 ]
	
	indexOf(int ch, int fromIndex)
		ch 			: 찾을 문자
		fromIndex 	: 찾을 시작위치
	
	lastIndexOf(int ch)
		뒤에서 부터 찾을 문자를 검색해서 해당 위치를 반환해준다.
	 	
*/
import javax.swing.*;
public class Ex04 {
	public Ex04(){
		
		while(true) {
		String str = JOptionPane.showInputDialog("값을 입력해라");
		if(str.equals("q")) break;
		
		char moyang = str.charAt(0);
		int no1 = Integer.parseInt(str.substring(str.indexOf('/'),str.indexOf('/')+1));
		int no2 = Integer.parseInt(str.substring(str.lastIndexOf('/')));
		
		double result = 0;
		switch(moyang) {
		case '0':
				result = ((int)(no1*no1*Math.PI*100+0.5))/100;
			break;
			//111234.12345
			//(int)11123412.345+5
			//111234.12
		case '3':
				result= no1*no2*0.5;
			break;
		case '4':
				result = no1*no2;
			break;
		default : System.out.println("잘못입력");	
		}
		
		JOptionPane.showMessageDialog(null, result);
		}
		
	}
	public static void main(String[] args) {
		new Ex04();
	}
}
