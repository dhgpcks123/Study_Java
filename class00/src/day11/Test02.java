//★★★
package day11;

public class Test02 {
	//변수를 선언해준다.
	Moyang mo1, mo2, mo3;
	
	public Test02() {
		setData();
		toPrint();
	}
	
	//초기화해서 객체 Moyang이 만들어졌어 해주는 함수를 만들꺼야
	public void setData() {
		//Moyang 객체 세개를 만들어서 데이터를 채워보자.
		mo1 = new Moyang();
		mo2 = new Moyang();
		mo3 = new Moyang();
		
		//각각의 힙에 올려져있는 인스턴스 변수에 데이터를 채워보자.
		mo1.figure ="최신형";
		mo2.figure ="중고형";
		mo3.figure ="동네형";
	}
	
	//전역변수의 내용을 출력해주는 함수를 만들어보자.
	public void toPrint() {
		System.out.println(mo1.figure);
		System.out.println(mo2.figure);
		System.out.println(mo3.figure);
	}
	public static void main(String[] args) {
		new Test02();
	}
	
}
