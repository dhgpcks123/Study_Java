package day29;

import day29.thread.*;

public class Test10 {
	public int num;
	
	public Test10() {
		Trd101 t1 = new Trd101(this); //객체생성	
		Trd102 t2 = new Trd102(this); //객체생성
		// new Born상태임.
		//Runnable상태로 만들어줘야해.
		
	
			t1.start();
			t2.start();
	
	}
	
	
	public static void main(String[] args) {
		new Test10();
	}

}
