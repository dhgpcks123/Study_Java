//★★
//final 함수 오버라이딩
package day14;

public class Test06 {
	public Test06() {
		Test06_02 t1 =new Test06_02();
		t1.abc(); // 밑에 없는데도 값이나옴. 상속하면 다 가져온거거든.
	}

	
	public static void main(String[] args) {
		new Test06();
	}
}
//-----------------------------------------
class Test06_01{
	final void abc() { //final붙은 함수 오버라이드 안됨.
		System.out.println("전은석 선생님 최고");
	}
}
//final붙은 변수, 초기화불가능/ final붙은 클래스, 상속불가능

class Test06_02 extends Test06_01{
	public final int MAX =1000;
	
	/*
	void abc() {
		System.out.println("요셉쒸 최고.");
	} 오버라이드가 안됨. abc()속성 final임
	*/
}