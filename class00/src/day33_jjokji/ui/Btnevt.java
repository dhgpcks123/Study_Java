package day33_jjokji.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Btnevt implements ActionListener {
	SendBox smain;
	public Btnevt(SendBox smain) {
		this.smain = smain;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton avt = (JButton) e.getSource();
		if(avt.equals(smain.sendB)) {
			System.out.println("Btnevt ] Send버튼이 눌렸습니다");
			sendProc();
		}else if(avt.equals(smain.resetB)){
			System.out.println("Btnevt ] reset버튼이 눌렸습니다");
			resetProc();
		}else if(avt.equals(smain.exitB)){
			System.out.println("Btnevt ] 종료버튼이 눌렸습니다");
			exitProc();
		}
	}
	
	public void sendProc() {
		smain.main.sendPack();
		smain.setVisible(false);
		smain.main.listui.setVisible(true);
		smain.area.setText("");
		
	}
	public void resetProc() {
		smain.area.setText("");
	}
	public void exitProc() {
		smain.area.setText("");
		smain.setVisible(false);
		smain.main.listui.setVisible(true);
	}

}
