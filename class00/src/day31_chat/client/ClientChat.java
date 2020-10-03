package day31_chat.client;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.*;
import DB.MyJDBC;
import java.net.*;
public class ClientChat extends JFrame {
	
//메인창
public JTextArea area;
JScrollPane span;
JPanel inPan;
JTextField input;
JButton sendB;
ClientButton clientB;

//연결
	public Socket socket;
	public PrintWriter prw;
	public BufferedReader br;
	
	public ClientChat() {
		
		clientB = new ClientButton(this);
		setUI();
		setLoginFr();
		
		try {
			InetAddress inet = InetAddress.getLocalHost();
			String ip = inet.getHostAddress();
			socket = new Socket(ip, 7788);
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			
			OutputStream out = socket.getOutputStream();
			prw = new PrintWriter(out);
			
			
		}catch(Exception e) {
			e.printStackTrace();
			close();
		}
	}
	
	public void close() {
		try {
			prw.close();
			br.close();
			socket.close();
		}catch(Exception e) {
			System.exit(0);
		}
	}

	//메인창 셋팅을 위한 함수------------------------------------------------------------------------
	public void setUI() {
		this.setTitle("*** 채팅창 ****");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		area = new JTextArea();
		area.setEditable(false);
		area.setFont(new Font("gulim", Font.BOLD, 16));
		span = new JScrollPane(area);
		span.setPreferredSize(new Dimension(420, 460));
		
		inPan = new JPanel(new BorderLayout());
		
		input = new JTextField();
		input.setSize(new Dimension(350, 30));
		
		sendB = new JButton("Send");
		sendB.setPreferredSize(new Dimension(100,30));
		clientB.setSendB();
		
		inPan.add(input, BorderLayout.CENTER);
		inPan.add(sendB, BorderLayout.EAST);
		
		this.add(span, BorderLayout.CENTER);
		this.add(inPan, BorderLayout.SOUTH);
		
		this.setSize(450, 500);
		this.setVisible(false);
		this.setResizable(false);
	}
	
//로그인창
JFrame loginFr;
JLabel lid, lpw;
JTextField inId;
JPasswordField inPw;
JPanel idP, pwP;
JButton loginB, exitB;
	
	//로그인창 셋팅을 위한 함수----------------------------------------------------------------------
	public void setLoginFr() {
		loginFr = new JFrame("** 로그인 창 **");
		loginFr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lid = new JLabel("ID : ");
		lpw = new JLabel("PW : ");
		
		lid.setPreferredSize(new Dimension(35,11));
		lpw.setPreferredSize(new Dimension(35,11));
		
		lid.setHorizontalAlignment(JLabel.RIGHT);
		lpw.setHorizontalAlignment(JLabel.RIGHT);
		
		inId = new JTextField();
		inPw = new JPasswordField();
		
		inId.setPreferredSize(new Dimension(170, 32));
		inPw.setPreferredSize(new Dimension(170, 32));
		
		idP = new JPanel(new BorderLayout());
		pwP = new JPanel(new BorderLayout());
		
		idP.add(lid, BorderLayout.WEST);
		idP.add(inId, BorderLayout.EAST);
		
		pwP.add(lpw, BorderLayout.WEST);
		pwP.add(inPw, BorderLayout.EAST);
		
		JPanel loginPan = new JPanel();
		loginPan.setPreferredSize(new Dimension(245, 100));
		loginPan.add(idP);
		loginPan.add(pwP);
		
		loginB = new JButton("로그인");
		clientB.setLoginB();
		exitB = new JButton("종료");
		clientB.setCloseB();
		
		
		
		JPanel bPan = new JPanel(new GridLayout(1,2));
		bPan.setPreferredSize(new Dimension(250, 30));
		bPan.add(loginB);
		bPan.add(exitB);
		
		
		loginFr.add(loginPan, BorderLayout.CENTER);
		loginFr.add(bPan, BorderLayout.SOUTH);
		
		
		loginFr.setSize(350, 170);
		loginFr.setResizable(false);
		loginFr.setVisible(true);
	}
	public static void main(String[] args) {
		new ClientChat();
	}

}
