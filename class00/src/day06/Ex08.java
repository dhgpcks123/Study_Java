//★
package day06;
/*
반복문 문제
	
	문제 ]
		
		      *
		     ***
		    *****
		   *******
		  *********
		  
*/
public class Ex08 {
	public static void main(String[] args) {
		for(int i = 0 ; i < 5 ; i++) {
			for(int j =0 ; j <9 ; j++) {
				if((j<(4-i)) || (i+4<j)){
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
