//★
//ChoiceFormat
package day20;
/*
	학생의 점수를 입력받아
	학점을 출력하는 프로그램을 만들어보자.
	
	단, 조건문으로 처리하세요.
 */
import javax.swing.*;
public class Ex01 {

	public Ex01() {
		String sno =JOptionPane.showInputDialog("점수를 입력하세요");
		
		String msg ="";
		try{
			int no = Integer.parseInt(sno);
			
			switch(no/10) {
			case (10) :
				msg ="A";
				break;
			case (9) :
				msg ="B";
				break;
			case (8):
				msg ="C";
				break;
			case (7) :
				msg ="D";
				break;
			case (6) :
				msg ="E";
			break;
			default:
				msg = "F";
			
			}
			
			
			
			/*
				if(no>=90) {
					msg ="A";
				}else if(no>=80) {
					msg = "B";
				}else if(no>=70) {
					msg = "C";
				}else if(no>=60) {
					msg = "D";
				}else {
					msg = "E";
				}
			*/
			
			JOptionPane.showMessageDialog(null, no+" : "+msg);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
