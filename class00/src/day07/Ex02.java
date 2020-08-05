//★
package day07;

import java.util.Arrays;

/*
정수 5개를 저장할 배열 3개를 만들어서
첫번째 배열에는 랜덤하게 사각형의 가로의 길이를 만들어서 기억시키고
두번째 배열에는 랜덤하게 사각형의 세로의 길이를 만들어서 기억시키고
세번째 배열에는 랜덤하게 만든 배열의 각 인덱스의 가로, 세로의 길이로 
면적을 계산해서 저장할 배열을 만들고
출력하세요.

출력형식 :
	
	첫번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - xxx
	두번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - xxx
	세번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - xxx
	네번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - xxx
	다섯번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - xxx

+ 결과를 2차원 배열에 담아보세요! (가로)(세로)(넓이)
*/
public class Ex02 {
	public static void main(String[] args){
		//가로세로면적 저장할 배열 변수 선언하고 초기화하기
		int[] garo = new int[5];
		int[] sero = new int[5];
		int[] area = new int[5];
		
		//가로 랜덤하게 다섯개 만들기
		for(int i= 0 ; i<5 ; i++) {
			int no1 = (int)(Math.random()*(10-1+1)+1);
			garo[i] = no1;
		}
		System.out.println(Arrays.toString(garo));
		//세로 랜덤하게 다섯개 만들기
		for(int i= 0 ; i<5 ; i++) {
			int no1 = (int)(Math.random()*(10-1+1)+1);
			sero[i] = no1;
		}
		System.out.println(Arrays.toString(sero));
		
		//면적 출력하기.
		for(int j = 0 ; j <5 ; j++) {
			int myunjuk = garo[j]*sero[j];
				area[j]= myunjuk;
		}
		System.out.println(Arrays.toString(area));
			
		//출력하기
		for(int i = 0 ; i <5 ; i++) {
			System.out.printf("%1d 번째 사각형 : 가로 - %1d | 세로 - %1d | 넓이 %2d \n", (i+1), garo[i], sero[i], area[i]);
		}
		
		
		
		// 2차원 배열에 담기
		System.out.println("******************************");
		int[][] sagak = new int[3][5];
		
		sagak[0] = garo;
		sagak[1] = sero;
		sagak[2] = area;
		
		//출력하기
		for(int i =0 ; i < sagak[0].length ; i++) {
			System.out.printf("%1d 번째 사각형 : 가로 - %1d | 세로 - %1d | 넓이 %2d \n", (i+1), sagak[0][i], sagak[1][i], sagak[2][i]);
		}
	}
}
