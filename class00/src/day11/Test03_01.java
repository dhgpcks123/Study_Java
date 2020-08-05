//★★★
package day11;

public class Test03_01 {
	public Test03_01() {
		
		//Circle 데이터 세개를 들어보자.
		Circle c01 = new Circle();
		//c01의 원의 반지름을 출력해보자.
		System.out.println(c01.rad);
		System.out.println(c01.arround);
		//반지름을 입력해보자
		c01.rad = 10;
		//c01의 원의 반지름을 출력해보자.
		System.out.println(c01.rad);
		System.out.println(c01.arround);
		
		//함수를 통해서 모든 변수의 데이터를 셋팅해봦.
		c01.setRad(7);
		System.out.println(c01.rad);
		System.out.println(c01.arround);
		
		//두 번째 원을 만들어서 반지름을 3으로 하는 원으로 셋팅하자.
		Circle c02 = new Circle();
		c02.setRad(3);
		System.out.println(c02.rad);
		System.out.println(c02.arround);
		
		Circle c03 = new Circle();
		c03.setRad(15);
		System.out.println(c03.rad);
		System.out.println(c03.arround);
		
		//출력
		
	}
	public static void main(String[] args) {
		new Test03_01();
		
	}
}
