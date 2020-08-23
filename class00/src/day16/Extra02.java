//★★★

package day16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Extra02 {
	int num;
	
	JFrame frame;
	JPanel pan;
	JButton btn1, btn2;
		
	public Extra02() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 100);
		
		pan = new JPanel(new BorderLayout());
		btn1 = new JButton("숫자입력");
		btn1.setPreferredSize(new Dimension(123,100));
		
		//이벤트 추가
		
//		Extra02 abc = this;
		Extra02_01 addNo = new Extra02_01(this);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				addNo.setData();
			}
		});
		
		btn2 = new JButton("숫자 출력");
		btn2.setPreferredSize(new Dimension(123,100));
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, num);
			}
			
		});
		pan.add(btn1, BorderLayout.WEST);
		pan.add(btn2, BorderLayout.EAST);
		
		frame.add(pan, BorderLayout.CENTER);
		frame.setResizable(false);
		frame.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Extra02();
	}
}
