package day29.thread;

public class TC02 extends Thread {
	
	public TC02(String name) {
		super(name);
	}
	
	public void run() {
		String str = Thread.currentThread().getName();
		for(int i = 0 ; i <100 ; i++) {
			System.out.println(str+"가 공부를 뿌뿠합니다.");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
