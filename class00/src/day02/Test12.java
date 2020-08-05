//★★★
package day02;

import java.util.*;
//import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
	System.out.println("숫자를 입력하세요 : ");
	int no1 = sc.nextInt();
	
	System.out.println("두번째 숫자를 입력하세요 ; ");
	int no2 = sc.nextInt();
	sc.close();
	
	int area = no1 * no2;
	System.out.println("입력된 길이" +no1+" "+no2+"를 가진 사각형의 넓이는" + area);
	
	}
}
