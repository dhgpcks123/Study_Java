package day20;

import java.util.*;
public class Test09_01 {

	public Test09_01() {
		Vector vec = new Vector(20);
		System.out.println("1. "+vec.capacity());
		
		for(int i = 0 ; i<21 ; i++) {
			vec.add(10);
		}
		System.out.println("2. "+vec.capacity());
		
	}

	public static void main(String[] args) {
		new Test09_01();
	}

}
