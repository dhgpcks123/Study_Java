//★
package day07;

import java.util.Arrays;

/*
	다섯 학생의 국어, 영어, 수학, 코딩, 총점 을 관리할 배열을 만들고
	랜덤하게 과목 점수를 만들어서 입력하고
	총점을 계산하세요.
	출력하세요.

	1. Ex03
		각 과목의 배열을 만들고 점수를 입력해서 배열을 완성하고
		2차원 배열로 합쳐서 처리하는 방법
	
	
	2. Ex03_01
		2차원 전체 배열로 처리하는 방법 ex03_01

	보너스 ]
		점수가 높은 사람부터 정렬해서 출력하세요.

*/

public class Ex03 {
	public static void main(String[] args) {
		// 1)
		
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] cod = new int[5];
		int[] sum = new int[5];
		
		for(int i = 0 ; i<kor.length ; i++) {
			int no = (int)(Math.random()*(100-1+1)+1);
			kor[i] = no;}
		for(int i = 0 ; i<eng.length ; i++) {
			int no = (int)(Math.random()*(100-1+1)+1);
			eng[i] = no;}
		for(int i = 0 ; i<math.length ; i++) {
			int no = (int)(Math.random()*(100-1+1)+1);
			math[i] = no;}
		for(int i = 0 ; i<cod.length ; i++) {
			int no = (int)(Math.random()*(100-1+1)+1);
			cod[i] = no;}
		
		for(int i = 0 ; i<sum.length ; i++) {
			int total=kor[i] + eng[i] + math[i] +cod[i];
			sum[i] = total;
			}
		
			//출력하세요
		for(int i = 0 ; i<sum.length ; i++) {
		System.out.printf("%1d 학생 : 국어-%2d 영어-%2d 수학-%2d 코딩-%2d 토탈-%3d \n",(i+1),kor[i],eng[i],math[i],cod[i],sum[i]);
		}
		
		
		
			//2차원 배열로 처리 [5][5]
		
		int[][] ban = new int[5][5];

			for (int j = 0 ; j<ban[0].length; j++) {
				ban[0][j] = kor[j];}
			for (int j = 0 ; j<ban[0].length; j++) {
				ban[1][j] = eng[j];}
			for (int j = 0 ; j<ban[0].length; j++) {
				ban[2][j] = math[j];}
			for (int j = 0 ; j<ban[0].length; j++) {
				ban[3][j] = cod[j];}
			for (int j = 0 ; j<ban[0].length; j++) {
				ban[4][j] = sum[j];}
			// 출력하시오.
			
				for(int j= 0 ; j<5 ; j++) {
					System.out.printf("%1d번째 학생 국 :%2d 영:%2d 수%2d 코%2d, 합계%3d \n", (j+1), ban[0][j], ban[1][j], ban[2][j], ban[3][j], ban[4][j] );
				}
			
			
	}
}
