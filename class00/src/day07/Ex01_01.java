package day07;

/*
 	문제 ]
 	for을 사용하여
 	문자열 Str에 'A'부터 'Z'까지 담아서 출력하시오.
  	
  	출력 명령 : System.out.print(Str);
  	==> ABCDEFGHIJKLMNOPQRSTUVWXYZ
 */
public class Ex01_01 {

	public static void main(String[] args) {

		String Str = "";
		for(int i =0 ; i <('Z'-'A'+1); i++) {
			Str += (char)('A'+i);
		}

		System.out.print(Str);

	}
}
