//★★★
package day08;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		int[][] num = new int[2][3];
		int[] no1 = {1,2,3};
		int[] no2 = {4,5,6};
		
		num[0] = no1;
		num[1] = no2;
		
		int[][] num2 =new int[2][3];
	
		
		for(int i = 0 ; i <num.length ;i++) {
			for(int j = 0 ; j <num[i].length; j++) {
				num2[i][j]=num[i][j];
			}
		}
		//깊은복사
		num[0][2]= 33;
		for(int[] arr : num) {
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("### num2 ###");
		for(int[] arr : num2) {
			System.out.println(Arrays.toString(arr));
		}
		
	}
}
