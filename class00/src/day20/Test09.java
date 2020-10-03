//★★
//capacity와 size, Vector*2
package day20;

import java.util.*;
public class Test09 {

	public Test09() {
		Vector vec = new Vector();
		
		int size = vec.size();
		System.out.println(size);
		int capacity = vec.capacity();
		System.out.println(capacity);
	
		for(int i = 0 ; i<10 ; i++) {
			vec.add(10);
		}
		int len = vec.capacity(); //데이터 입력 가능한 공간수.
		System.out.println(len);
		vec.add(10);
		len = vec.capacity(); //데이터 입력 가능한 공간수.
		System.out.println(len);
		System.out.println("---------------------------");
		
		Vector vecT = new Vector(20, 5);
		System.out.println("1. "+ vecT.capacity());
		for(int i = 0 ; i<21 ; i++) {
			vecT.add(10);
		}
		System.out.println(vecT.size());
		System.out.println("2. "+ vecT.capacity());
		
		for(int i = 0 ; i<5 ; i++) {
			vecT.add(10);
		}
		System.out.println(vecT.size());
		System.out.println("3. "+ vecT.capacity());
	}
	
	public static void main(String[] args) {
	new Test09();	
	}
}
