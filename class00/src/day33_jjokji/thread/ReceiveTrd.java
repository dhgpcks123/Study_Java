package day33_jjokji.thread;

import java.net.DatagramPacket;
import java.net.InetAddress;

import day33_jjokji.ReceiveFrame;
import day33_jjokji.Controller;

public class ReceiveTrd extends Thread {
	DatagramPacket pack;
	Controller main;
	public String id;
	public String ip;
	byte[] buff;
	public ReceiveTrd(Controller main) {
		this.main = main;
	}
	public void getData() {
		buff = pack.getData();
		String msg = new String(buff, 0, buff.length);
		System.out.println("ReceiveTrd ] 받은 내용 :" + msg);
		InetAddress inet = pack.getAddress();
		ip = inet.getHostAddress();
		id = main.listui.ipToId.getProperty(ip);
//		main.receiveframe.idField.setText(id);
		System.out.println("ReceiveTrd ] 팩 깜 : " + id+ip);
		
	
		main.receiveframe.area.setText(msg);
		main.receiveframe.idField.setText(id);
		main.receiveframe.setVisible(true);
	}
	
	@Override
	public void run() {
		
			try {
				while(true) {
				buff = new byte[10240];
				pack = new DatagramPacket(buff, 10240);
				main.rSocket.receive(pack);
				System.out.println("ReceiveTrd ] 팩 받음 :" + pack);
				getData();
				//pack주소 자체도 버프에 까야하고
				//안에 내용도 버프에 까야함.
				
				}
				
			}catch(Exception e) {
				e.printStackTrace();
				main.listui.close();
			}
		
	}
}
