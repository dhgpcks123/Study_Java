//★★
package day09;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
	
		//길이가 각각 다른 1차배열을 관리하는 2차 배열을 만들어보자.
		int[][] num = new int[3][];
		num[0] = new int[3];
		num[1] = new int[5];
		num[2] = new int[7];
		
		//출력해보자~
		for(int[] arr :num) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println();
		
		//데이터를 1부터 객수까지 각각 채워보자.
		for(int i = 0 ; i<num.length ; i++) {
			for(int j = 0 ; j<num[i].length;j++) {
				num[i][j] = j+1;
			}
		for(int[] arr :num) {
			System.out.println(Arrays.toString(arr));
		}
		}
		
	}

}

