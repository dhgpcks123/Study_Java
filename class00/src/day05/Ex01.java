//★★
package day05;

//for 반복문을 사용해서 'a'시작해서 알파벳을 다섯개를 출력하시오.
public class Ex01 {
	public static void main (String[] args) {
		char ch = 'a';
		for(int i = 0; i<5 ; i++) {
			System.out.print((char)(ch+i));
		}
		System.out.println();
		
		
		/*
		for(int i =0 ; i<100 ; i++) {

		}
		int i =0;
		for(;;) {
			System.out.print(i+", ");
			i++;
			if(i == 3) break; // break없으면 무한대로 계~속 돌아
		}
		*/
	}
}

