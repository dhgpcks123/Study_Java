package day31_chat.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import day31_chat.*;
import day31_chat.client.thread.*;
public class ClientButton {
	ClientChat main;
	public ClientButton(ClientChat main) {
		this.main = main;
	}

	
//------------------------------------로그인창----------------------------------------
	//로그인 버튼
	public void setLoginB() {
		main.loginB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str = main.inId.getText();
//				if( (str.trim()).length() == 0 ) {
				if( str.trim().isEmpty() ) {
				
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요");
					return;
				}
				str = "id=" + str;
				
				main.prw.println(str);
				main.prw.flush();
				
				try {
					str = main.br.readLine();
				}catch(Exception e1) {
					e1.printStackTrace();
					return;
				}
				
				if(str == null || !str.equals("OK")) {
					System.exit(0);
				}else if(str.equals("OK")) {
					ClientTrd t = new ClientTrd(main);
					t.start();
					main.setVisible(true);
					main.loginFr.setVisible(false);
				}
			}
			
		});
		
	}
	
	//종료버튼
	public void setCloseB() {
		main.exitB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
			
		});
	}
	
//------------------------------------메세지창-----------------------------------------
	
	//Send버튼
	public void setSendB() {
		main.sendB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String str = main.input.getText();
				if(str.trim().isEmpty()) {
					main.input.setText("");
					return;
				}
				main.prw.println(str);
				System.out.println("보내기 완료");
				main.prw.flush();
				
				main.input.setText("");
			}
			
		});
	}

}
