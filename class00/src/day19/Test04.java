//★
//중요
package day19;

import java.util.*;
public class Test04 {

	String[] keys = new String[5];
	String[] vals = new String[5];
	public Test04() {
		String url = "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=023&aid=0003553008";
		
		// ? 이후의 데이터를 잘라내서
		// mode=LSD의 경우
		// mode는 keys 배열에
		// LSD는 vals 배열에 채워주세요.
		/*
			문자열 조작 함수
			
				substring(시작위치, 종료위치)
				charAt(인덱스)
				indexOf(문자 또는 문자열)
		 */
		/*
		System.out.println(url.indexOf('?'));
		String subUrl=url.substring(url.indexOf('?')+1)+"&";
		System.out.println(subUrl);
		
		for(int i = 0; i<keys.length;i++ ) {
			keys[i] = subUrl.substring(0, subUrl.indexOf("="));
			vals[i] = subUrl.substring(subUrl.indexOf("=")+1, subUrl.indexOf('&'));
			if(i != keys.length-1) {//마지막작업 할 필요없어서 length-1
				subUrl = subUrl.substring(subUrl.indexOf('&')+1);
			}
			
		}
		*/
		StringTokenizer token1 = new StringTokenizer(url, "?");
		String data = "";
		int cnt = token1.countTokens();
		for(int i = 0 ; i < cnt; i++) {
			if(i == 0 ) {
				token1.nextToken();
				continue;
			}
			data = token1.nextToken();
		}
		
		//&를 기준으로 자른다.
		StringTokenizer token2 = new StringTokenizer(data, "&");
		int j = 0;
		while(token2.hasMoreTokens()) {
			StringTokenizer token3 = new StringTokenizer(token2.nextToken(), "=");
			keys[j] = token3.nextToken();
			vals[j++] = token3.nextToken();
		}
		
		//복잡하면 하나씩 꺼내서 배열에 담아두고
		//그거 다시 또 꺼내서 나눠서 배열에 담아 처리할 수도 있겠지 -> 해보기
		
		/*
		System.out.println("count :" + token1.countTokens());
		token1.nextToken();
		
		StringTokenizer token2 = new StringTokenizer(token1.nextToken(), "&");
		*/
		
		
		
		
		//출력하기
		for(int i = 0 ; i<keys.length ; i++) {
			System.out.printf("%-10s - %-10s\n", keys[i], vals[i]);
		}
		
	}	


	public static void main(String[] args) {
		new Test04();
	}

}
