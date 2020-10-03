package day21test;

import java.util.Vector;

public class Test02 {

	public static void main(String[] args) {
		Vector vec = new Vector();
		
		for(int i = 0; i <3 ; i++) {
			Circle c = new Circle();
			int rad = (int)(Math.random()*13+3);
			c.setRad(rad);
			c.setArround();
			c.setArea();
			
			vec.add(c);
		}
		for(int i = 0 ; i<vec.size();i++) {
			System.out.println(vec.get(i));
		}
	}

}
