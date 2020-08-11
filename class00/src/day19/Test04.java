//★★
//중요
package day19;
/*
String url = "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=023&aid=0003553008";

	 ? 이후의 데이터를 잘라내서
	 mode=LSD의 경우
	 mode는 keys 배열에
	 LSD는 vals 배열에 채워주세요.

	참고 ] 문자열 조작 함수
			substring(시작위치, 종료위치)
			charAt(인덱스)
			indexOf(문자 또는 문자열)
 */


import java.util.*;
public class Test04 {

	String[] keys = new String[5];
	String[] vals = new String[5];
	public Test04() {
		String url = "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=023&aid=0003553008";
		url = url.substring(url.indexOf("?")+1)+"&";
		
		//mode=LSD&mid=shm&sid1=102&oid=023&aid=0003553008&
//		url = url.substring(url.indexOf('&')+1); 짤라나간다...
		for(int i = 0 ; i<keys.length ; i++) {
			keys[i] = url.substring(0,url.indexOf("="));
			vals[i] = url.substring(url.indexOf("=")+1,url.indexOf("&"));
			if( i !=keys.length -1) {
				url =url.substring(url.indexOf('&')+1);
			}
		}
		for(int i = 0 ; i < keys.length ; i++ ) {
			System.out.printf("%-10s - %-10s\n", keys[i], vals[i]);
		}
		
	}
	

	public static void main(String[] args) {
		new Test04();
	}

}
