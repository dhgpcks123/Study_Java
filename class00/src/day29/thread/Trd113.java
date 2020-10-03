package day29.thread;

import day29.*;
public class Trd113 extends Thread {
	Test11 main;
	public Trd113(Test11 main) {
		this.main = main;
	}
	
	public void run() {
		synchronized(main.num) {
		for(int i = 0; i <50 ; i++) {
			System.out.println("||3번 테스트||");
			int sec = (int)(Math.random()*1501 + 500);
			try {
				Thread.sleep(sec);
			} catch(Exception e) {}
		}
		}
	}
}
