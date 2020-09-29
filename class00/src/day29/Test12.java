package day29;

import day29.thread.*;
public class Test12 {

	public Test12() {
		Trd121 t1 = new Trd121(this, "장성환");
		Trd122 t2 = new Trd122(this, "\t\t이지우");
		
		t2.start();
		t1.start();
	}
	
	public synchronized void abc() {
		String name = Thread.currentThread().getName();
		System.out.println(name +"스레드가 abc함수를 사용하기 시작했다.");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {}
		System.out.println(name +"스레드가 abc함수 사용을 중단합니다.");
	}
	
	public synchronized void xyz() {
		String name = Thread.currentThread().getName();
		System.out.println(name+"스레드가 xyz 함수를 사용하기 시작합니다");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {}
		System.out.println(name+"스레드가 abc함수 사용을 중단하빈다.");
	}

	public static void main(String[] args) {
		new Test12();
	}

}
