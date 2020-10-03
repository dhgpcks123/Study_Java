package day31_chat.client.thread;

import day31_chat.client.*;
import javax.swing.*;
import java.io.*;

public class ClientTrd extends Thread {
	ClientChat main;
	public ClientTrd(ClientChat main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				String msg = main.br.readLine();
				if(msg == null) {
					break;
				}
				
				main.area.append(msg+"\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
			main.close();
		}
	}
}
