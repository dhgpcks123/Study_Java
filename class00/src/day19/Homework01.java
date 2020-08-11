//★
package day19;

/*
	과제 1 ]
		nextInt()
		nextInt(int bound) 차이점을 조사해서 예제를 만들어 볼 것
		
	과제 2 ]
		특정 범위의 난수를 발생하는 방법에 대해서 조사해서
		이것을 이용한 프로그램을 작성하세요.
 */
import java.util.*;
public class Homework01 {
	Random no1 = new Random();
	Random no2 = new Random();

	public Homework01() {

		//Random클래스를 이용해 난수발생
		Random ran = new Random();
		System.out.println(ran);//하면 객체주소출력
		System.out.println("---------------");
		System.out.println(ran.nextInt());//하면 인트형타입으로 난수 출력
		System.out.println("---------------");
		System.out.println(ran.nextInt(10));//하면 인트형타입으로 0<= 난수< 10 출력
		System.out.println("---------------");
		System.out.println(ran.nextInt(5));//하면 인트형타입으로 0<= 난수< 5 출력
		System.out.println("---------------");
		System.out.println(ran.nextInt(5)+1);//하면 인트형타입으로 1<= 난수< 6 출력
		
		//예제 ] 5~10사이의 랜덤값을 가로로 갖고, 11~200사이의 랜덤값을 세로로 갖는 네모의 넓이을 반환하는 함수 만드세요

		System.out.println("####네모의 넓이####");
		System.out.print(setData());
	}
	public int setData() {
		int area;
		area = (no1.nextInt(10)+5)*(no2.nextInt(200)+11);
		return area;
	}

	public static void main(String[] args) {
		new Homework01();
	}

}
