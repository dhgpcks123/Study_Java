//★★
package day15;
/*
문제 1 ]
	
	랜덤하게 숫자를 발생시켜서
	숫자가 홀수이면 - Odd01
		"홀수 클래스"
	짝수이면		- Even01
		"짝수 클래스"
	출력이 되도록
	
	Type01 클래스를 상속받은 클래스를 각각 정의하고
	함수를 오버라이드해서 처리하세요.
*/
public class Ex01 {

	public Ex01() {
		Type01 ev =	new Even01();
		Type01 od = new Odd01();
		
		int ran = (int)(Math.random()*50+1);
		if(ran%2==0) {
			ev.display();
		}else {
			od.display();
		}
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}

abstract class Type01{
	public abstract void display();
}

class Odd01 extends Type01{
	public Odd01(){}

	public void display() {
		System.out.println("홀수 클래스");
	}
}
class Even01 extends Type01{
	public Even01() {}
	public void display() {
		System.out.println("짝수 클래스");
	}
}
