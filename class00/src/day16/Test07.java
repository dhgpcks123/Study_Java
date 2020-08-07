//★★
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
				no = -999;
				System.out.println(e);
			}catch(Exception e) {
				no = -777;
			}finally {
				System.out.println("다시 실행하세요");
			}
			
			JOptionPane.showMessageDialog(null, "입력한정수:"+no);
			
			
			
			
			String sno2 = JOptionPane.showInputDialog("정수를 입력하세요!");
			int no2;
			try{
				no2 = Integer.parseInt(sno2);
			}catch(NumberFormatException e) {
				//예외가 발생하면 변수 no2에는 아직 데이터가 정해지지 않은 상태이므로
				//변수 초기화가 필요하다.
				no2 = - 999;
				e.printStackTrace();
				
			}catch(Exception e) {
				no2 = -777;
				e.printStackTrace();
			}finally {
				System.out.println("다시 실행하세요");
			}
			
			
			JOptionPane.showMessageDialog(null, "입력한 정수 : " + no2);
			
		}
	public static void main(String[] args) {
		new Test07();
	}
}
