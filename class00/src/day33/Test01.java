package day33;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Test01 extends Thread {
	DatagramSocket rSocket;
	public Test01() {
		try {
			rSocket = new DatagramSocket(5001);
		} catch (SocketException e) {
			e.printStackTrace();
		}
		
		Thread thread = new Thread() {
			
			@Override
			public void run() {
				System.out.println("[수신 시작]");
				try {
					while(true){
						DatagramPacket packet = new DatagramPacket(new byte[100], 100);
						rSocket.receive(packet);
						
						String data = new String(packet.getData());
						System.out.println("받은 내용 ] ("+packet.getSocketAddress()+" )"+ data);
						
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println("수신 종료");
			}
		};
		thread.start();
		
		try {
			Thread.sleep(50000);
			rSocket.close();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

	

	public static void main(String[] args) {
		new Test01();
	}

}
