//★★
package day08;
/*
문제 5]
	int[] no1 = {10, 20 , 30, 40, 50};
	
	no1을 깊은 복사를 해서 no2를 만드세요.
*/
public class Ex05 {
	public static void main(String[] args) {
		int[] no1 = {10, 20, 30, 40, 50};
		int[] no2 = new int[5];
		System.arraycopy(no1, 0, no2, 0, no1.length);

		for(int i = 0 ; i<no1.length ; i++) {
			no1[i]=no2[i];
		}
		
	}
}
