//★★
//강제형변환
package day14;

public class Test08 {
	public Test08() {
		Object obj = new Test08_01();
//		obj.abc(); 이건 출력안돼. 지금 Test08_01이아니라 Object잖아.
		((Test08_01)(obj)).abc();
		//obj를 Test08_01로 강제형변환해서 abc()를 부르면 출력가능.
	}
	public static void main(String[] args) {
		new Test08();
	}
}


//---------------------------
class Test08_01 //extends Object 가 생략된거다. 안 쓰면 말이쥐.
//extends해서 상속받는다고해도 상속해준 부모클래스가 Object를 상속받고 있을거야.
{
	public void abc() {
		System.out.println("이 클래스는 Test08_01 클래스!");
	}
	
}