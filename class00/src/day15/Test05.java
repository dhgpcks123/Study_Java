//★★
//Calender 클래스 이런게 있다 보여주고 싶었나본데....
package day15;

import java.util.*;

public class Test05 {
	public Test05() {
		Calendar caly = Calendar.getInstance();
		System.out.println(caly.YEAR);
		
		Calendar calm = Calendar.getInstance();
		System.out.println(calm.MONTH);
		
		Calendar cald = Calendar.getInstance();
		System.out.println(cald.DATE);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.DAY_OF_MONTH);
	}
	public static void main(String[] args) {
		new Test05();
	}

}

