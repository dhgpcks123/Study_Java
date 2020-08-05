//★★★
package day10;
/*
	정수 두개를 입력해서
	두 수를 더한 값을 반환해주는 함수를 만들고 실행해보자.
	
	참고 ]
	
		함수의 작성 위치는 클래스블럭({}) 내의 아무곳에서나 가능하다.
		함수 내부에서 함수를 만들수는 없다.
		위치는 클래스블럭 내라면 순서에 상관없이 만들 수 있다.
*/
//여기에 함수를 만들어도 되고
public class Test02 {
//여기에 함수를 만들어도 되고
	public Test02() {
		int no1= (int)(Math.random()*10000);
		int no2= (int)(Math.random()*10000);
		
		System.out.println(duhagi(no1,no2));
	}
//여기에 함수를 만들어도 되고
	
	public int duhagi(int no1, int no2) {
		int hap = no1+no2;
		return hap;
		
		/* 이 함수를 실행할 때는 반드시 정수 데이터 두개를 입력을 해야한다.
		 * 이 때 각 데이터는 no1, no2라는 변수에 대입될 것이다.
		 * 그러면 함수 내부에서는 입력되는 데이터를
		 * no1, no2변수를 이용해서 처리하면 되겠다.
		 */
	}
//여기에 함수를 만들어도 되고
	public static void main(String[] args) {
		new Test02();
	}
//여기에 함수를 만들어도 되고
}
