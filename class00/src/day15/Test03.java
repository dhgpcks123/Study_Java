//★★★
// StringTokenizer 사용, 강제형변환
package day15;
/*문자열 25,30,45,50,70을
문자열을 각각 추출해서
문자배열에 담아서 출력하라
 */

import java.util.*;
public class Test03 {
	String[] chArr;
	public Test03() {
		
		String str = "25,30,45,50,70";
		
		chArr = getData(str);
		
		toPrint();
			
	}
	public static void main(String[] args) {
	new Test03();
	}
	
	
	public String[] getData(String str) {
		int len=1;
		for(int i = 0 ; i<str.length(); i++){
			if(str.charAt(i)==',') {
				len++;
			}
		}
		
		String[] arr = new String[len];
		StringTokenizer token = new StringTokenizer(str, ",");
		for(int i = 0 ; token.hasMoreElements() ; i++) {
			arr[i]=(String)token.nextElement();
		}
		
		return arr;
		
	}
	public void toPrint() {
		for(String str : chArr) {
			System.out.print(str+" /");
		}
	}
}

