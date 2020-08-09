//★★
//인터페이스 구현해서 출력해보기.
package day15;

public class Test06 {

	public Test06() {
		System.out.println(Inter01.num);
//		Inter01.display();
		//변수는 static에 올려져있기 때문에 그냥 쓸 수 있음.
		//함수는... static에 올려도 구현이 안되어있네. 쓸 수 없음.
		//오버라이드 필수
		Inter01 t = new Test06_01();
		t.display();
		
		
	}

	public static void main(String[] args) {
	new Test06();
	}
}

//Inter01을 구현해보자.
class Test06_01 implements Inter01{
	
	@Override
	public void display() {
		System.out.println("인터01을 구현한 Test06_01클래쓰");
	}
	
}
