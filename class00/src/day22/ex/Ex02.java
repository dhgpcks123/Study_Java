package day22.ex;
/*
	문제 2 ]
		랜덤한 숫자 10개를 발생시켜서(11~99) TreeSet에 저장하고 출력하고
		정렬방식을 내림차순으로 변경해서 저장해서 출력하고...
		
 */
import java.util.*;
public class Ex02 {

	public Ex02() {
		//TreeSet 객체생성해서
		TreeSet set = new TreeSet();
		
		//랜덤한 숫자 10개를 발생시켜서 set.add로 넣고
		for(int i = 0 ; i<10 ;i ++) {
			set.add((int)((Math.random()*99-11+1)+11));
		}
		
		//출력을 해보자
		for(Object o : set) {
			System.out.print(o+", ");
		}
		
		//정렬방식을 내림차순으로 변경해서 저장해보자.
		Compara
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
