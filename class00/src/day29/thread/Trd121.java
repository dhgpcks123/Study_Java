package day29.thread;

import day29.*;
public class Trd121 extends Thread {
	Test12 main;
	
	public Trd121(Test12 main, String name) {
		super(name);
		this.main = main;
	}
	
	public void run() {
		main.abc();
		main.xyz();
	}

}
