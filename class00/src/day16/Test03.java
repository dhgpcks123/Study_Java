//★★
//Top Level Inner Class
package day16;

public class Test03 {

	
	public Test03() {
		//Inner02 클래스 외부에서 TopIn객체 생성하기 위해서
		//Inner02 클래스 객체 생성할 필요 없다. 왜냐고? TopIn이 static이니까
		//근데 TopIn객체는 만들어줘야함.
		//이게 static에 올린다는 말이 객체를 만들어준다는 의미가 아니고....
		//거기 있는 내용 그대로 static에 올려준다는 의미임.
		//Inner02는 객체생성할 필요 없고, TopIn은 객체 생성해야함.
		
		//TopIn객체 생성
		Inner02.TopIn topin = new Inner02.TopIn();
		topin.no=(int)(Math.random()*10);
		System.out.println(topin.no); //인스턴스 필드 사용
		
		topin.xyz();
		Inner02.abc(); //static, 정적 메소드이기 때문에 사용가능
//		Inner02.tototo(); //사용불가능. Inner02는 객체생성안했기 때문에.
		//포인트는 static은 외부클래스 객체생성안하고 혼자 객체생성가능하단 것!

		//static이지만 둘다 객체 생성해주고 싶다~
//		Inner02.TopIn top = new Inner02().new TopIn(); 
		//전역 지역변수랑 다르게 한번에 객체형성x 이미 TopIn은 static에 올라감.
	
	}
	
	public static void main(String[] args) {
		new Test03();

	}

}

//------------------------------------------------------------
class Inner02{
	String abc;
	int num;
	static int no =10;	//static영역에 Inner02. int no = 10;
	
	static void abc() {
		System.out.println("여기는 Inner02 정적메소드");
	}
	void tototo() {
		System.out.println("여기는 Inner02 메소드");
	}
	
	////////////////Top Level Inner Class
	static class TopIn {
		TopIn(){};	//기본생성자
		int no;	//인스턴스 필드
		static int no1;	//정적 필드
		void xyz() {	//인스턴스 메소드
			System.out.println("TopIn.xyz()");
		}
	}
	
}