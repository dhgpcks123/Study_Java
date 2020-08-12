//★★
package day20;

import java.util.*;
public class Test09_01 {

	public Test09_01() {
		Vector vec1 = new Vector();
		for(int i = 0 ; i<9 ;i ++) {
			vec1.add(10);
		}
		//10 10 10 10 10 10 10 10 10 10
		System.out.println(vec1.size()); //> 
		System.out.println(vec1.isEmpty()); // 비어있냐? .isEmpty() 함수도 있넹
		System.out.println(vec1.capacity()); //capacity수용성
		
		System.out.println("--------------------------");
		vec1.add("문자열하나넣음 Object타입이라서 가능");
		vec1.add("한개 더 넣음 그럼 11개가 되어야될텐데!");
		System.out.println(vec1.size()); //> 
		System.out.println(vec1.capacity()); //capacity수용성
		//size는 11이 되었고, capacity는 *2가 되어서 20이 되었음.
		
		
		
	}
	public static void main(String[] args) {
		new Test09_01();
	}

}
