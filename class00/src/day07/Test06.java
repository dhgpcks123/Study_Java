//★★
package day07;

/*
1 ~ 45 까지의 숫자 여섯개를 저장할 배열을 만들고 오름차순 정렬하세요.
중복 숫자는 없는 것으로 한다.
*/
import java.util.*;
public class Test06 {
	public static void main(String[] args) {
	
		//숫자 여섯개를 저장할 배열을 만든다.
		
		int[] lotto = new int[6];
		
		//1~45까지의 숫자를 추출해 초기화한다.
		
		loop:
		for(int i = 0 ; i <lotto.length ; i++) {
			int ran = (int)(Math.random()*(45-1+1)+1);
			//중복된 숫자가 나오면 취소하고 그 회차부터 다시 한다.
			for(int j = i+1 ; j<i ; j++) {
				if(lotto[j] == ran
						) {
					--i;
					continue loop;
				}
			}
				lotto[i] = ran;	
		//내용확인
		//중요한 건 숫자가 중복되면 안된다...
		}
		System.out.print(Arrays.toString(lotto));
		
		//오름차순으로 만들어줘라.
		//변수하나씩 빼와서 for문으로 하나씩 돌려서 체크
		// for/for 향상for/ for 두 가지 다 해봐
		for(int i = 0 ; i<lotto.length-1 ; i++) {
			for(int j = i+1 ; j<lotto.length ; j++) {				
				if(lotto[i]<lotto[j]) {
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
					
					
				}
			}
			
		}
		System.out.println(Arrays.toString(lotto));
		
	}
}
