package day16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Extra01 {

		int num ;
		JFrame frame;
		JPanel pan;
		JButton btn1, btn2;
		
		public Extra01() {
			frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(250, 100);
			
			pan = new JPanel(new BorderLayout());
			btn1 = new JButton("숫자 입력");
			btn1.setPreferredSize(new Dimension(123, 100));
			// 이벤트 추가
			
//			Extra01 e1 = this;
// 밑에 꺼가 더 좋아 왜냐하면 addClass(e1);
// 쓸 때마다 객체 만들어서 필요없는 데이터 힙에 쌓임
			AddClass ac02 = new AddClass(this);
			btn1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
//					new AddClass(e1);
					ac02.setMain();
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
			new Extra01();
		}

}


class AddClass {
	// Extra01의 객체의 주소를 기억할 준비를 해야한다.
	Extra01 main;
	

	// Extra01의 객체의 주소를 넘겨받아서 셋팅해주는 역할을 하는 생성자를 정의
	public AddClass(Extra01 main) {
		this.main = main;
//		setMain();
	}
	
//	public void AddClass (Extra01 main) {
//	this.main = main;
//	}
	
	public void setMain() {
		String sno = JOptionPane.showInputDialog("정수입력!");
		int no =0;
		try {
			no = Integer.parseInt(sno);
		}catch(Exception e){
			no= -999;
		}
		
		// 이제 정수는 만들어졌으니 Extra01 객체의 멤버에 기억시킨다.
		main.num = no;
	}
}
