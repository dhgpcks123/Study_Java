//★★★
package day10;
/*
랜덤하게 알파벳을 만들어서 출력하는데
	0을 입력받으면 대문자를
	1을 입력받으면 소문자를 
만들어서 출력하는 프로그램을 작성하세요.
*/
import javax.swing.*;

public class Test03 {

	public Test03() {
	
		display();
	}
	
public void display() {	
while(true) {	
String a =JOptionPane.showInputDialog("0 또는 1을 입력하세요");
System.out.println(make(a));;
if(a.equals("q")) {
	
	JOptionPane.showMessageDialog(null, "종료다 짜샤");
	break;
}
}
}
	
	
	
	public char make (String a) {
		char ch = (char)(Math.random()*26);
		char ch2 = a.equals("0") ? (char)(ch+'A'):(char)(ch+'a');
	
		return ch2;
	}
	
	public static void main(String[] args) {
		new Test03();
		System.out.println((Math.random()*26));
		System.out.println((Math.random()*26));
		System.out.println((Math.random()*26));
		System.out.println((Math.random()*26));
		System.out.println((Math.random()*26));
		System.out.println((Math.random()*26));
		System.out.println((Math.random()*26));
		System.out.println((Math.random()*26));
		System.out.println((Math.random()*26));
		System.out.println((Math.random()*26));
		System.out.println((Math.random()*26));
		System.out.println((Math.random()*26));
		System.out.println((Math.random()*26));
		System.out.println((Math.random()*26));
		System.out.println((Math.random()*26));
		System.out.println((Math.random()*26));
	}
}