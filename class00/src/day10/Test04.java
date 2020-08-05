//★★★
package day10;
/*
정수 두 수를 입력받고 계산방식을 입력받아서
산술연산의 결과를 보여주는 프로그램을 작성하세요.

각 연산 별로 함수를 만들어서 처리한다.
*/
import java.util.*;
import javax.swing.*;
public class Test04 {
	int no1;
	int no2;
	int result;
	
	public Test04() {
		getNo();
	}
	
	public void getNo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력");
		no1 = sc.nextInt();
		
		System.out.print("숫자입력2");
		no2 = sc.nextInt();
		
//		System.out.print("연산부호 입력");
//		String san = sc.nextLine();
		
		String san = JOptionPane.showInputDialog("입력하세요");

		
		switch(san) {
		case "+":
			plus();
			System.out.println(result);
			break;
		case "-":
			minus();
			System.out.println(result);
			break;
		case "*":
			gop();
			System.out.println(result);
			break;
		case "/":
			nanum();
			System.out.println(result);
			break;
		case "%":
			namuge();
			System.out.println(result);
			break;
			
		}
		
	}
	
	public void plus() {
		result = no1+no2;
	}
	public void minus() {
		result = no1-no2;
	}
	public void gop() {
		result = no1*no2;
	}
	public void nanum() {
		result = no1/no2;
	}
	public void namuge() {
		result = no1%no2;
	}
	
	
	public static void main(String[] args) {
		new Test04();
	}
}
