package day19;
/*
	문제 5]
		이메일을 입력받아
		형식에 맞는지 아닌지 판별해서 출력하세요.
		
		모든 한글 : [가-힣]
 */
import javax.swing.*;
import java.util.regex.*;

public class Test09 {

	public Test09() {
		
		boolean bool = true;
		while(bool) {
		String mail = JOptionPane.showInputDialog("이메일 주소를 입력하세요!");
		if(mail.equals("q")) {
			break;
		}
		
		Pattern pattern = Pattern.compile("^[\\w3가-힣-_]{3,}@[\\w가-힣]{3,}[.][a-zA-Z가-힣]{2,}$");
		
		Matcher match = pattern.matcher(mail);
		
		String msg = match.matches()?"잘입력했다":"틀렸다";
		JOptionPane.showMessageDialog(null, msg);
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
