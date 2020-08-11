//★★
package day19;

public class Test01 {

	public Test01() {
		Object obj = 10;
		/*
		 	먼저 리터럴 풀에 담긴 데이터를 클래스 타입으로 변형시켜줘야 한다.
		 		int ==> Integer
		 	자동 형변환이 된다.
		 		Integer ==> Object
		 */
		
		Object str = "abcd"; //자동형변환 일어났음.
		
		String str1 = (String)str; //강제형변환
		
		//int no = null;
		//기본형데이터, null은 참조형타입에 주소값이 없다는 걸 의미한다.
		//즉 null은 주소값이 x다.

//		Integer no = null;
//
//		int num = no;
//		int num1;
//		System.out.println(num);
//		System.out.println(num1);
	}
	public static void main(String[] args) {
	new Test01();
	
	}
}