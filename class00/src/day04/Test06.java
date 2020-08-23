//★★★
package day04;
/*
예제 4 ]
	년도를 입력하고
	그 해가 윤년인지 아닌지 판별해서 출력하세요.
	
	해결은 다중 조건문으로 처리하세요.
	
	4로 나눠지면 윤년이고
	거기서 다시 100으로 나눠지면 평년인데
	그 중400으로 나눠지면 윤년이다.
*/
import javax.swing.*;
public class Test06 {
	public static void main(String[] args) {
		String snum = JOptionPane.showInputDialog("년도를 입력하세요!");
		int year = Integer.parseInt(snum);
		
		String str = "평년";
		
		if(year%400 ==0) {
			str = "윤년";
		}else if(year%100 == 0) {
			str = "평년";
		}else if(year%4 == 0) {
			str = "윤년";
		}else {
			str = "평년";
		}
		JOptionPane.showMessageDialog(null, "입력한 해 " + year + " 년도는 " + str + " 입니다.");

	}
}
