//★★
//Vector(int a, int b)
package day20;

import java.util.*;
public class Test09_02 {

	public Test09_02() {
		Vector vec = new Vector(20, 5);
		System.out.println("1. "+ vec.capacity());
		for(int i = 0 ; i<21 ; i++) {
			vec.add(10);
		}
		System.out.println(vec.size());
		System.out.println("2. "+ vec.capacity());
		
		for(int i = 0 ; i<5 ; i++) {
			vec.add(10);
		}
		System.out.println(vec.size());
		System.out.println("3. "+ vec.capacity());
		
	}

	public static void main(String[] args) {
		new Test09_02();
	}

}
