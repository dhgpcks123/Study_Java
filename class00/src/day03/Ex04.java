//★★
package day03;

/*
년수를 입력받아서
그 해가 윤년인지 평년이지 판별해서 출력하세요.

참고 ]
	윤년 : 4로 나누어 떨어지고 100으로 나누어 떨어지면 안되고
			400으로 나누어 떨어지는 해는 윤년이다.
	
	1300년 : 평년
	1200년 : 윤년
	 1. 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고,
	 2. 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며,
	 3.  다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다.
*/
import java.util.*;
public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요");
		int year = sc.nextInt();
		sc.close();
		
		int tmp = year;
		
		String str = (year%4 ==0)?(year%100==0?(year%400==0?"윤년":"평년"):"윤년"):"평년";
		
		System.out.printf("입력한 년도 [ %4d ] 년은 %2s입니다.", tmp, str);
		//아니 내가 왜 윤년 개념을 이해하고 있어야되냐고!!!
	}
}
