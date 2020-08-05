//★★
package day03;
/*
삼항연산자 문제
	문제 3]
		정수 세개를 입력 받아서
		제일 큰수부터 출력하세요.
		
힌트 ]
	
	삼항 연산자도 중첩해서 사용할 수 있다.
	
		() ? (삼항연산자) : (삼항연산자);
*/
import java.util.*;
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해");
		int no1 = sc.nextInt();
		System.out.print("정수를 입력해");
		int no2 = sc.nextInt();	
		System.out.print("정수를 입력해");
		int no3 = sc.nextInt();
		
		int max = (no1>no2)?
							(no1>no3)?no1
									:no3
				:(no2>no3)?no2
						:no3;
					
		int mid = (no1>no2)?
							(no2>no3)? no2
									:(no1>no3)?no3:no1			
				:(no3<no1)? no1
						:no2>no3?no3:no2;
				
				
				
		int min = (no1<no2)?
							(no1<no3)?no1
									:no3
				:(no2<no3)?no2
						:no3;
		
		System.out.println("큰수" + max+ "중간수"+mid+"작은수"+min);
	}
}

