package day33_jjokji;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import day33_jjokji.ui.Btnevt;
import day33_jjokji.ui.SendBox;

public class ReceiveFrame extends JFrame {

	Controller main;
	JFrame sFrame;
	public JButton sendB, resetB, exitB;
	public JTextArea area;
	JScrollPane jPan;
	JPanel btnPan, idPan;
	public JTextField idField;
	public JLabel idLabel;
	
	public ReceiveFrame(Controller main) {
		this.main = main;
		setUi();
	}

	public void setUi() {
		this.setTitle("쪽지받음");
		this.setSize(500, 500);
		
		this.addWindowListener(new WindowAdapter() {
			public void WindowCloseing(WindowEvent e) {
				main.listui.setVisible(true);
				ReceiveFrame.this.setVisible(false);
			}
		});
	
		area = new JTextArea();
		area.setEditable(false);
		jPan = new JScrollPane(area);
		
		idField = new JTextField();
		
		idLabel = new JLabel(" ID : ");
		idField.setEditable(false);
		
		idPan = new JPanel(new BorderLayout());
		sendB = new JButton("답장하기");
		//답장 구현은 포기한다.
		exitB = new JButton("종료하기");
		exitB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				main.listui.setVisible(true);
				ReceiveFrame.this.setVisible(false);

			}
			
		});
		btnPan = new JPanel(new GridLayout(1,3));
		
		btnPan.add(sendB);
		btnPan.add(exitB);
		
		idPan.add("Center",idField);
		idPan.add("West",idLabel);
		
		this.add("North",idPan);
		this.add("Center", jPan);
		this.add("South", btnPan);
		
		this.setVisible(false);
		this.setResizable(false);
	}
}
