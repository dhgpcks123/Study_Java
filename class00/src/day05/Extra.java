//★★
package day05;

/*
	정수를 랜덤하게 발생시키고
	숫자를 입력 받아서
	같은 숫자가 입력될 경우 종료시키는
	프로그램을 작성하세요.
	
 */
import javax.swing.*;
public class Extra {

	public static void main(String[] args) {
		int no = (int)(Math.random()*(99-10+1)+10);		
		
		

		for(;;) {
			String sno = JOptionPane.showInputDialog("두 자리 숫자를 입력하세요.");
			int tmp = Integer.parseInt(sno);
			
			String msg ="같습니다";
			if(tmp > no) {
				msg  = "숫자가 큽니다";
			}else if(tmp < no){
				msg ="숫자가 작습니다";
			}
			
			JOptionPane.showMessageDialog(null, "입력한 수는" +msg);
			if(tmp==no) break;
		}
	}

}
