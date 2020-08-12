package day20;

import java.util.*;

public class Test10_01 {

	public Test10_01() {
		Vector v = new Vector();
		v.add("홍길동");
		v.add('M');
		v.add(18);
		v.add(178.5);
		
		//Vector는 매개변수를 Object로 받는다.. 자동형변환 일어남.
		for(int i = 0 ; i<v.size() ; i++) {
			System.out.print(v.get(i)+", ");
		}
		
		System.out.println();
		
		ArrayList list = new ArrayList(v);
		for(int i = 0 ; i<list.size() ; i++) {
			System.out.print(list.get(i)+", ");
		}
		System.out.println();
		v.addAll(2, list);
		
		for(int i = 0 ; i<v.size() ; i++) {
			System.out.print(v.get(i)+", ");
		}
	}

	public static void main(String[] args) {
		new Test10_01();
	}

}
