package jjokji;

import java.awt.event.*;
import javax.swing.*;
import java.util.*;

import java.io.*;
import java.net.*;

import jjokji.thread.*;

public class Jjokji {
	// Map이 두개가 필요하다.
	// 아이디를 알면 ip를 찾을 수 있는 Map
	// 아이피를 알면 아이디를 알 수 있는 Map
	// properties클래스>맵의 형태로 저장됨. 단 들어가는 내용은 모두 문자열로 처리됨.
	public Properties idToIp, ipToId;
	
	JList<String> list;
	JButton writeB;
	JFrame fr;
	SendFrame sFr;
	
	// UDP 통신은 DatagramSocket으로 통신을 한다.
	
	public DatagramSocket sSocket, rSocket;
	/*
		sSocket : 보내는 소켓
		rSocket : 받는 소켓
		
		참고 ]
			반드시 2개가 필요한 것은 아님. 하나만으로도 보내기와 받기가 가능하다.
			하지만 이 경우 보내는 도중에는 받지 못할 수도 있다.
			안전한 통신을 위해서 보내는 소켓과 받는 소켓을 구분해서 처리하는 것이 좋다.
	 */
	
	public Jjokji() {
		setMap();
		setUI();
		setNetwork();
	}

	public static void main(String[] args) {
		new Jjokji();
	}
	
	//네트워크 구성 전담함수
	public void setNetwork() {
		try {
			/*
				UDP 통신에서는 DatagramSocket 을 이용해서
				네트워크를 구성한다.
			 */
			sSocket = new DatagramSocket();
			rSocket = new DatagramSocket(9999);
			/*
				소켓이 구성 된 상태이다.
				누군가 접속한 상태는 아니다.
				네트워크 회선에만 접속을 한 상태가 된다.
				==> 네트워크가 가능한 상태가 됐다.
				
				이제 네트워크 구성이 완료가 됐으므로
				쪽지를 보내고 받을 수 있는 상태가 됐다.
				
				따라서 쪽지를 받는 프로그램을 시작한다.
			 */
			ReceiveThread t = new ReceiveThread(this);
			t.start();
		}catch(Exception e) {
			//소켓을 구성하는 도중 에러가 발생하면 이 프로그램은 통신을 할 수 없는
			//프로그램이 되므로 아래 코드를 실행 할 필요가 없다.
			e.printStackTrace();
			close();
			System.exit(0);
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
		fr = new JFrame("** 쪽 지 **");
		fr.addWindowListener(new WindowAdapter() {
			//Listener로 끝나면 인터페이스, Adapter로 끝나면 추상클래스
			public void windowClosing(WindowEvent e) {
				close();
				System.exit(0);
			}
		});

		//리스트상자안에 친구 이름을 기록하고 Map에서 친구를 아이디로 찾아서 넣자
		Set tmp = idToIp.keySet();
		Vector<String> v = new Vector<String>(tmp);

		list = new JList<String>(v);
		JScrollPane span = new JScrollPane(list);
		
		writeB = new JButton("쪽지쓰기");
		
		//버튼에 이벤트 추가
		writeB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 할 일 : 목록상자에서 선택한 id를 알아낸다.
				String sid = (String)list.getSelectedValue();
				if(sid == null) {
					JOptionPane.showMessageDialog(null, "*** 아이디를 먼저 선택하세요! ***");
					return;
				}
				
				// 보내기 위한 대화상자를 new 시킨다.
				sFr = new SendFrame(Jjokji.this);
				sFr.field.setText(sid);
				// 창 보이기 제어
				sFr.wframe.setVisible(true);
				fr.setVisible(false);
			}			
		});
		
		fr.add("Center", span);
		fr.add("South", writeB);
		
		fr.setSize(200,200);
		fr.setVisible(true);
		fr.setResizable(false);
	}
	
	
	
	
	public void setMap() {
		idToIp = new Properties();
		ipToId = new Properties();
		FileInputStream fin1 = null;
		FileInputStream fin2 = null;
		try {
			fin1 = new FileInputStream("src/jjokji/resources/idToIp.properties");
			fin2 = new FileInputStream("src/jjokji/resources/ipToId.properties");
			
			idToIp.load(fin1);
			ipToId.load(fin2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		System.out.println(idToIp.get("euns"));
		System.out.println(ipToId.get("192.168.0.21"));
		*/
	}
}
