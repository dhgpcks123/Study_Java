package jangjichan;

import javax.swing.*;
import jangjichan.*;

import java.awt.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Vector;

public class MainForm extends JFrame {
	JScrollPane sendList, replyList;
	JButton sendB, readB, exitB;
	JPanel panelB, panelCen;
	JTextArea area,panelList;
	JList list, list1;
	 
	
	public SendFrame1 sFrame;
	public ReceiveFrame1 rFrame;
	LeftJTextArea JTArea;
	public DatagramSocket sSocket, rSocket;
	public ArrayList<DatagramPacket> pList;
	public Vector<String> vId;
	public RecieveThread t;
	
	public MainForm() {
		rFrame = new ReceiveFrame1(this);
		sFrame = new SendFrame1(this);
		setNetwork();
		setUI();
	}
	public void setNetwork() {
		pList = new ArrayList<DatagramPacket>();
		try {
			
			sSocket  = new DatagramSocket();
			rSocket = new DatagramSocket(8888);
			
			t = new RecieveThread(this); 
			t.start(); 
		} catch(Exception e) {	
			e.printStackTrace();
			sSocket.close();
			rSocket.close();
			System.exit(0);
		}
		
	}
	
	public void setUI() {
		this.setTitle("메인창");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//보내기창 설정
		JTArea = new LeftJTextArea();
		list = new JList(JTArea.v);
//		area = new JTextArea(list);
//		area.setEditable(false);
		sendList = new JScrollPane(list);
		sendList.setPreferredSize(new Dimension(240,280));
		//읽기창 설정
		
		//수정 필요할듯
		vId = new Vector<String>();
		list1 = new JList(vId);
		replyList = new JScrollPane(list1);
		replyList.setPreferredSize(new Dimension(240,280));
		
		// 버튼 패널 설정
		panelB = new JPanel(new BorderLayout());
		panelB.setPreferredSize(new Dimension(490,33));
		
		sendB = new JButton("보내기");
		sendB.setPreferredSize(new Dimension(87,27));
		readB = new JButton("읽기");
		readB.setSize(new Dimension(87,27));
		exitB = new JButton("닫기");
		exitB.setPreferredSize(new Dimension(87,27));
		
		panelB.add(sendB, BorderLayout.WEST);
		panelB.add(readB, BorderLayout.CENTER);
		panelB.add(exitB, BorderLayout.EAST);
		// 센터패널에 리스트창들 넣기
		panelCen = new JPanel(new BorderLayout());
		panelCen.setPreferredSize(new Dimension(500,286));
		panelCen.add(sendList, BorderLayout.WEST);
		panelCen.add(replyList, BorderLayout.EAST);
		
		//메인 프레임 설정
		this.setSize(520,362);
		this.add(panelCen, BorderLayout.CENTER);
		this.add(panelB, BorderLayout.SOUTH);
		this.setResizable(false);
		this.setVisible(true);
		
		//실행 후 자동으로 버튼 이벤트 생성
		BtnEvent1 evt = new BtnEvent1(this);
		sendB.addActionListener(evt);
		readB.addActionListener(evt);
		exitB.addActionListener(evt);
		
		sFrame.sendB.addActionListener(evt);
		sFrame.resetB.addActionListener(evt);
		sFrame.exitB.addActionListener(evt);
		
		rFrame.replyB.addActionListener(evt);
		rFrame.exitB.addActionListener(evt);
	}

	public static void main(String args[]) {
		new MainForm();
	}
}
