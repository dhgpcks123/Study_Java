//★★★ StirngTokenizer
package day10;

import java.util.StringTokenizer;
//문자열낱말찾기 클래스를 사용해보자.
public class Test07 {
	public static void main(String[] args) {
		
	
	String str ="ab/cd/ef/gh/ij";
	/*
	int idx = str.indexOf("/");
	
	System.out.println(idx);
	
	String subout = str.substring(idx+1);
	//substring은 뒤에도 소문자네? 한 단어라는 의미겠지
	System.out.println(subout);
	*/
	StringTokenizer to = new StringTokenizer(str, "/");
	
	while(to.hasMoreTokens()) {
		System.out.print(to.nextToken()+" ; ");
	}
	
	
	}
}
