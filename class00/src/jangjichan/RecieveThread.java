package jangjichan;

import java.io.*;
import java.net.*;
import jangjichan.*;
import java.sql.*;
import java.util.Vector;

public class RecieveThread extends Thread {
	MainForm main;
	DatagramPacket pack;
	public String msg, ip ,id;
	
	public Vector<DatagramPacket> packvt;
	
	public RecieveThread(MainForm main) {
		this.main = main;
		 packvt = new Vector<DatagramPacket>();
	}
	
	
	
	public void receiveProc(DatagramPacket pack) {
//		
		byte[] buff = pack.getData(); //메세지 받아서 꺼내자
		msg = new String(buff,0,buff.length);
		
		InetAddress inet = pack.getAddress();
		ip = inet.getHostAddress();
		System.out.println(ip);
		id = getId(ip);
		ReceiveFrame1 rFr = new ReceiveFrame1(main);
		rFr.field.setText(id);
		
		main.vId.add(id);
		main.list1.setListData(main.vId);
	}
	
	
	public String getId(String ip) {
		MyJDBC JD = new MyJDBC();
		Connection con = JD.getCon();
		Sql sql = new Sql();
		PreparedStatement pstmt = JD.getPSTMT(con, sql.getSql(2000));
		try {
			pstmt.setString(1, ip);
			ResultSet set = pstmt.executeQuery();
			set.next();
			id = set.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}
	
	
	
	public void run() {
		
		try {
			while(true) {
				byte[] buff = new byte[10240];
				pack = new DatagramPacket(buff, 10240);
				main.rSocket.receive(pack);
				receiveProc(pack);
				main.pList.add(pack);
			} 
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("에러남");
				main.rSocket.close();
		}
	}

}
