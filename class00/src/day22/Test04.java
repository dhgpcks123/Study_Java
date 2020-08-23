//★★★
//TreeSet
package day22;

import java.util.*;
import day22.source.*;

public class Test04 {

	public Test04() {
		TreeSet set = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				/*
				Circle c1 = (Circle)o1;
				Circle c2 = (Circle)o2;
				return c1.getArea() - c2.getArea()>0?1:(c1.getArea() - c2.getArea()==0)?0:-1;
				 */
				
				return ((Circle)o1).getRad()-((Circle)o2).getRad();
			}
			
		});
		set.add(new Circle((int)(Math.random()*16+5)));
		set.add(new Circle((int)(Math.random()*16+5)));
		set.add(new Circle((int)(Math.random()*16+5)));
		set.add(new Circle((int)(Math.random()*16+5)));
		set.add(new Circle((int)(Math.random()*16+5)));
		
		for(Object o : set) {
			System.out.println(o);
		}
	}
	
	

	public static void main(String[] args) {
		new Test04();
	}

}
