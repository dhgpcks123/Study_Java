//★★★
package day04;
/*
 랜덤하게 대문자 두개를 발생시켜서
 작은 순서부터 출력되게 하세요.
*/
public class Test02 {
	public static void main(String[] args) {
		char ch1 =(char)(Math.random()*('Z'-'A'+1)+'A');
		char ch2 =(char)(Math.random()*('Z'-'A'+1)+'A');
		
		String str = ch1>ch2?(ch2+"-"+ch1):(ch1+"-"+ch2);
		System.out.println(str);
	}
}
