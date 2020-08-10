package day18;
/*
	삼각형 클래스를 만드는데
	삼각형의 밑변이 같으면 같은 삼각형이 되도록 정의하고
	밑변, 높이를 1~20 사이의 정수로 랜덤하게 만들어서
	삼각형을 두 개를 만들고
	만들어진 삼각형들을 비교해서
	같은지 여부를 출력하세요.
	
	단, 3보다 작은 숫자가 발생하면 사용자 정의 예외를 만들어서 처리하세요.
	15보다 큰 숫자는 NuberFormatException으로 처리하세요.
	+
	클래스를 출력하면 클래스의 내용이 출력되게 함수를 오버라이드하세요.
 */
import javax.swing.*;
public class Ex02 {

	public Ex02() {
		
		int no1 = (int)(Math.random()*20)+1;
		int no2 = (int)(Math.random()*20)+1;
		
		Samgak sam1 = new Samgak(no1, no2);

		int no3 = (int)(Math.random()*20)+1;
		int no4 = (int)(Math.random()*20)+1;
		
		Samgak sam2 = new Samgak(no3, no4);
		
		int[] noArr = new int[4];
		noArr[0] = no1;
		noArr[1] = no2;
		noArr[2] = no3;
		noArr[3] = no4;
		
		try {
			for(int i = 0 ; i<noArr.length; i ++) {
				if(noArr[i]<3) {
					throw new Excpt1();
					//객체만들기는 new Excpt1인데, JVM아 이건 예외처리야
					//알려주기 위해서 throw를 쓴다.
				}else if(noArr[i]>15) {
					
					throw new NumberFormatException();
				}
			}
		}catch(Excpt1 e) {
			e.printStackTrace();
			e.toString();
		}catch(NumberFormatException e) {
			System.out.println("15보다 큰 수입니다");
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();	
		}
		String msg = "두 삼각형 (1)"+no1+", "+no2+" (2)"+no3+", "+no4+"는 "+(sam1.equals(sam2)?"같은 ":"다른 ")+"삼각형이다";
		JOptionPane.showMessageDialog(null, msg);
	}
	public static void main(String[] args) {
		new Ex02();
	}

}


//--------------------------------------------------------------------

class Samgak/*extends Object*/{
	int width;
	int height;
	double area;
	
	public Samgak() {}
	public Samgak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	public void setArea() {
		area = width*height;
	}
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Samgak n = (Samgak) o;
		if(this.area == n.area) {
			bool = true;
		}
		return bool;
		
	}
}


class Excpt1 extends Exception{
	public String toString() {
		return "3보다 작은 숫자입니다.";
	}
}