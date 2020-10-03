package day33_jjokji.ui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import day33_jjokji.Controller;
public class ListUi extends JFrame {
	public Properties ipToId;
	public Properties idToIp;
	
	
	Controller main;
	
	public JList list;
	JScrollPane jPan;
	JButton chB, exitB;
	JPanel butP;
	Set set;
	public String sid;
	
	public ListUi(Controller main) {
		this.main = main;
		getPro();
		setList();
	}
	
	public void setList() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			public void WindowCloseing(WindowEvent e) {
				close();
				System.exit(0);
			}
		});
		
		set =idToIp.keySet();
		Vector v = new Vector(set);		
		list = new JList(v);
		jPan = new JScrollPane(list);
		jPan.setPreferredSize(new Dimension(250,280));

		chB = new JButton("send");
		chB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sid = (String) main.listui.list.getSelectedValue();
				if(sid==null) {
					JOptionPane.showMessageDialog(null, "아이디를 선택하세요");
					return;
				}
				ListUi.this.setVisible(false);
				main.sendbox.setVisible(true);
				System.out.println("ListUi ] 가져온 아이디 : " +sid);
				main.sendbox.idField.setText(sid);
			}
			
		});
		exitB = new JButton("종료");
		exitB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				close();
				System.exit(0);
			}
			
		});
		butP = new JPanel(new GridLayout(1,2));
		butP.add(chB);
		butP.add(exitB);
		
		this.add("Center", jPan);
		this.add("South", butP);
		
		this.setVisible(true);
		this.setResizable(true);
	}

	public void getPro() {
		ipToId = new Properties();
		idToIp = new Properties();
		
		try {
			FileInputStream fin1 = new FileInputStream("src/day33_jjokji/resources/idToIp.properties");
			FileInputStream fin2 = new FileInputStream("src/day33_jjokji/resources/ipToId.properties");
			
			idToIp.load(fin1);
			ipToId.load(fin2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ListUi ] Properties를 가져왔습니다");
	}
	
	public void close() {
		main.sSocket.close();
		main.rSocket.close();
	}
}
