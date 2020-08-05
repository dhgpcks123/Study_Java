//★
package day06;
/*
	반복문 문제
		문제 ]
	
	1	2	3	4	5
	10	9	8	7	6
	11	12	13	14	15
	20	19	18	17	16
	21	22	23	24	25
*/
public class Ex09 {
	public static void main(String[] args) {
		loop:
		for(int k =0 ; k <3 ; k++) {
			for(int  i = 0 ; i<5 ; i++) {
				System.out.print("\t"+(i+1+10*k));
				if((i+1+10*k) == 25) {
					break loop;
				}
			}
			System.out.println();
			for(int  j = 10 ; j>5 ; j--) {
				System.out.print("\t"+(j+10*k));
			}
			System.out.println();
		
		}
	}
}
