//★
//ChoiceFormat
package day20;
/*
	ChoiceFormat을 만들 때
	limits와 format을 하나로 만들 수 있다
	
	만드는 형식
	60#D : 60 =< 의 의미
	70<C : 70 < 의 의미
 */

import java.text.*;
import javax.swing.*;
public class Test06 {

	public Test06() {
		while(true) {
		//패턴 만들고
		String pattern = "0#F|60#D|70<C|80#B|90#A";
		ChoiceFormat form =new ChoiceFormat(pattern);
		//점수 입력받고
		String sno = JOptionPane.showInputDialog("점수를 입력하세요! \n종료는 q를 입력하세요!");
		if(sno.equals("q")) break;
		int score = 0;
		try {
			score=Integer.parseInt(sno);
		}catch(Exception e) {e.printStackTrace();}
		//학점 구하고
		String grade =form.format(score);
		//출력하고
		JOptionPane.showMessageDialog(null, "획득한 점수:"+score+"\n산출된 학점 : "+ grade + "학점");
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
