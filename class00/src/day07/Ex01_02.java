//★
package day07;
/*
	배열을 num으로 선언하여 데이터 1,2,3,4,5를 담고
	각 데이터 자리숫자만큼 데이터에 값을 더하세요.
	데이터 시작은 0부터.
 */

import java.util.*;

public class Ex01_02 {
	public static void main(String[] args) {
		
		int[] num = new int[] {1,2,3,4,5};

		for(int i =0 ; i<num.length ; i++) {
			num[i] += i;
			
		}

		System.out.print(Arrays.toString(num));
	}
}
