package codingDojang.atm.thread;

import java.text.DecimalFormat;

import codingDojang.atm.*;
public class MoneyMod extends Thread {
	public int modStr = 0;
	
	AtmController main;
	public MoneyMod(AtmController main) {
		this.main = main;
	}
	@Override
	public void run() {
		while(true) {
			DecimalFormat form = new DecimalFormat("###,###,###");
			String tmpMoney= form.format(modStr);
		main.monitor.modTextField.setText(tmpMoney);
		
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
		
	}
}
