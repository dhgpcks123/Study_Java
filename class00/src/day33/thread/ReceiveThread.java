package day33.thread;

import java.net.*;
import java.net.SocketException;

import day33.*;
public class ReceiveThread extends Thread{

	Jjokji main;
	public String msg;
	public String ip;
	public String sid;
	
	public ReceiveThread(Jjokji main) {
		this.main = main;
	}
	public void receiveProc(DatagramPacket pack) {
		byte[] buff = pack.getData();
		msg = new String(buff, 0, buff.length);
		System.out.println("ReceiveThread 2 ] Pack 열었음. msg :"+ msg);

		InetAddress addr = pack.getAddress();
		ip = addr.getHostAddress();
		System.out.println("ReceiveThread 3 ] Pack 열었음. ip :"+ ip);

		sid = main.ipToId.getProperty(ip);
		
		ReceiveFrame rFr = new ReceiveFrame(main);
		rFr.field.setText(sid);
		rFr.area.setText(msg);
		rFr.wframe.setVisible(true);
	}
	@Override
	public void run() {
		try {
			while(true) {
				byte[] buff = new byte[10240];
				DatagramPacket pack = new DatagramPacket(buff, 10240);
				main.rSocket.receive(pack);
				System.out.println("ReceiveThread 1 ] Pack 받음. 주소 :"+ pack);
				receiveProc(pack);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
