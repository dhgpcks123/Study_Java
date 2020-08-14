//★★
package day22;

import java.util.*;

public class Test06 {

	public Test06() {
		TreeSet set = new TreeSet();
//		set.add(1);
//		set.add(3);
//		set.add(300);
//		set.add(33);
//		set.add(303);
//		set.add(13);
//		set.add(3);
//		
		set.add("고길동");
		set.add("둘리");
		set.add("고길동"); //중복
		set.add("희동이");
		set.add("철수");
		set.add("영희");
		set.add("마이콜");
		set.add("또치");
		set.add("도우너");
		set.add("마이콜");
		System.out.println("set.size()"+ set.size());
		
		
		for(Object o : set) {
			System.out.print(o+" | ");
		}
		System.out.println("---------------------------------------");

		
		SortedSet set1 =set.headSet("또치");
		System.out.println("set1.size() : "+ set1.size());
		for(Object o : set1) {
			System.out.print(o+" | ");
		}
		
		//set.add("또  치")로 입력되어있으면 또 또치까지는 출력한다????
		System.out.println();
		
		SortedSet set2 = set.subSet("둘리",  "마이콜");
		System.out.println("set2.size() : "+ set2.size());
		for(Object o : set2) {
			System.out.print(o+" | ");
		}
		System.out.println();
		SortedSet set3 = set.tailSet("마이콜");
		System.out.println("set3.size() : "+ set3.size());
		for(Object o : set3) {
			System.out.print(o+" | ");
		}
		
		
		
	}

	public static void main(String[] args) {
		new Test06();
	}

}
