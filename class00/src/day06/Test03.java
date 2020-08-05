//★★
package day06;
/*
7단 구구단을 출력하세요.
do ~ while 문을 사용해서 처리하세요.
*/
public class Test03 {

	public static void main(String[] args) {
		//변수 만들고
		int i = 1;
		
		do {
			System.out.println(7+"x"+i+"="+(7*i));
			i++;
		}while(i<10);

	}

}
