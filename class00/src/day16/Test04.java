//★★★★
//지역 내부클래스
package day16;

public class Test04 {
	public Test04() {
		Inner03 in03 = new Inner03();
		in03.xyz();
		
	}
	public static void main(String[] args) {
	new Test04();	
		
	}
}

class Inner03{
	int no =100; //전역변수.. 필드라고 부르자.
	void abc() {	//메서드
		System.out.println("여기는 이너03");
//		LocalClass l1 = new LocalClass();
		//안됨. 함수 벗어나는 순간 없는 클래스임.
	}
	void xyz() {
		int num =55;	//여기는 지역변수;
		
		class LocalClass{
			int soo =  1000;
			int ddd() {
				System.out.println("Inner01.xyz.localClass");
				return soo;
			}
		}
		
		int num2= new LocalClass().ddd();
		
		System.out.println("여기꺼 밖에서 쓸 수 있따"+num2);
		//지역내부클래스는 함수내. 그니까 지역내에서 사용된다.
		
	}
	
}