package codingDojang.atm.ui;

import javax.swing.*;
import java.awt.*;
import codingDojang.atm.*;
public class Monitor extends JFrame {
	
	JScrollPane outputP;
	public JTextArea outputArea;
	
	JTextField titleField;
	JPanel titleP;
	
	JPanel modP;
	public JTextField modTextField;
	JLabel modLabel;


	
	AtmController main;
	public Monitor(AtmController main) {
		this.main = main;
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(530,600);
		this.setTitle("** ATM **");
		
		outputArea = new JTextArea();
		outputArea.setFont(new Font("Gulim", Font.BOLD, 15));
		outputArea.setEditable(false);
		outputP = new JScrollPane(outputArea);
		outputP.setPreferredSize(new Dimension(400,550));
		
		titleField = new JTextField("햇찬 은행 통장내역");
		Font font = new Font("Gulim", Font.PLAIN, 15);
		titleField.setFont(font);
		titleP = new JPanel();
		titleP.add(titleField);
		
		modLabel = new JLabel(" 잔액 : ");
		modLabel.setFont(new Font("Gulim", Font.BOLD, 15));
		modLabel.setPreferredSize(new Dimension(300, 50));
		modLabel.setHorizontalAlignment(JLabel.RIGHT);
		modTextField = new JTextField();
		
		modTextField.setPreferredSize(new Dimension(50,50));
		modTextField.setEditable(false);
		modTextField.setFont(new Font("Gulim", Font.PLAIN, 14));
		modP = new JPanel(new BorderLayout());
		modP.setPreferredSize(new Dimension(50, 50));
		
		modP.add(modLabel, BorderLayout.WEST);
		modP.add(modTextField, BorderLayout.CENTER);
		
		this.add(titleP, BorderLayout.NORTH);
		this.add(outputP, BorderLayout.CENTER);
		this.add(modP, BorderLayout.SOUTH);
		
		this.setVisible(true);
		this.setResizable(false);
	}

}
