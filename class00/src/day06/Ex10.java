//★
package day06;

/*

1 	6	11	16	21
2	7	12	17	22
3	8	13	18	23
4	9	14	19	24
5	10	15	20	25

*/

public class Ex10 {
	public static void main(String[] args) {
		
		
		for(int i = 0 ; i<5 ; i++) {
			for(int j =0, k =0 ;j <5 ; j++) {
				
			System.out.print((i+1)+k+ " ");
			k+=5;
			}
		System.out.println();
		}
		
		
	}
}
