//★★
package day06;

/*
정수를 랜덤하게 발생 시키고
숫자를 입력 받아서 
같은 숫자가 입력될 경우 종료시키는 
프로그램을 작성하세요.

단, while 반복문을 사용해서 처리하세요.
*/
import javax.swing.*;
public class Test04 {

	public static void main(String[] args) {
		int no = (int)(Math.random()*(100-1+1)+1);

		
		boolean bool= true;
		while(bool) {
			String sno= JOptionPane.showInputDialog("두자리 숫자를 입력하세요 : ");
			if(sno.equals("q")){
				JOptionPane.showMessageDialog(null, "게임 끈다.");
				bool = false;
			}
			int str = Integer.parseInt(sno);
			
			String msg ="같은 수";
			if(str > no) {
				msg = "큰 수";
			}else if(str<no){
				msg = "작은 수";
			}
			JOptionPane.showMessageDialog(null, "입력한 숫자는"  +msg+"입니다.");
			
			if(no ==str) {
				bool= false;
			}
		}

	}

}
