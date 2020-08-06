//★
//전역내부클래스
package day16;

public class InnerClass01 {
	public InnerClass01() {
		
		//전역내부 클래스 Test03의 변수와 함수를 사용해보자.
		//외부클래스 먼저 객체 생성해준다.
		Prac01 t = new Prac01();
		//전역내부클래스 객체 생성해준다.
		Prac01.Prac03 t03 = t.new Prac03();
		//
//		t.Test03 t04 =t.new Test03(); 데이터타입이기때문에? 객체 t 넣기x
//		Test01.Test03 t05 = Test01.new Test03(); Test01? 객체 생성 안되어있음.
		Prac01.Prac03 t06 = new Prac01().new Prac03(); //한방에도 가능하다!
		
		//Test03도 객체생성이 완료된 상태이다.
		//Test01.Test03 모두 객체생성 완료된 변수는 t03과 t06
		
		t03.a=15;
		System.out.println(t03.a);
		t06.abc();

	}
	
	public static void main(String[] args) {
		new InnerClass01();
	}

}

//-전역내부 클래스-----------------------------------------------------------

class Prac01{
	class Prac03{

		int a;
		void abc() {
			
			System.out.println("abc함수입니다.");
		}
//		static int b;	//정적(static) 필드 사용할 수 없음
//		static void xyz() {	//정적(static) 함수 사용할 수 없음.
//			System.out.println("xyz함수입니다.");			
//		}
	}
	
}