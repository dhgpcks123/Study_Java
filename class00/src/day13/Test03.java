//★★
//초기화의 방법들
package day13;

public class Test03 {
	public static void main(String[] args) {
		System.out.println(Test03_01.no);
		//객체생성안해도 불러올 수 있는 이유? no는 static이잖아!
//		System.out.println(Test03_01.num);
		//이거 불러오려면 이렇게 써줘야함.
		Test03_01 te = new Test03_01();
		System.out.println(te.num1);
	}
}


//---------------------------

class Test03_01{
	static int no;
	int no1;
	int num1 =11; //명시적 초기화
	int num2 ;
	
	{	//초기화 블럭을 이용한 초기화.
		no1 =100;
		no =100;
		//초기화 블럭은 static, 변수 다 사용가능
	}
	static { //static 블럭을 이용한 초기화.
		no =1000;
		//static블럭 초기화는 static만 가능
	}

	public Test03_01() {}
	public Test03_01(int num2) {// 생성자함수를 이용한 초기화
		this.num2 = num2;
	}
	
}