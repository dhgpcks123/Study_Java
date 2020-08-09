//★★
//매개변수에서 일어나는 자동형변환
package day15;

public class Test02 {

	public Test02() {
		//Sub1의 abc()가 실행되어야할 경우
		MainTest s1 = new Sub1();
		xyz(s1); //MainTest t = s1;
				//s1.abc();
		Sub1 ss1 = new Sub1();
		xyz(s1);
		//MainTest t로 들어가면서 자동형변환 일어남.
		
		Sub2 s2 = new Sub2();
		xyz(s2);
		//xyz(MainTest t <= Sub2();객체)
		//Sub2.abc();
		
		Sub3 s3 = new Sub3();
		xyz(s3);
		
		
	}
	public static void main(String[] args) {
		new Test02();
	}
	public void xyz(MainTest t) {
		t.abc();
	}
}

//--------------------------------------------------

class MainTest{
	public void abc() {
		System.out.println("여기는 메인");
	}
}



class Sub1 extends MainTest{
	public void abc() {
		System.out.println("여기는 sub1");
	}
}



class Sub2 extends MainTest{
	public void abc() {
		System.out.println("여기는 sub2");
	}	
}


class Sub3 extends MainTest{
	public void abc() {
		System.out.println("여기는 sub3");
	}	
}