//★★★
package day02;
/*
10이라는 반지름을 기억할 변수를 만들어서 초기화하고
초기화된 반지름을 가지는 원의 넓이와 둘레를 기억할 변수를 만들어서 초기화 하세요.
*/
public class Test06 {
	public static void main(String[] args) {
		//상수 파이 선언 및 초기화
		final float PI = 3.14f;// 리터럴 형변환시 대소문자 구분안함.
		//fianl은 뭐야??
		int ban = 10;
		float area = (2*PI*ban);
		float arround = PI *ban *ban;
		
		System.out.println(area+"<-반지름, 둘레->" + arround);
	}
}
