//★★
package day14;

import day14.sub.*;
public class Test07 extends Class02 {
	String cName ="Test07";
	public Test07() {
//		super();
		//1.
		System.out.println(new Class00().getNo());
		
		//2.
		Class01 c1 = new Class01();
//		int num=c1.no;
		//같은 패키지가 아니니까, defaut로 설정되어있는 no를 못 가져옴.
		
		//3.
		String className = super.cName;
		//super는 상속해준 상위클래스를 나타내는 말 인듯?
		System.out.println(className);
		System.out.println(cName);
		
	}

	public static void main(String[] args) {
		new Test07();
	}
}
