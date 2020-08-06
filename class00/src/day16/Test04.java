//★
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
	int no =100;		// 전역변수
	void abc() {
		System.out.println("여기는 Inner03");
//		LocalClass l1 = new LocalClass(); //절대 안됨... 함수 빠져나가는 순간 없어짐
	}
	
	void xyz() {
		int num =55;	// 지역변수
		
		class LocalClass {
			int soo = 1000;
			int ddd() {
				System.out.println("Inner03.xyz.LocalClass");
				return soo;
			}
		}
		int num2 = new LocalClass().ddd();
		
		System.out.println("xyz.LocalClass.ddd()"+ num2);
	}
}