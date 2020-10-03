package day31_chat.server.thread;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

import day31_chat.server.ServerChat;

public class ServerTrd extends Thread{
	ServerChat main;
	
	Socket socket;
	public PrintWriter prw;
	public BufferedReader br;
	String ip;
	
	public ServerTrd(ServerChat main, Socket socket) throws Exception {
		this.main = main;
		this.socket = socket;
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		
		InputStreamReader tmp = new InputStreamReader(in);
		InetAddress inet = socket.getInetAddress();
		ip = inet.getHostAddress();
	}
	
	public void sendMsg(String msg) {
		msg = main.id + " ] - " + msg;
		int size = 0;
		
		synchronized(main.clientList) {
			size = main.clientList.size();
			for(int i = 0 ; i<size; i++) {
				ServerTrd tmp = main.clientList.get(i);
				
				tmp.prw.println(msg);
				tmp.prw.flush();
			}
		}
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				String msg = br.readLine();
				System.out.println("받은 메세지" + msg);
				if(msg == null) {
					break;
				}
				sendMsg(msg);
			}
		}catch(Exception e) {
			e.printStackTrace();
			try {
				prw.close();
				br.close();
				socket.close();
			}catch(Exception e1) {}
			
			main.clientList.remove(this);
		}
	}
	
}
