//★
package day07;
	/*
	
	정수 5개를 저장할 배열 3개를 만들어서
첫번째 배열에는 랜덤하게 사각형의 가로의 길이를 만들어서 기억시키고
두번째 배열에는 랜덤하게 사각형의 세로의 길이를 만들어서 기억시키고
세번째 배열에는 랜덤하게 만든 배열의 각 인덱스의 가로, 세로의 길이로 면적을 계산해서 저장할 배열을 만들고
출력하세요.

출력형식 :
	
	첫번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - xxx
	두번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - xxx
	세번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - xxx
	네번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - xxx
	다섯번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - xxx

문제 2의 결과로 만들어진 배열을

1. 
	int[][] nemo = new int[3][5];
	의 배열에 채우고 출력하세요.
2. 
	int[][] sagak = new int[5][3];
	에 채우고 출력하세요.



*/
public class Ex04 {
	public static void main(String[] args) {
		int[] garo = new int[5];
		int[] sero = new int[5];
		int[] area = new int[5];
		
	for(int i = 0 ; i<garo.length; i++) {
		int no = (int)(Math.random()*(10-1+1)+1);
		garo[i] = no;
	}
	for(int i = 0 ; i<sero.length; i++) {
		int no = (int)(Math.random()*(10-1+1)+1);
		sero[i] = no;
	}
	for(int i = 0 ; i <area.length; i++) {
		int gop = garo[i] *sero[i];
		area[i] = gop;
	}
	
//	1.	int[][] nemo = new int[3][5];의 배열에 채우고 출력하세요.
	
	int[][] nemo = new int[3][5];
	//garo = { 1, 2, 3, 4, 5}
	nemo[0] = garo;
	nemo[1] = sero;
	nemo[2] = area;
	
	for(int i = 0; i< nemo[0].length ;i++) {
	System.out.printf("%1d번째 사각형 : 가로 %2d, 세로 : %2d, 넓이 ; %2d \n",(i+1), nemo[0][i], nemo[1][i], nemo[2][i]);
	}
	
//	2.  int[][] sagak = new int[5][3]; 에 채우고 출력하세요.

	int[][] sagak =new int[5][3];
	
	for(int i = 0 ; i<sagak.length ; i++) {
		sagak[i][0] = garo[i];
		sagak[i][1]= sero[i];
		sagak[i][2]= area[i];
	}
	System.out.println("*****************");
	for(int i = 0; i< sagak.length ;i++) {
	System.out.printf("%1d번째 사각형 : 가로 %2d, 세로 : %2d, 넓이 ; %2d \n",(i+1), sagak[i][0], sagak[i][1], sagak[i][2]);
	}
				
				
						
										
	

		
	}

}
