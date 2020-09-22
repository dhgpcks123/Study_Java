package day29;

import day29.thread.*;
public class Test {

	public TI01 t01;
	public Thread T1;
	public Test() {
//		TC01 t01 = new TC01("오혜찬");
//		TC02 t02 = new TC02("민영");
//		
//		t01.start();
//		t02.start();
		
		t01 = new TI01();
		TI02 t02 = new TI02(this);
		
		T1 = new Thread(t01, "오혜찬");
		Thread T2 = new Thread(t02, "민영이");
		
		T1.start();
		T2.start();
		
	}

	public static void main(String[] args) {
		new Test();
	}

}
