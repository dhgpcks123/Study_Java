package day29;
//stop안쓰고 stop시켜야해 앞으로 이렇게 할꺼임
//8번하고 같은데 클래스통신하면서 stop시키는방법
import day29.thread.*;
public class Test09 {

	public Trd091 t1;
	public Trd092 t2;
	public Test09() {
		t1 = new Trd091(this);
		t2 = new Trd092(); // New Born 상태
		
		// == > Runnable 상태로 전이
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test09();
	}

}
