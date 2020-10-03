//MessageFormat
package day20;
/*	문제 1]
		MessageFormat를 사용해서 형식에 맞는 문자열을 만들어 보자.
		"Name : 전은석, Tel : 010-3175-9042, Mail : euns@increpas.com"
---------------------------------------------------------------------------------------	
	문제 2]
		MessageFormat를 사용해서 형식에 맞는 문자열을 만들어 보자.
		"Name : 전은석, Tel : 010-3175-9042, Mail : euns@increpas.com"
		"Name : 윤요셉, Tel : 010-5069-8600, Mail : joseph@increpas.com"

*/
import javax.swing.*;
import java.text.*;
public class Test07 {

	public Test07() {
		MessageFormat form = new MessageFormat("Name : {0}, Tel : {1}, Mail : {2}");
		/*
			동일한 내용은 그대로 쓰고 변화되는 부분만 {0}, {1}, {2}로 기록한다.
			이 때 번호는 입력되는 데이터의 순서를 의미한다.
		 */
		/*
		String[] data = {"전은석", "010-3175-9042", "euns@increpas.com"};
		String result = form.format(data);
		JOptionPane.showMessageDialog(null, result);
		 */
		
		String[][] data = {{"전은석", "010-4424-1353", "dhghow@nave.rcom"},
							{"오혜찬", "010-7777-5555", "은석@increpaks.com"}};
		String result="";
		for(int i = 0 ; i<data.length; i++) {
			result += form.format(data[i])+"\n";//배열 한 뭉텅이씩 꺼낸다.
//			if(i<data.length-1) result += "\n";
		}
		JOptionPane.showMessageDialog(null, result);
		
		
		
	}

	public static void main(String[] args) {
		new Test07();
	}

}
