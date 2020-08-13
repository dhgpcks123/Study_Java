//★
//Vector클래스와 toString오버라이딩
package day21;

import java.util.*;
public class Test03 {

	public Test03() {
		Vector vec = new Vector();
		vec.add(100);
		vec.add(100);
		vec.add(100);
		vec.add(100);
		vec.add(100);
		vec.add(100);
		vec.add(100);
		
		System.out.println(vec);
		//Vector에 toString함수 오버라이딩해놨다는 말이겠쥐

		
		int[] num = {100, 100, 100, 100, 100, 100, 100};
		System.out.println(num);
		System.out.println(Arrays.toString(num));
		
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
