//★★
package day06;
/*
7단 구구단을 출력하세요.
while 문을 사용해서 처리하세요.
*/
public class Test02 {

	public static void main(String[] args) {
		// 카운터 변수를 만든다.
		
		int i = 1;
		
		while(i<10) {
			System.out.println(7 +"x"+ i +"=" +(i++*7));
		}
	}

}
