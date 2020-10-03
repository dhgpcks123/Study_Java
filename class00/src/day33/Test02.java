package day33;

import java.net.*;
public class Test02 {

	public Test02() {
		try {
			
			DatagramSocket sSocket = new DatagramSocket();
			System.out.println("[발신 시작]");
			for(int i = 0 ; i <3 ; i++) {
				String data = "햇찬이가 메세지 보낸다~"+i;
				byte[] byteArr = data.getBytes();
				
				DatagramPacket packet = new DatagramPacket(byteArr, byteArr.length, new InetSocketAddress("localhost", 5001));
				//localhost 문자열로 넣는데도 자동으로 처리해주나보다.
				sSocket.send(packet);
				System.out.println("메세지가 보내졌습니다. 보낸 byte 수 : "+byteArr.length);
			}
			sSocket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		System.out.println("[발신 종료]");
		
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}
