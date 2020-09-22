package day29.thread;

public class TC01 extends Thread {
		
	public TC01(String name) {
		super(name);
	}
	
		@Override
		public void run() {
			for(int i = 0 ; i <100 ; i ++) {
				String str = Thread.currentThread().getName();
			System.out.println(str+"는 공부를 합니다"+(i+1));
			
			try {
				Thread.sleep(3000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			}
			
		}
	
}
