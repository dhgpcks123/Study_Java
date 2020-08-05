//★
package day06;

/*
반복문 문제
	
	문제 ]
		
		  *****
		  ******
		  *******
		  ********
		  *********
		  
*/
public class Ex08_00 {
	public static void main(String[] args) {
		for(int i = 0; i <5 ; i++){
			for(int j = 0 ; j< 9 ;j++) {
				if(j>i+4) {
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
