//★★
package day07;

import java.util.*;

/*
	'a'부터 시작하는 문자 10개를 저장하는 배열을 만들고
	출력하는 프로그램을 작성하세요.
 */

public class Test03 {
	public static void main(String[] args) {
		char[] chArr = new char[10];
		
		for( int i = 0 ; i<10 ; i++) {
//			chArr[i] = (char)('a'+i);
			char ch = (char)('a'+i);
			chArr[i] = ch;
					
		}
		System.out.print(Arrays.toString(chArr));
		
		//while문으로 출력
		int i = 0;
		while(i<chArr.length){
			System.out.print(chArr[i]+"/");
			i++;
		}
		//for문으로 출력
		for(int j = 0 ; j<chArr.length; j++) {
			System.out.print(chArr[j]+"*"); 
		}
		
		//향상된 for문으로 출력
		for(char no : chArr) {
			System.out.print(no);
		}
	}
}
