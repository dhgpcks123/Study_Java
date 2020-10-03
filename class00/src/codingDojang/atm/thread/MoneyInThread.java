package codingDojang.atm.thread;

import codingDojang.atm.*;
import java.text.*;
public class MoneyInThread extends Thread {

	AtmController main;
	
	public MoneyInThread(AtmController main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		while(true) {
			int inMoney = (int)(Math.random()*(1000000-300000+1)+300000);
			
			DecimalFormat form = new DecimalFormat("###,###,###");
			String tmpMoney= form.format(inMoney);
			main.monitor.outputArea.append(tmpMoney+" ) 원이 입금됐습니다\n");
			
			main.modT.modStr += inMoney;
			
			int sec = (int)(Math.random()*(5000-500+1)+500);
			
			try {
				Thread.sleep(sec);
			}catch(Exception  e) {
				e.printStackTrace();
			}
		}
		
	}
}
