//★★
package day07;

import java.util.Arrays;
public class Test05 {
	public static void main(String[] args) {
		
		/*
			'a'~'j'문자 10개를 랜덤하게 발생시켜서
			배열에 저장하세요.
			단, 중복된 문자는 허용하지 않는 것으로 한다.
		 */
		char[] chArr = new char[10];
		
		loop:
		for(int i = 0 ; i<10 ;i++) {
			char no = (char)(Math.random()*('j'-'a'+1)+'a');
			for(int j = 0 ; j <i ; j++) {
				if(chArr[j] ==no) {
					--i;
					continue loop;
					
				}
			}
			
			char ran = no; 
			chArr[i] = ran;
		}
		System.out.print(Arrays.toString(chArr));
		
		
		//오름차순으로 정렬하기
		for(int i = 0 ; i <chArr.length-1; i++) {
			for(int j =i+1 ; j <chArr.length ; j++) {
				char ch01 = chArr[i];
				char ch02 = chArr[j];
				char tmp = ' ';
				
				if(ch01>ch02) {
					tmp = ch01;
					chArr[i] = chArr[j];
					chArr[j]=tmp;
				}
			}
		}
		System.out.print(Arrays.toString(chArr));
	}
}
