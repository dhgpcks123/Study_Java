//★★
package day09;

import java.util.Arrays;

/*
다음 형태의 배열을 요구하는 형태로 변경해 보세요..

1 	2	3
4	5	6

1	4
2	5
3	6

*/
public class Ex01 {
	public static void main(String[] args) {
		int[][] no1 = new int[][]{{1,2,3},{4,5,6}};
		int[][] no2 = new int[3][2];
		
		for(int i = 0 ; i <no1.length ; i++) {
			for(int j= 0 ;j<no1[i].length ; j++) {
				no2[j][i] = no1[i][j];
				/*
				 식 구성했을 때 왼쪽에 있냐 오른쪽에 있냐 너무너무너무너무 중요해★
				지금 no1[i][j]=no2[j][i]했을 때 값이 안나와
				!! no2에다가 no1 넣는다고 해야지!!!!!
				*/
			}
		}
		
		System.out.println();
		for(int[] arr : no2)
		{System.out.println(Arrays.toString(arr));
		}
		
	}
}
