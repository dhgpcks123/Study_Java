package day32_chatting.client.thread;

import day32_chatting.client.ClientController;

public class ReceiveThread extends Thread {
	public ClientController main;
	
	public ReceiveThread(ClientController main) {
		this.main = main;
	}
	
	public void run() {
		try {
			while(true) {
				String msg = main.br.readLine();
				if(msg.substring(0,3).equals("130")){
					msg = msg.substring(3);
					main.frame.area.append(msg+"\n");
					
				//스크롤바
					main.frame.span.getVerticalScrollBar().setValue(main.frame.span.getVerticalScrollBar().getMaximum());
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			main.close();
		}
	}
}
