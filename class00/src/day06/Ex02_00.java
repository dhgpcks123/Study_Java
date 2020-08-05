//★★
package day06;

/*
반복문 문제
	
	문제 2]
	
		*****
		*****
		*****
		*****
		*****
		
*/

public class Ex02_00 {

	public static void main(String[] args) {
		//방법1]
		for(int i = 0 ; i <5 ; i++) {
			System.out.println("*****");
		}
		//방법2]
		for(int i = 0 ; i<5 ; i++) {
			for(int j = 0 ; j <5 ; j++) {
			System.out.print("*");
			}
		System.out.println();
		}
	}

}
