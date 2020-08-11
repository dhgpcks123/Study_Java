package day19;
/*
	String str = "{10,9,8,7,6}";
	String str2 = "[[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15],[16,17,18,19,20],[21,22,23,24,25]]";
	//위 문자열을 정수배열에 담아주세요.
*/

import java.util.*;

public class Test05 {

	public Test05() {
		String str = "{10,9,8,7,6}";
		//위 문자열을 정수배열에 담아주세요.
		
		//1번
		str = str.substring(str.indexOf("{")+1,str.indexOf("}"));
		System.out.println(str);
		
		int len = 1;
		for(int i=0 ; i <str.length(); i ++) {
			if(str.charAt(i)==',') {
				len++;
			}
		}
		int[] sArr = new int[len];
		StringTokenizer token = new StringTokenizer(str, ",");
		//int len =token.countTokens(); //잘려진 토큰의 갯수를 반환해주는 함수
		for(int i = 0; token.hasMoreTokens(); i++) {
			try {
			sArr[i] = Integer.parseInt(token.nextToken());
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
		//출력하고
		for(int i = 0 ; i <sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		
		
		
		//2번
		String str2 = "[[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15],[16,17,18,19,20],[21,22,23,24,25]]";
		//위 문자열을 정수배열에 담아주세요.
		//str2 = str2.replace("[[","").replace("]]","");
		str2 = str2.substring(str2.indexOf("[[")+2,str2.indexOf("]]"));
		//1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15],[16,17,18,19,20],[21,22,23,24,25
		
		int[][] noArr = new int[5][5];
		
		str2 = str2.replace("],[", "/");
//		str2 = str2.replaceAll("],", "");
		
		StringTokenizer token1 = new StringTokenizer(str2, "/");
		//1,2,3,4,5   6,7,8,9,10   11,12,13,14,15   16,17,18,19,20   21,22,23,24,25
		for(int i = 0 ; token1.hasMoreTokens(); i++) {
			
			StringTokenizer token2 = new StringTokenizer(token1.nextToken(), ",");
			//1 2 3 4 5
			for(int j = 0 ; token2.hasMoreTokens(); j++) {
				try {
					noArr[i][j]= Integer.parseInt(token2.nextToken());
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		//출력
		for(int i = 0 ; i<noArr.length; i++) {
			for(int j = 0 ; j<noArr[0].length; j++) {
				System.out.print(noArr[i][j]+"|");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
