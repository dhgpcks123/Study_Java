//★★
//ChoiceFormat
package day20;
/*
	학생의 점수를 입력받아
	학점을 출력하는 프로그램을 만들어보자.
 */
import java.text.*;
import javax.swing.*;
public class Test05 {

	public Test05() {
	double[] limits = { 0 , 6, 70, 80, 90};
	/*
	 	limits 배열을 만들 때 주의 사항
	 	반드시 오름차순으로 정렬되어야 한다.
	 	의미는 0-59까지는 하나의 문자로 바꾸고
	 	60-69까지는 또 다른 문자 하나로 바꾸고
	 	70-79, 80-89, 90- ....
	 */
	String[] formats = {"F","D","C","B","A"};
	/*
		FORMATS를 만들 때는 반드시 limits의 갯수와 동일해야 한다.
	 */
	
	//ChoiceFormat만들어서 (이걸, 요걸로)
	ChoiceFormat form = new ChoiceFormat(limits, formats);
	
	//점수 입력받고
	String sno = JOptionPane.showInputDialog("점수를 입력하세요");
	int no=0;
	try {
		no = Integer.parseInt(sno);
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	//등급 구하고
	String str = form.format(no);

	System.out.println(str+"등급//점수 : "+no);
}
	public static void main(String[] args) {
		new Test05();
	}

}
