package day33;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.net.*;

public class BtnEvent implements ActionListener{
	
	SendFrame sFr;
	public BtnEvent(SendFrame sFr) {
		this.sFr = sFr;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton tmp = (JButton)e.getSource();
		if(tmp == sFr.sendB) {
			sendProc();
		}else if(tmp ==sFr.resetB) {
			resetProc();
		}else if(tmp ==sFr.exitB) {
			exitProc();
		}
	}
	
	public void sendProc() {
		String msg = sFr.area.getText();
		byte[] buff = msg.getBytes();
		String ip = sFr.main.idToIp.getProperty(sFr.field.getText());
		InetAddress inet = null;
		try {
			inet = InetAddress.getByName(ip);
		}catch(Exception e) {}
		DatagramPacket pack = null;
		try {
			pack = new DatagramPacket(buff, buff.length, inet, 9999);
			sFr.main.sSocket.send(pack);
		}catch(Exception e) {
			e.printStackTrace();
		}
		sFr.wframe.setVisible(false);
		sFr.main.fr.setVisible(true);
		sFr.wframe.dispose();
		System.out.println("BtnEvent ] 보내기 완료, 내용 : " + msg);
	}
	public void resetProc() {
		sFr.area.setText("");
	}
	public void exitProc() {
		sFr.wframe.setVisible(false);
		sFr.main.fr.setVisible(true);
	}

}
