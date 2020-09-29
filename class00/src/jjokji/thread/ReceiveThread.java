package jjokji.thread;

import java.io.*;
import java.net.*;

import jjokji.*;
/*
	이 클래스는 쪽지를 받기 위한 클래스
	TCP에서와 마찬가지로 쪽지는 언제 도착할지 알 수 없다.
	독립적으로 쪽지를 받기 위한 프로그램을 따로 만들어서 처리해야 한다.
*/
public class ReceiveThread extends Thread {
	Jjokji main;
	public String msg;
	public String ip;
	public String sid;
	
	public ReceiveThread(Jjokji main) {
		this.main = main;
	}
	
	public void receiveProc(DatagramPacket pack) {
		// 포장 뜯어서 내용물을 확인하고
			//메세지
		byte[] buff = pack.getData();
		msg = new String(buff, 0, buff.length);
		
			//ip
		InetAddress addr = pack.getAddress();
		ip = addr.getHostAddress();
		// 내용물을 ReceiveFrame- 보낸사람 아이디, 내용을 화면에 출력한다.
		// 우리가 만든 Map(ipToId)로 상대방의 ip를 통해 id를 알아낸다.
		sid = (String)main.ipToId.get(ip);
		// 화면에 보여줄 내용을 모두 만들었으므로 출력한다.
		ReceiveFrame rFr = new ReceiveFrame(main);
		rFr.field.setText(sid);
		rFr.area.setText(msg);
		
		// 창을 보이게 처리하고
		rFr.wframe.setVisible(true);
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				//쪽지를 받는다. 도착하는 쪽지는 패킷으로 도착한다.
				//***** 반드시 패킷을 준비해서 받아야한다.
				byte[] buff = new byte[10240];
				DatagramPacket pack = new DatagramPacket(buff, 10240);
				main.rSocket.receive(pack);
				//receive - 함수 역시 블럭킹 함수이므로 패킷이 도착하면 실행되는 함수
				//도착한 패킷을 대화상자를 이용해서 출력한다.
				receiveProc(pack);
			}
				
		}catch(Exception e) {
			e.printStackTrace();
		}finally {}
	}
	
}