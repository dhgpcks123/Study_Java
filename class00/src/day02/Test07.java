//★★★
package day02;
/*
밑변이 10이고 높이가 5인 삼각형의 넓이를 기억할 변수를 만들고 초기화하세요.
밑변과 높이의 변수도 선언하고 초기화 하세요.

공식 ]
	삼각형의 넓이 = 밑변 * 높이 * 1/2
*/
public class Test07 {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 5;
		
		double area = a*b*(1./2);
		
	//	1/2 => 정수와 정수의 연산 결과는 정수가 된다.
		// 1. ==> 1.0 double데이터가 됨. 아니 나눠서 실수나올꺼라서
		//double썼으면 나누기할때도 .꼭 찍어서 정수연산해서 정수가 나오는...
		//그런 실수 안하도록! 1/2 하면 0.5 못나오니까 그냥 나옴!!
		
		System.out.println("area" +area);
				
		
		/*
		 *  & 비트단위의 그리고 and
		 *  | 비트단위의 or
		 *  && - 절삭 연산을 한다. 그리고
		 *  || - 절삭 연산을 한다. or
		 *  
		 */
	}
}
