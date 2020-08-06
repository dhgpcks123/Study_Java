package day16;

import javax.swing.*;
public class Test01 {
	public Test01() {
		//정수 형태의 문자열 입력받고
		String sno = JOptionPane.showInputDialog("정수를입력하세요");
		//정수로 바꿔주고
	
	System.out.println("###############");
	int num;
	int no =0;
	try {
		no = Integer.parseInt(sno);
		num = no;
	} catch(Exception e) {
		num = -999;
	}
	System.out.println("---------------");
	JOptionPane.showMessageDialog(null, "입력한정수 : " + no);
	System.out.println("+++++++++++++++");
	
	}
	
	
	public static void main(String[] args) {
		new Test01();
		

	}

}
