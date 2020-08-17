//★★
package day23;
/*
	ArrayList에 문자열 데이터만 입력하도록
	제너릭스를 선언해서 처리해보자.
 */
import java.util.*;
public class Test04 {
	public Test04() {
		ArrayList<String> list = new ArrayList<String>();
		// 이제 이 리스트는 문자열이 아닌 다른 데이터가 입력이 되면 에러가 발생한다.
		// 문자열만 입력받도록 선언을 해놓았으므로...
		/* 다 에러남.
		list.add(10);
		list.add('A');
		list.add(3.14);
		list.add(true);
		*/
		list.add("윤요셉");
		list.add("유병욱");
		list.add("오혜찬");
		
		//꺼내서 출력한다.
		for(int i = 0 ; i<list.size(); i++) {
			String name = /*(String)*/list.get(i); 
			System.out.println((i+1)+"번 : "+name);
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
