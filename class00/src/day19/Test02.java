//★★
//Random클래스
package day19;

import java.util.*;
public class Test02 {

	public Test02() {
		Random rd0 = new Random();
		Random o = new Random();
		Random rd = new Random(10); // Random(long타입)
		Random rd1 = new Random(10);
		//Random()안에 숫자넣으면 같은 난수가 발생됨. 왜냐고? seed에 저장되어있는 값을 꺼내오는 거라서!

		System.out.println(rd0); //이건 주소값을 뽑아와.
		System.out.println("rd0 : "+rd0.nextInt(1));
		System.out.println("rd0 : "+rd0.nextInt(10));
		System.out.println("rd0 : "+rd0.nextInt(100));
		System.out.println("rd0 : "+rd0.nextInt(1000));
		System.out.println("rd0 : "+rd0.nextInt(10000));
		System.out.println("rd0 : "+rd0.nextInt());
		System.out.println("o : "+o.nextInt());
		System.out.println("rd : "+rd.nextDouble());
		System.out.println("rd1 : "+rd1.nextInt());
		System.out.println("rd1 : "+rd1.nextInt(100));
		System.out.println("rd1 : "+rd1.nextInt(1000));
		
//		nextInt() Int형으로 반환해라.
//		nextDouble() Double형으로 반환해라
//		nextInt(정수) 넣으면 10넣으면 10까지, 100넣으면 <100 1000넣으면 <1000 
		//-1157793070

	}
	public static void main(String[] args) {
		new Test02();
	}
}
