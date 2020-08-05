//★★
package day11;
/*
복습문제 ]
	
	친구 한명의 데이터를 기억할 클래스를 정의하고
	
	친구 세명의 데이터를 기억해서
	출력하는 프로그램을 작성하세요.
	
	--------------------------------------------
	회원 한명의 데이터를 기억할 클래스를 정의하고
	
	1. 회원 한명의 데이터를 입력해서 출력하고
	
	2.
	회원 세 명의 데이터를 기억해서
	출력하는 프로그램을 작성하세요.
	
	3. 회원 아이디를 입력하면 회원 정보를 
		출력해주는 프로그램을 작성하세요.
*/
import javax.swing.*;
public class Ex02 {
//	Health one = new Health();
	Health[] friArr = new Health[3];
	public Ex02() {
//		oneMember();
		inputData();
	}
//	public void data() {
//		String[] name = {"오혜찬", "유병욱", "윤승주"};
//		String[] mail = {"dhgpkcs123@naver.com", "wook@daum.net", "joo@joo.com"};
//		String[] id = {"chan", "woo", "joo"};
//		int[] age = {28, 26, 30};
//		char[] gen = {'M', 'F', 'T'};
//		
//		for(int i = 0 ; i <friArr.length; i++) {
//			friArr[i] = new Health();
//			friArr[i].setData(name[i], mail[i], id[i], age[i], gen[i]);
//		}
//	}
	
	public void inputData() {
		String[] name = {"오혜찬", "유병욱", "윤승주"};
		String[] mail = {"dhgpkcs123@naver.com", "wook@daum.net", "joo@joo.com"};
		String[] id = {"chan", "woo", "joo"};
		int[] age = {28, 26, 30};
		char[] gen = {'M', 'F', 'T'};
		
		String str = JOptionPane.showInputDialog("이름을 입력하세요");
		for(int i = 0 ; i <friArr.length; i++) {
			friArr[i] = new Health();
			friArr[i].setData(name[i], mail[i], id[i], age[i], gen[i]);
			if(friArr[i].name.equals(str)) {
				friArr[i].toPrint();
				}
		}
	}
	
//	public void oneMember() {
//		one.setData("오혜찬", "dhgpcks123@naver.com", "dhgpcks", 19, 'M');
//	}
	
	public static void main(String[] args) {
		new Ex02();
}
}
