//★★
package day20;

import java.util.*;

public class Test10_01 {

	public Test10_01() {
		Vector v = new Vector();
		v.add("홍길동"); //Vector는 Object타입이어서 String도 담을 수 있고
		v.add('M'); //char타입도 담을 수 있고
		v.add(18); //Integer타입도 담을 수 있고
		v.add(178.5); //double타입도 담을 수 있고
		
		//Vector는 매개변수를 Object로 받는다. 자동형변환 일어남.
		for(int i = 0 ; i<v.size() ; i++) {
			System.out.print(v.get(i));
		}
		
		System.out.println();
		ArrayList list = new ArrayList(v);
		//ArrayList로 변환가능 왜냐하면 얘도 리스트계열에 속해있거든.
		//같은 걸 상속받고 있다.
		for(int i = 0 ; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		
		System.out.println();
		v.addAll(2, list); //2번부터 list 넣는
		for(int i = 0 ; i<v.size() ; i++) {
			System.out.print(v.get(i));
		}
		//홍길동M 홍길동M18178.5 18178.5
		//뒤에꺼 밀어내고 사이에 끼어넣는다.
		
	}

	public static void main(String[] args) {
		new Test10_01();
	}

}
