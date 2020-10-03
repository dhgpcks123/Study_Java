package codingDojang.atm;

import codingDojang.atm.thread.MoneyInThread;
import codingDojang.atm.thread.MoneyOutThread;
import codingDojang.atm.thread.MoneyMod;
import codingDojang.atm.ui.*;
public class AtmController {

	public MoneyMod modT;
	public Monitor monitor;
	
	public AtmController() {
		monitor = new Monitor(this);
		modT = new MoneyMod(this);
		modT.start();
		MoneyInThread inT = new MoneyInThread(this);
		inT.start();
		MoneyOutThread outT =new MoneyOutThread(this);
		outT.start();
	}

	public static void main(String[] args) {
		new AtmController();
	}
}

