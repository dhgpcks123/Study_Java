package codingDojang.calculrator;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

import codingDojang.calculrator.ui.Ui;

public class Controller{
	public Ui ui;
	public BtnEvent btn;
	public Controller() {
		ui = new Ui(this);
		btn = new BtnEvent(this);
		
	}

	public static void main(String[] args) {
		new Controller();
	}

	

}
