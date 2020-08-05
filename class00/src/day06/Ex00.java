//★★
package day06;
/*
반복문 문제
	문제 00]
	
	01]
		0	0	0	0	0
		1	1	1	1	1
		2	2	2	2	2
		3	3	3	3	3
		4	4	4	4	4
		
	02]
		0	1	2	3	4
		0	1	2	3	4
		0	1	2	3	4
		0	1	2	3	4
		0	1	2	3	4
*/
public class Ex00 {

	public static void main(String[] args) {
		for(int i= 0 ; i <5 ; i++) {
			for(int j =0 ;j<5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		for(int i= 0 ; i <5 ; i++) {
			for(int j =0 ;j<5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
