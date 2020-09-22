package day29.thread;

import day29.Test;
public class TI02 implements Runnable {
	
	Test main; 
	public TI02(Test main) {
		this.main = main;
	}
	@Override
	public void run() {
		
		String str = Thread.currentThread().getName();
		for(int i = 0 ; i <10 ; i ++) {
			System.out.println(str+"는 뿌뿌 합니다"+ (i+1));
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		main.t01.isStop = false;
	}

	
	

}
