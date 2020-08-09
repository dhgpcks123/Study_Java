//★★
package day16;

import javax.swing.*;
public class Extra02_01 {
	Extra02 main;
	

	public void Extra02_01() {}
	public Extra02_01(Extra02 main) {
		this.main = main;
	}
	public void setData() {
		String sno = JOptionPane.showInputDialog("정수를 입력하세요");
		int no;
		try {
			no = Integer.parseInt(sno);
			
		}catch(Exception e){
			no= -999;
			JOptionPane.showMessageDialog(null, "오류입니다");
			e.printStackTrace();
		}
		main.num = no;
	}
	
}
