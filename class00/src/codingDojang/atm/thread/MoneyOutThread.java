package codingDojang.atm.thread;

import java.text.DecimalFormat;

import codingDojang.atm.AtmController;

public class MoneyOutThread extends Thread {
	AtmController main;
	
	public MoneyOutThread(AtmController main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		while(true) {
			int inMoney = (int)(Math.random()*(1000000-300000+1)+300000);
			int sec = (int)(Math.random()*(3000-500+1)+500);
			
			if(main.modT.modStr-inMoney<0) {
				main.monitor.outputArea.append("\t************* 출금을 시도했으나 잔고가 없습니다 ************** \n");
				try {
					Thread.sleep(sec);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}else {
				DecimalFormat form = new DecimalFormat("###,###,###");
				String tmpMoney= form.format(inMoney);
				main.monitor.outputArea.append("\t\t\t"+tmpMoney+" ) 원이 출금됐습니다\n");
				
				main.modT.modStr -= inMoney;
				try {
					Thread.sleep(sec);
				}catch(Exception  e) {
					e.printStackTrace();
				}
			}
		}
	}
}
