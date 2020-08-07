package day16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Extra02 {

			int num ;
			JFrame frame;
			JPanel pan;
			JButton btn1, btn2;
			
			public Extra02() {
				frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(250, 100);
				
				pan = new JPanel(new BorderLayout());
				btn1 = new JButton("숫자 입력");
				btn1.setPreferredSize(new Dimension(123, 100));
				// 이벤트 추가
				
//				Extra02 abc = this;
				AddClass2 ac = new AddClass2(this);
				
				btn1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
//						new AddClass2(abc);
						ac.setData();
						
					}
				});
				btn2 = new JButton("숫자 출력");
				btn2.setPreferredSize(new Dimension(123, 100));
				// 출력이벤트 등록
				btn2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(frame, "입력된 숫자 : " + num);
					}
				});
				
				pan.add(btn1, BorderLayout.WEST);
				pan.add(btn2, BorderLayout.EAST);
				
				
				frame.add(pan);
				frame.setVisible(true);
				frame.setResizable(false);
			}
			public static void main(String[] args) {
				new Extra02();
				
			}

}
class AddClass2 {
	Extra02 main;
	
	public AddClass2(Extra02 main) {
		this.main = main;
		setData();
	}
	
	public void setData() {
		String sno = JOptionPane.showInputDialog("정수를 입력하세요");
		int no;
		
		try {
			no = Integer.parseInt(sno);
		}catch(Exception e) {
			no= -999;
			e.printStackTrace();
		}
		main.num =no;
		
	}
}