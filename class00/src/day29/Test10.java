package day29;
//public int num을 main클래스에 선언하고 한 클래스엔 숫자 채우기를,
//또 다른 클래스엔 숫자 읽기를..
import day29.thread.*;
public class Test10 {

	public int num;
	
	public Test10() {
		//New Born
		Trd101 t1 = new Trd101(this);
		Trd102 t2 = new Trd102(this);
		
		//runnable;
		t1.start();
		t2.start();
		
		
	}

	public static void main(String[] args) {
		new Test10();
	}

}
