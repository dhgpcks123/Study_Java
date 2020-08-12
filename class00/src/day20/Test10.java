package day20;

import java.util.*;
public class Test10 {

	public Test10() {
		Vector v = new Vector();
		for(int i = 0 ; i <5 ; i++) {
			int no = (int)(Math.random()*10+1);
			v.add(no);
		}
		
		
		System.out.print(v.get(0)+", ");
		System.out.print(v.get(1)+", ");
		System.out.print(v.get(2)+", ");
		System.out.print(v.get(3)+", ");
		System.out.print(v.get(4)+", ");

		System.out.println();
		
		
		for(int i = 0 ; i <v.size() ; i ++) {
			System.out.print(v.get(i)+", ");
		}
		System.out.println();
		for(int i = 0 ; i <v.size() ; i ++) {
			System.out.print((int)v.get(i)+i+", ");
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
