//★★★
package day02;
/*
2. 	하나의 숫자(반지름)를 입력 받은 후
	그 숫자를 이용해서 원의 넓이와 둘레를 구해서 
	출력해주는 프로그램을 작성하세요.
*/

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자입력해");
		int ban = sc.nextInt();
		float pi = 3.14f;
		sc.close();
		
		double arround = 2*ban*pi;
		double area = pi*ban*ban;
		
//		System.out.printf("반지름 %3d, 넓이 %3.2f, 둘레 %3.2f", ban, area, arround);
		
		System.out.printf("*** 반지름이 %3d 인 원 ***\n\t%5s: %6.2f\n\t%5s: %5.2f", 
				ban, "둘레", arround, "넓이", area);
	}
}
