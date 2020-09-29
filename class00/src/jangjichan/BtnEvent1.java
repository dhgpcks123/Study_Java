package jangjichan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class BtnEvent1 implements ActionListener{
	MainForm main;
	String sip;
	
	public BtnEvent1(MainForm main) {
		this.main = main;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton tmp = (JButton) e.getSource();
		if(tmp == main.sFrame.sendB) {
			sendProc();
		} else if(tmp == main.sFrame.resetB) {
			resetProc();
		} else if(tmp == main.sFrame.exitB) {
			exitSProc();
		} else if(tmp == main.rFrame.replyB) {
			replyProc();
		} else if(tmp == main.rFrame.exitB) {
			exitRProc();
		} else if(tmp == main.sendB) {
			mainsendProc();
		} else if(tmp == main.readB) {
			mainreadProc();
		} else if(tmp == main.exitB) {
			mainexitProc();
		}
		
		// 메인 폼 추가해야함.
	}

	// 메인 폼 버튼
	public void mainsendProc() {
		main.sFrame.setVisible(true);
		String sid = (String)main.list.getSelectedValue();
		main.sFrame.field.setText(sid);
		sip = main.JTArea.idToip(sid);
	}
	
	public void mainreadProc() {
		main.rFrame.setVisible(true);
		main.rFrame.field.setText(main.t.id);
		main.rFrame.area.setText(main.t.msg);
	}
	
	public void mainexitProc() {
		System.exit(0);
	}
	
	// 송신자 버튼
	public void sendProc() {
		// 쪽지내용 byte로 받기
		String msg = main.sFrame.area.getText();
		byte[] buff = msg.getBytes();	// byte로 변환 완료.
		
		String ip = sip;
		sip = ""; // sip 초기화.
		InetAddress inet = null;
		DatagramPacket pack = null;
		try {
			inet = InetAddress.getByName(ip);
			
			// packet 에 포장 완료.
			pack = new DatagramPacket(buff, buff.length, inet, 8888);
			
			// 보내기.
			main.sSocket.send(pack);
			main.sFrame.setVisible(false);
			main.sFrame.dispose();
		} catch(Exception e) {
			System.out.println("inet, pack 중 하나 문제 있음.");
		}
		
	}
	
	public void resetProc() {
		main.sFrame.area.setText("");
	}
	
	public void exitSProc() {
		main.sFrame.setVisible(false);
	}
	
	// 수신자 버튼
	public void replyProc() {
		main.sFrame.setVisible(true);
		main.sFrame.field.setText("");
		main.sFrame.area.setText("");
	}
	
	public void exitRProc() {
		main.rFrame.setVisible(false);
	}

}
