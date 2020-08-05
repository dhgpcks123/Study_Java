//★★
package day07;

public class Test04 {
	public static void main(String[] args) {
		String str = "가나다라abcdABCD";
		int sIdx = str.indexOf("abcd");
		System.out.println("abcd시작은 : "+sIdx);
		
		String no = "123456";
		int nIdx = no.indexOf("4");
		System.out.println("4의 시작은 :" +nIdx);
		
//		정수는 안되고 문자열만 되는건가???
//		변수이름.indexOf("찾고자하는 것")


	}
}
