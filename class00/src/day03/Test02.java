//★★
package day03;


//사용할 라이브러리 불러와
import java.util.*;
public class Test02 {

	int nun = 0 ;
	String grade = "수괴";

	
	public static void main(String[] args) {
	
		//입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		//입력해라
		System.out.println("숫자 입력하세용");
		//변수에 저장해주고
		int no = sc.nextInt();
		
		//입력해라
		System.out.println("이름 입력해라");
		//변수 저장해주고
		String str = sc.nextLine();
		// 숫자는 int 문자는 line!! nextLine();
		//스캐너 닫고
		sc.close();
		
		//출력하고
		System.out.println(no +"" + str);
		
		/*
		 	참고 ]
		 	
		 	Scanner클래스도 시스템의 자원을 사용하는 클래스이므로
		 	더 이상 사용하지 않으면 닫아주는 게 원칙이다.
		 	
		 	닫는 명령은
		 	sc.close();
		 	
		 */
				
		
}
}
