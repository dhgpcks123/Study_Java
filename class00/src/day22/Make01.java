//★
package day22;
/*
 * HashSet을 연습할거야.
 * 반지름 랜덤으로 추출해서 
 * 클래스 Make01_Dongle에다가 반지름으로 넓이, 둘레 구하게하고
 * 10개 넣고, 출력해봐.
 */
import java.util.*;
import day22.source.*;
public class Make01 {

	public Make01() {
		HashSet set = new HashSet();
		for(int i = 0 ; i<10 ; i ++) {
			set.add(setData());
		}
		
		//1.ArrayList 쓰는거랑
		ArrayList list  = new ArrayList(set);
		for(int i = 0 ; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		//2.Iterator
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		//3.향상for문
		for(Object o:set) {
			System.out.println(o);
		}
		
		
	}

	//반지름 넣으면 원의 데이터를 만들어주는 함수
	public Make01_Dongle setData() {
		return new Make01_Dongle((int)(Math.random()*10));
		
	}
	
	
	public static void main(String[] args) {
		new Make01();
	}

}
