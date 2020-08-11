package day19;

/*
	문제 4]
		자바소스 파일 이름을 입력받아서
		해당 파일이 정상적인 소스파일인지 아닌지 판별하세요.
		
		ex ]
		
			abc.txt ==> 자바소스파일이 아닙니다.
 */
//1패턴만들고
//2매쳐객체를얻어내고
//3객체를이용해서뽑아낸다.

import java.util.regex.*;
import javax.swing.*;
public class Test08 {
	
	public Test08() {
		
		boolean bool =true;
		while(bool) {
			
		String str = JOptionPane.showInputDialog("파일 이름을 입력받으세요. \n종료는 q를 입력하세요");
		if(str.equals("q")) {
			break;
		}
		//Test01.java
		//12Test.java x
		//Java.java0
		//^ - 시작
		//$ - 끝
		Pattern pattern = Pattern.compile("^[A-Z_$][a-zA-Z0-9$_]*[.]java$"); //훨씬 간단;;;;
//		Pattern pattern = Pattern.compile("[A-Z_$]{1}(\\w|[$_])*[.]java");
		
		//matcher만들고
		Matcher match = pattern.matcher(str);
		
		//결과 꺼내고
		String msg = match.matches()?"올바른":"잘못된";
		//출력하고
		JOptionPane.showMessageDialog(null, "입력한 파일 이름"+str+"은 " +msg+"파일 이름입니다.");
		}
	}
		
	public static void main(String[] args) {
		new Test08();
	}
}
