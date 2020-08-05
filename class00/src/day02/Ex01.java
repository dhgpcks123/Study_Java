//★★★
package day02;
/*
1. 	두개의 숫자를 입력받은 후
	두 수를 이용해서 사각형, 삼각형의 넓이를 구해서 
	출력해주는 프로그램을 작성하세요.
*/
import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력해");
		int no = sc.nextInt();
		System.out.println("숫자 또 입력해");
		int no2 = sc.nextInt();
		
		
		System.out.println("삼은 삼 사는 사");
		int type = sc.nextInt();
		sc.close();
		
		
		if(type==3) {
			System.out.print(no*no2/2f);
		}
		
		if(type==4) {
			System.out.println(no*no2);
		}
	}
}
