package day13;

public class Test02 {
	static int num = 10;
	int no = 100;

		
	
	public static void main(String[] args) {
		System.out.println(Test02.num);
		Test02 t1 = new Test02();
		System.out.println(t1.no);
		
		new Test02_01();
		System.out.println(Test02.num);
	}
}


//---------------------

class Test02_01{
	
	public Test02_01() {
		Test02.num = 2099;
	}
}