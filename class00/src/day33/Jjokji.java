package day33;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import day33.thread.ReceiveThread;

import java.util.*;
import java.io.*;
import java.net.*;

public class Jjokji {

	public Properties idToIp, ipToId;
	
	JList<String> list;
	JButton writeB;
	JFrame fr;
	public DatagramSocket rSocket, sSocket;
	
	public Jjokji() {
		setMap();
		setUI();
		setNetwork();
	}

	
	public static void main(String[] args) {
		new Jjokji();
	}
	
	public void setNetwork() {
		try {
			sSocket = new DatagramSocket();
			rSocket = new DatagramSocket(9999);
			
			ReceiveThread t = new ReceiveThread(this);
			t.start();
		}catch(Exception e) {
			e.printStackTrace();
			close();
			System.exit(0);
		}
		
		
	}
	
	
	public void setMap() {
		idToIp = new Properties();
		ipToId = new Properties();
		FileInputStream fin1 = null;
		FileInputStream fin2 = null;
		try {
			fin1 = new FileInputStream("src/day33/resources/idToIp.properties");
			fin2 = new FileInputStream("src/day33/resources/ipToId.properties");
			
			idToIp.load(fin1);
			ipToId.load(fin2);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void close() {
		try {
			sSocket.close();
			rSocket.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setUI() {
		fr = new JFrame("** 쪽지 **");
		fr.addWindowListener(new WindowAdapter() {
			public void windowCloseing(WindowEvent e) {
				close();
				System.exit(0);
			}
		});
		Set tmp = idToIp.keySet();
		Vector<String> v = new Vector<String>(tmp);
		list = new JList<String>(v);
		JScrollPane span = new JScrollPane(list);
		
		writeB = new JButton("쪽지쓰기");
		writeB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String sid = list.getSelectedValue();
				if(sid == null) {
					return;
				}
				SendFrame sFr = new SendFrame(Jjokji.this);
				sFr.field.setText(sid);
				sFr.wframe.setVisible(true);
				fr.setVisible(false);
//
			}
			
		});
		fr.add("Center", span);
		fr.add("South", writeB);
		
		fr.setSize(200, 200);
		fr.setVisible(true);
		fr.setResizable(false);
		
	}
}
