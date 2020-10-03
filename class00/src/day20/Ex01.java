//★
//ChoiceFormat
package day20;
import java.text.ChoiceFormat;

/*
	학생의 점수를 입력받아
	학점을 출력하는 프로그램을 만들어보자.
	
	단, 조건문으로 처리하세요.
 */
public class Ex01 {

	public Ex01() {
		String pattern = "0#F|20<E|50#D|70#C|80#B|100#A";
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		
		System.out.println(form.format(60));
			


		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
