//★★★
package day08;

public class Ex01 {
	/*
	문제 1]
		
		대문자 10개를 랜덤하게 발생해서 출력하는 프로그램을 작성하세요.
		단, 중복 문자는 없어야 한다.
		
	bonus ]
		정렬해서 출력하세요.
 */
	public static void main(String[] args) {

		char[] ch = new char[10];
		
		loop:
		for(int i = 0 ; i <ch.length ; i++) {
			char ran = (char)(Math.random()*('Z'-'A'+1)+'A');
			ch[i] = ran;
			//중복검사
			for(int j = 0 ; j<i ; j++) {
				if(ran == ch[j]) {
					--i;
					continue loop;
				}
			}
			
		}
		for(char ch1 :ch) {
			System.out.print(ch1);
		}
		char tmp;
		//정렬해야됨.
		for(int i = 0 ; i<ch.length-1 ; i++) {
			for( int j = i+1 ; j<ch.length ; j ++) {
				if(ch[i]<ch[j]) {
					tmp = ch[i];
					ch[i]= ch[j];
					ch[j]= tmp;
				}
				
			}
		}
System.out.println();
		
	for(char ch2: ch) {
		System.out.print(ch2);
	}
	}
}
