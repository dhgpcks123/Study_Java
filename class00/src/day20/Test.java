package day20;
import java.text.ChoiceFormat;

import javax.swing.JOptionPane;

public class Test {

	public Test() {
		
		String pattern = "0#F|20<E|50#D|70#C|80#B|100#A";
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		
		System.out.println(form.format(60));
	}

	public static void main(String[] args) {
		new Test();
	}

}
