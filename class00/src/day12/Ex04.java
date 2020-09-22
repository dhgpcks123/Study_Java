package day12;
/*
문제 4]
	
	String 클래스의 api 문서를 참고해서 해결하세요.
	
	'A' ~ 'Z' 사이의 문자 10를 랜덤하게 배열로 만들어서
	이 배열을 이용해서 문자열을 만들어 보세요.
	
*/
public class Ex04 {
	public Ex04() {
		
		char[] chArr = new char[10];
		for(int i =0; i<10;i++) {
			char ch = (char)(Math.random()*('Z'-'A'+1)+'A');
			chArr[i] = ch;
		}
		
		String str ="";
		for(int i = 0 ; i<chArr.length ; i++) {
			str += chArr[i];
		}
		System.out.println(str);
		
	}

	public static void main(String[] args) {
		new Ex04();
	}
}

