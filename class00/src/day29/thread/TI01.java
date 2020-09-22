package day29.thread;

public class TI01 implements Runnable {

	boolean isStop = true;
	
	@Override
	public void run() {
		for(int i = 0;isStop; i ++) {
			String str = Thread.currentThread().getName();
			System.out.println(str+"가 공부합니다"+(i+1));
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	

}
