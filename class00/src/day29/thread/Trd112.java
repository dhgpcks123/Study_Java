package day29.thread;

import day29.*;
public class Trd112 extends Thread {
	
	Test11 main;
	public Trd112(Test11 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		System.out.println("\t\t***** Read Start *****");
		synchronized(main.num) {

			for(int i =0 ; i <5; i ++) {
				int no = main.num[i];
				System.out.println("\t\t"+no+"를 읽었다.");
				int sec = (int)(Math.random()*1501 + 500);
				try {
					Thread.sleep(sec);
				} catch(Exception e) {}

			}
			System.out.println("\t\t +++++ 변수 사용 종료 +++++");

		}
	}

}
