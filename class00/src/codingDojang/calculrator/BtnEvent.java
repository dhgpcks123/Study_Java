package codingDojang.calculrator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

import javax.swing.JButton;

public class BtnEvent implements ActionListener {
	
	Controller main;
	public BtnEvent(Controller main) {
		this.main = main;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton tmp = (JButton)e.getSource();
		if(tmp == main.ui.btn00) {
			main.ui.rField.append("00");
		}else if(tmp == main.ui.btn0) {
			main.ui.rField.append("0");
		}else if(tmp == main.ui.btn1) {
			main.ui.rField.append("1");
		}else if(tmp == main.ui.btn2) {
			main.ui.rField.append("2");
		}else if(tmp == main.ui.btn3) {
			main.ui.rField.append("3");
		}else if(tmp == main.ui.btn4) {
			main.ui.rField.append("4");
		}else if(tmp == main.ui.btn5) {
			main.ui.rField.append("5");
		}else if(tmp == main.ui.btn6) {
			main.ui.rField.append("6");
		}else if(tmp == main.ui.btn7) {
			main.ui.rField.append("7");
		}else if(tmp == main.ui.btn8) {
			main.ui.rField.append("8");
		}else if(tmp == main.ui.btn9) {
			main.ui.rField.append("9");
		}else if(tmp == main.ui.btnP) {
			main.ui.rField.append("+");
		}else if(tmp == main.ui.btnM) {
			main.ui.rField.append("-");
		}else if(tmp == main.ui.btnG) {
			main.ui.rField.append("*");
		}else if(tmp == main.ui.btnN) {
			main.ui.rField.append("/");
		}else if(tmp == main.ui.btnClear) {
			main.ui.rField.setText("");
		}
	}
	
		
	


}
