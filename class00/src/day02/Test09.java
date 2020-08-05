//★★★
package day02;

public class Test09 {
	public static void main(String[] args) {
		
		int no1 =11;
		int no2 = 10;
		
		System.out.println("no1: " + no1);
		if(  (no1++>no2)  && (++ no1>--no2) ) {
			//11 10             13/9
		}
		
		System.out.println(no1);
		System.out.println(no2);
	}
}
