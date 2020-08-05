//★★
package day09;

import java.util.Arrays;

/*
1. 다섯 학생의 국어, 영어, 수학, 코딩, 총점을 기억할 1차 배열을 각각 만들고

2. 학생별로 점수를 관리할 2차 배열을 만들고

3. 위에서 만들어진 2차배열을 과목별 점수를 관리할 2차 배열로 변환하세요.

	국어 		: 10, 10, 10, 10, 10[, 50 ]
	영어 		: 
	수학 		: 
	코딩 		: 
	학생총점 	:

각 배열을 출력하세요.
*/
public class Ex02 {
	public static void main(String[] args) {
		
		//다섯 학생의 각 1차배열을 만든다
		
		int[] kor = {10, 10, 20, 30, 40};
		int[] eng = {20, 30, 30, 40, 50};
		int[] math = {40, 78, 38, 90, 50};
		int[] cod = {26, 29, 68, 53, 56};
		int[] sum = new int[5];
		
		//학생별로 점수를 관리할 2차 배열을 만든다
		int[][] arr = new int[5][5];
		//각 값을 담아준다.
		
		for(int i = 0 ; i<arr[0].length ; i++) {
			arr[i][0] = kor[i];
		}
		for(int i = 0 ; i<arr[0].length ; i++) {
			arr[i][1] = eng[i];
		}
		for(int i = 0 ; i<arr[0].length ; i++) {
			arr[i][2] = math[i];
		}
		for(int i = 0 ; i<arr[0].length ; i++) {
			arr[i][3] = cod[i];
		}
		for(int i = 0 ; i<arr[0].length ; i++) {
			arr[i][4] = kor[i]+eng[i]+math[i]+cod[i];
		}
		
		
		//출력한번하자
		for(int[] charr : arr) {
			System.out.println("학생"+Arrays.toString(charr));
		}
		
		
		
		//2차배열을 과목별로 관리해보자.
		int[][] arr2 = new int[5][5];
		
		for(int i =0; i<arr.length ; i++) {
			for(int j = 0; j<arr[i].length ; j++) {
				arr2[i][j] = arr[j][i];
			}
		}
		
		//한번 더 출력
		for(int[] charr : arr2) {
			System.out.println("과목"+Arrays.toString(charr));
		}
		
		//과목도 이름에 담자
		String[] str = new String[]{"국어", "영어", "수학", "코딩", "총점"};
		
		for(int i = 0 ; i<arr2.length ; i++) {
			System.out.print(str[i]);
			for (int j = 0 ;j<arr2[i].length ; j++) {
				System.out.print(arr2[i][j] +" ");
			}
			System.out.println();
		}
		
	}
}
