package day31_chat.server;

import java.io.*;
import java.net.*;
import java.util.*;

import day31_chat.server.thread.*;
public class ServerChat {
	ServerSocket server;
	public String id;
	
	public ArrayList<ServerTrd> clientList; 
	
	public ServerChat() {
		
		try {
			server = new ServerSocket(7788);
			clientList = new ArrayList<ServerTrd>();
			
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("##서버 준비 완료###");
		
		while(true) {
			try {
				Socket socket = server.accept();
				
				InputStream in = socket.getInputStream();
				InputStreamReader istr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(istr);
				
				
				OutputStream out = socket.getOutputStream();
				PrintWriter prw = new PrintWriter(out);
				
				String str = br.readLine();
				//id=euns >> euns
				id = str.substring(str.indexOf('=')+1);
				
				prw.println("OK");
				prw.flush();
				System.out.println("#### server ID" + id);
				
				ServerTrd t = new ServerTrd(this, socket);
				
				t.br = br;
				t.prw = prw;
				clientList.add(t);
				t.start();
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		new ServerChat();
	}

}
