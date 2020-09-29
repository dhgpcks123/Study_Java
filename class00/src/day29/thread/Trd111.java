package day29.thread;

import day29.*;
public class Trd111 extends Thread {
	Test11 main;
	
	public Trd111(Test11 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		
		synchronized(main.num) {
			for(int i = 0 ; i <5 ; i ++) {
				int no = (int)(Math.random()*100+1);
				main.num[i] = no;
				System.out.println(no + " 를 기억했습니다.");
	
				int sec = (int)(Math.random()*(2000-500+1)+500);
				
				try {
					Thread.sleep(sec);
				}catch(Exception e) {}
			}
		}
		System.out.println("#저장완료#");
	}
}
