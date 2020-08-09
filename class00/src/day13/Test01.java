//★★
//StringTokenizer쓰기 숫자sno로받아서 뽑아서 배열에 담고 출력
package day13;

import java.util.*;
public class Test01 {
	public Test01() {
		String str = "15,14,20,15,10";
		
		//길이 재기
		int len =1;
		for(int i =0 ; i<str.length(); i++) {
			if(str.charAt(i) == ',') {
				len++;
			}
		}
		
		//토크나이져써서 뽑아내기
		StringTokenizer token = new StringTokenizer(str, ",");
		int[] noArr = new int[len];
		for(int i =0 ; token.hasMoreTokens(); i ++ ) {
			noArr[i] = Integer.parseInt(token.nextToken());
		}
		
		System.out.println(Arrays.toString(noArr));
	}
		
	public static void main(String[] args) {
		new Test01();
	}

}
