//★★
//ArrayList
package day21;
/*
 	함수를 만들어서
	1~10까지 랜덤한 숫자
	10개를 ArrayList에 담고
	출력하고
	정렬하고
	출력해보자.
 */

import java.util.*;
public class Test04 {

	public Test04() {
		viewList();
	}
	
	//ArrayList 만들고 출력해주는 함수
	public void viewList() {
		//1. ArrayList를 준비한다.
		ArrayList list = new ArrayList();
		//2. 랜덤하게 숫자를 만들고 담는다 10번
		for(int i = 0 ; i<10 ; i ++) {
			//숫자 만들고
			int no = (int)(Math.random()*10+1);
			//list에 담고
			list.add(no);
		}
		//3. 출력하고
		for(Object o : list) {
			System.out.print((int)o + ", ");
		}
		System.out.println();
		System.out.println("###############################");
		
		//4. 정렬하고
		Collections.sort(list);
		//5. 출력하고
		for(Object o : list) {
			System.out.print((int)o + ", ");
		}
		System.out.println();
		System.out.println("###############################");
		
		
		//6. 내림차순 정렬을 해보자!
		Collections.reverse(list); //sort오름차순 정렬 후 reverse... 내림차순정렬은 없는 듯;
		//7. 출력
		for(Object o : list) {
			System.out.print((int)o + ", ");
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
