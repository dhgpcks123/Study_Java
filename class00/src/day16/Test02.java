//★★★
//전역 내부 클래스
package day16;
/*
	전역 Inner Class
 */

public class Test02 {
	public Test02() {
		Test02_01 t1 = new Test02_01();
		t1.abc();
//		t1.xyz(); 안됨.
//		t1.Inner01.xyz(); 당근 안됨!
// 전역내부클래스 쓰려면 속해있는 클래스 new시켜주고.
		//전역내부클래스도 new시켜줘야함. 객체생성해줘야함.
		Test02_01 in = new Test02_01();
		Test02_01.Inner01 inn = in.new Inner01();
		//--
		inn.xyz();
		
		Test02_01.Inner01 in01= new Test02_01().new Inner01();
		in01.xyz();
	}
	
	
	public static void main(String[] args) {
		new Test02();
	}
}

class Test02_01{
	int no = 100;
	void abc() {
		System.out.println("여기는 테스트공이다시공일");
		Inner01 in = new Inner01();
		in.xyz();
		
		//여기서 중요한 거는 전역내부클래스가 담긴 클래스에서
		//전역내부클래스를 쓰려면 전역내부클래스 객체생성해줘야한다.
		//즉 new해줘야한다.
	}
	
	//전역 내부클래스
	class Inner01{
		int num = no*2;
		void xyz() {
			System.out.println("여기는 이너공일");
		}
	}
	
}