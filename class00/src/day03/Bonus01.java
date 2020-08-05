//★★
package day03;
/*
Bonus ]
	3자리 숫자(100 ~ 999)를 입력받아
	이 숫자에서 가장 가까운 100의 배수를 만들기 위해서는
	얼마가 필요한지를 계산해서 출력하는 프로그램을 작성하세요.
	
	출력 예 ]
		
		241 : 200이 가까우므로 41을 빼야 한다.
		365 : 400이 가까우므로 35를 더해야 한다.
*/
import java.util.*;
public class Bonus01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3자리 숫자를 입력하세요 : ");
		int no = sc.nextInt();
		sc.close();
		
		int num = (no%100>=51)
					? no+(100-no%100)
					: no-(no%100);
	String str = (no%100>=51)
					? (100-no%100) +"를 더해야"
					: no%100 +"를 빼야";
	System.out.printf("랜덤하게 발생한 세자리 숫자 %3d 는 %3d와 가까우므로 %9s 한다.", no, num, str);

					
	}

}
