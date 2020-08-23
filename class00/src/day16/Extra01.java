//★★★
package day16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Extra01 {
	int num;
	JFrame frame;
	JPanel pan;
	JButton btn1, btn2;
	
	public Extra01() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 100);
		
		pan = new JPanel(new BorderLayout());
		btn1 = new JButton("숫자 입력");
		btn1.setPreferredSize(new Dimension(123,100));
		//이벤트를 추가한다.
		
		AddClass ad = new AddClass(this);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ad.setMain();
			}
		});
		
		btn2 = new JButton("숫자 출력");
		btn2.setPreferredSize(new Dimension(123,100));
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, num);
			}
			
		});
		
		pan.add(btn1, BorderLayout.WEST);
		pan.add(btn2, BorderLayout.EAST);
		
		frame.add(pan);
		frame.setResizable(false);
		frame.setVisible(true);
		
	}
		
		public static void main(String[] args) {
			new Extra01();
		}

}


class AddClass{
	Extra01 main;
	public AddClass(Extra01 main) {
		this.main = main;
	}
	
	public void setMain() {
		String sno = JOptionPane.showInputDialog("정수입력");
		int no =0;
		try {
			no = Integer.parseInt(sno);
		}catch(Exception e){
			no=-999;
			e.printStackTrace();
		}
		//이제 정수는 만들어졌으니
		main.num=no;
	}
}
