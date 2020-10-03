package day33_jjokji;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import day33_jjokji.thread.ReceiveTrd;
import day33_jjokji.ui.ListUi;
import day33_jjokji.ui.SendBox;

public class Controller {
	public DatagramSocket sSocket;
	public DatagramSocket rSocket;
	public DatagramPacket pack;
	public ListUi listui;
	public SendBox sendbox;
	public ReceiveFrame receiveframe;
	public String sid;
	public ReceiveTrd t;
	public Controller() {
		try {
		sSocket = new DatagramSocket();
		rSocket = new DatagramSocket(7788);
		
		}catch(Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		listui= new ListUi(this);
		sendbox = new SendBox(this);
		receiveframe = new ReceiveFrame(this);
		t = new ReceiveTrd(this);
		t.start();
	}

	public static void main(String[] args) {
		new Controller();
	}
	
	public void sendPack() {
		byte[] buff = new byte[1024];
		String str = sendbox.area.getText();
		buff = str.getBytes();
		System.out.println("Controller ] 보낼 메세지 : "+ str);
		sid = (String)listui.list.getSelectedValue();
		String ip = listui.idToIp.getProperty(sid);
		InetAddress inet = null;
		try {
			inet = InetAddress.getByName(ip);
		}catch(Exception e) {}
		pack = new DatagramPacket(buff, buff.length, inet, 7788);
		try {
			sSocket.send(pack);
			System.out.println("Controller ] 팩을 보냈습니다");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
