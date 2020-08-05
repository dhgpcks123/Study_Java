//★★★
package day07;

import java.util.*;

public class Test02 {
	public static void main(String[] args) {
		// 1부터 5까지 정수를 저장할 배열 num을 만들고 초기화 하세요.
		
//		int[] num = {1,2,3,4,5};
		
		int[] num = new int[] {1, 2, 3, 4, 5,};
		
		//배열의 길이를 출력
		System.out.println("num의 길이 : "+ num.length);
		
		//배열에 저장된 세 번째 데이터 출력
		System.out.println("num의 세 번재 데이터 : " + num[3]);
		
		//배열의 내용 확인
		System.out.println("num : "+ Arrays.toString(num));
		
		//배열에 저장된 데이터를 하나씩 출력하기
		
		for(int i = 0 ; i< num.length; i++) {
			System.out.print(num[i]+" /");
		}
		
		//향상된 for문 사용
		for(int no: num) {
			System.out.print(no+" v");
		}
			System.out.println();
	//------------------------------------------------------------
		String str = "가나다라마바사";
		//문자열을 배열방식으로 담는 것도 있다. 도대체 이런 거는 왜 한번 스윽 얘기하고 넘어가는거야!?
		char[] chArr = str.toCharArray();

		System.out.println(Arrays.toString(chArr));
		for(char ch : chArr) {
			if(ch == '라') { // '라'를 건너뛰고 출력
				continue;
			}
			System.out.print(ch +";");
			if(ch == '라') { // '라'까지만 출력
				break;
			}
			System.out.print(ch +";");
		}
	}
}
