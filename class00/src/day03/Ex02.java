//★★
package day03;
/*
	삼항연산자 문제
	
문제 2]
	세자리 숫자를 입력받아서
	그 수가 300보다 크면 "300보다 큰수"
	작으면 "300보다 작은수"
	가 출력되게 하세요.
*/
import java.util.*;
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("세숫자를 입력하세요");
		int no = sc.nextInt();
		sc.close();
		
		String str = (no>300) ? "300보다 큰 수 " : (no==300)? "300과 같은 수": "300보다 작은 수";

		System.out.printf("입력한 숫자 %3d는 %7s", no, str);
	}
}
