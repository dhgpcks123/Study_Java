//★★
package day08;
/*
문제 6 ]
	int[] no1 = {10, 20 , 30, 40, 50};
	
	no1의 데이터를 복사해서
	no2를 만드는데
		
		{40, 50, 0, 10, 20}
	의 형태로 만드세요.
*/
public class Ex06 {
	public static void main(String[] args) {
		int[] no1 = {10, 20, 30, 40, 50};
		int[] no2 = new int[5];
		
		for(int i = 0 ; i <no1.length; i++) {
			if(i<2) {no2[i] = no1[i]+30;}
			else{no2[i] = no1[i]-30;}
		}
		for(int ch : no2) {
			System.out.print(ch+" ");
		}
		
		System.arraycopy(no1,0,no2,0,no1.length);
		//arraycopy는 값 변화시키면서 안되네...
	}
}
