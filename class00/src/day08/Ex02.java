//★★
package day08;
/*
문제 2 ]
	
	"Hong Gil Dong" 이라는 문자열을 한글자씩 꺼내서 출력하세요.
	단, 꺼내는 함수는 substring() 를 이용해서 처리하세요.
	
	bonus ]
		문자배열로 만들어서 출력하세요.
*/
public class Ex02 {
	public static void main(String[] args) {
		
	
		String str = new String("Hong Gil Dong");
		
		for(int i = 0 ; i<str.length() ; i++) {
		//문자열 글자수 셀 때는 뒤에 ()를 해줘야한다.	
		
		System.out.print(str.substring(i,i+1)+" |");
		}
	}
}
