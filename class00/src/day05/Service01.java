//★★
package day05;


// 구구단을 출력해보자.
public class Service01 {
	public static void main(String[] args) {
		//바깥 반복문은 단을 증가시켜주는 반복문으로 한다.
		for (int dan = 0 ; dan <9; dan++) {
			System.out.println(dan+"단");
			//안쪽 반복문은 곱을 증가시켜주는 반복문으로 한다.
			for(int gop =0 ; gop <9 ; gop++) {
				System.out.printf("%2d x %2d = %2d\n", dan, gop, dan*gop);
			}
			System.out.println();
		}
	}
}
