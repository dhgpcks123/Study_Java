//★★
package day18;
/*
	삼각형 클래스를 만드는데
	삼각형의 밑변이 같으면 같은 삼각형이 되도록 정의하고
	밑변, 높이를 1~20 사이의 정수로 랜덤하게 만들어서
	삼각형을 두 개를 만들고
	만들어진 삼각형들을 비교해서(밑변) 같은지 여부를 출력하세요.--equals 오버라이드
	
	단, 3보다 작은 숫자가 발생하면 사용자 정의 예외를 만들어 처리. --Exception상속
	15보다 큰 숫자는 NuberFormatException으로 처리하세요.
	+
	클래스를 출력하면 클래스의 내용이 출력되게 함수를 오버라이드하세요.
	toString()오버라이드 함수를 오버라이드하세요.
 */
import javax.swing.*;
public class Ex02 {
	int[] size = new int[4];
	public Ex02() {
		for(int i = 0 ; i<4; i++) {
			int no = (int)(Math.random()*20+1);
			try {
				if(no<3) {
					throw new Exc12();
				}else if(no>15) {
					throw new NumberFormatException();
				}
				size[i]= no;
			}catch(NumberFormatException e) {
				i--;
				e.printStackTrace();
			}catch(Exc12 e) {
				i--;
				e.printStackTrace();
			}
		}
		
		Samgak sam1 = new Samgak(size[0], size[1]);
		Samgak sam2 = new Samgak(size[2], size[3]);
		
		String msg = sam1.equals(sam2)?"같음":"다름";
		System.out.print(msg);
	}
	public static void main(String[] args) {
		new Ex02();
	}
}

//--------------------------------------------

class Samgak{
	int width, height;
	double area;
	public Samgak() {}
	public Samgak(int width, int height) {
		this.width = width;
		this.height =height;
		setArea();
	}
	
	public void setArea() {
		area = width*height/2.0;
	}
	
	public boolean equals(Object o) {
		return this.width==((Samgak)o).width;
	}
}

//사용자 정의 예외처리
class Exc12 extends Exception {
	public String toString() {
		return "3보다 작은 수 발생";
	}	
}

//
