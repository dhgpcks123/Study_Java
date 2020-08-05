////슈바.. ★★
//package day07;
//import java.util.*;
///*
//	1 ~ 45 까지의 숫자를 랜덤하게 6개를 관리할 	
//	배열을 5개를 관리할 배열을 만들고
//	2개 출력하세요.
//*/
//
//public class Test07 {
//	public static void main(String[] args) {
//		int[][][] lotto = new int[2][5][6];
//		//0번째방 선언
//		for(int i = 0 ; i<lotto.length; i++) {
//			
//			//1번째방 선언
//			for(int j = 0 ; j<lotto[i].length ; j++) {
//				
//				loop:
//					//2번째방 선언
//				for(int k = 0 ; k <lotto[i][j].length ; k++) {
//					int no = (int) (Math.random() *45 +1);
//					//중복 검사를 위한
//					for(int x = 0; x<k ; x++) {
//						if(lotto[i][j][k] == no) {
//							x--;
//							continue loop;
//						}
//						lotto[j][k][x]
//						
////					//정렬한다. 슈발...
////						for(int l= 0; l< lotto[x][i].length -1; l++) {
////							for (int m =l+1; m <lotto[x][i].length ; m++) {
////								if(lotto[x][i][l]>lotto[x][i][m]){
////									int tmp =lotto[x][i][l];
////									lotto[x][i][l] = lotto[x][i][m];
////									lotto[x][i][m] = tmp;
////								}
//								
//							}
//						}
//					}
//				}
//			
//		
//		
//		//출력한다.
//		for(int i = 0 ; i<lotto.length ; i++) {
//			for(int j = 0 ; j<lotto[i].length; j++) {
//				System.out.print((j+1)+ " 번째 게임 : ");
//				for(int k = 0; k<lotto[i][j].length ; k++){
//					System.out.printf("%4d", lotto[i][j][k]);
//				}
//				System.out.println();
//			}
//		}
//		
//	}
//}
