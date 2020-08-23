//★★★★
//예외처리
package day16;

import javax.swing.*;
public class Test07 {
	public Test07() {
		String sno = JOptionPane.showInputDialog("정수를 입력하세요!");
		int no;
		try {
			no = Integer.parseInt(sno);
		}catch(NumberFormatException e) {
			//숫자포맷예외에 대한 클래스.
			//예외가 발생하면 변수 no에는 아직 데이터가 정해지지 않음.
			no = -999;
			e.printStackTrace();
		}catch(Exception e) {
			no = -777;
			e.printStackTrace();
		}finally {
			System.out.println("try하나 catch하나 출력");
		}
		
		JOptionPane.showMessageDialog(null, "입력한정수 :"+ no);
	}
	public static void main(String[] args) {
		new Test07();
	}
}
