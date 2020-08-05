//★★
package day03;
/*
문제 ]
	두 수를 입력받아서 각각 변수에 담고
	첫번째 수가 두번째 수보다 크면 "양수"
	첫번째 수가 두번째 수보다 작으면 "음수"
	를 출력하세요.
	
	삼항 연산자를 사용해서 처리하세요.
*/
import java.util.*;
public class Ex01 {
public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	System.out.print("숫자를 두 번 입력하세요");
	int no1 = sc.nextInt();
	
	int no2 = sc.nextInt();

	sc.close();
	
	System.out.println(no1>no2 ? "양수": "음수" );
	String str = no1>no2 ? "양수" : "음수";
	//출력되는 값이 문자열이라서 String으로 변수 선언해줌!
	System.out.println(str);
}
}
