//★★
//toString함수, Arrays.toString;
package day14;

import static java.lang.Math.*;

import java.util.Arrays;
public class Test01 {
	public Test01() {
		Test01_01 t = new Test01_01();
		System.out.println(t);
		System.out.println(t.gerRnd());
	}
	public static void main(String[] args) {
		new Test01();
	}
}
//-------------------------------------------------
class Test01_01{
	int no =100;
	int[] noArr = {15, 20, 30, 50};
	public int gerRnd() {
		System.out.println(Arrays.toString(noArr));
		return (int)(random()*13+3);
	}
	
	public String toString() {
		return "이건 클래스 호출하면 toString먼저 출력함";
	}
}