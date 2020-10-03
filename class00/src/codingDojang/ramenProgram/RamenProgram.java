package codingDojang.ramenProgram;

public class RamenProgram {

	public static void main(String[] args) {
		try {
			RamenCook ramenCook = new RamenCook(30);
			
//				RamenCook ra1 = new RamenCook(5);
//				Thread t = new Thread(ra1, "이름설정");
//				t.start();
		  		
				//Runnable은 start함수가 없기 때문에 Thread클래스에 넘겨준 후 start시켜줘야한다.
				//그걸 한 줄로 쓴 게 아래 문장이고, 뒤에 대문자는 Thread이름 준거임.
			new Thread(ramenCook, "A").start();
			
			new Thread(ramenCook, "B").start();
			new Thread(ramenCook, "C").start();
			new Thread(ramenCook, "D").start();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	}



class RamenCook implements Runnable{
	
	private int ramenCount;
	private String[] burners = {"_", "_", "_", "_"};
	
	public RamenCook(int count){
		
		ramenCount = count;
	}

	
	
	@Override
	public void run() {
		while(ramenCount>0) {
			
			synchronized(this) {
				ramenCount--;
				System.out.println(
				Thread.currentThread().getName()
				+": " + ramenCount + "개 남음");
			}
		
		
		for(int i = 0 ; i<burners.length ; i ++) {
			if(!burners[i].equals("_")) continue;
			
			synchronized(this) {
				burners[i] = Thread.currentThread().getName();
				System.out.println(
						"                     "
						+Thread.currentThread().getName()
						+": [ " +(i+1) + "]번 버너 ON");
				showBurners();
			}
			
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			synchronized(this) {
				burners[i] = "_";
				System.out.println("                     "
						+Thread.currentThread().getName()
						+": [" +(i+1)+"] 번 버너 OFF"
						);
				showBurners();
			}
			break;
		}
		
		
			try {
				Thread.sleep(Math.round(1000*Math.random()));
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	private void showBurners() {
		String stringToPrint
			="                                        ";
		for(int i = 0 ; i <burners.length; i ++) {
			stringToPrint += (" "+burners[i]);
		}
		System.out.println(stringToPrint);
	}
	
}