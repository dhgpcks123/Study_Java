package day29;
//인터페이스로 스레드구현하기
import day29.thread.*;
public class Test02 {

	public Test02() {
		//Runnable 인터페이스를 구현한 경우에는 조금 다르다.
		
		//1. 클래스를 new시킨다.
		Trd021 t01 = new Trd021();
		Trd022 t02 = new Trd022();
		/*
			지금 t01, t02는 아직 New Born 상태가 아니다.
			일반적으로 클래스를 사용하기 위해서 new 시킨것과 같다.
			따라서
			Runnable은 아직 Thread가 아니다.
		 */
		
		//2. Thread를 각각 만든다.
		Thread t1 = new Thread(t01);
		Thread t2 = new Thread(t02);
		
		//이제 드뎌 Thread가 만들어졌고 New Born 상태가 되었다.
		
		//3. Runnable로 전위시킨다.
		t1.start();
		t2.start();
		
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}