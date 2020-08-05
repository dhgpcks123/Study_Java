//★★
package day06;
/*
반복문 문제
	
	문제 2]
		
		*
		**
		***
		****
		*****
		
*/
public class Ex02_01 {

	public static void main(String[] args) {
		for(int i = 0 ; i <5 ; i++) {
			for(int j = 0 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
