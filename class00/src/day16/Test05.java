//★★
//무명 내부클래스

package day16;

public class Test05 {

	public Test05() {
/*
		Ju j = new Ju();
		j.abc(); //
*/	
		/*
		new 상속해줄 클래스이름(){	//===> 상위클래스
			함수오버라이드..
		}
		*/
		//무명 내부클래스를 사용해서 오버라이드해서
		//인터페이스 바로 사용할거야...
		ji(new Io(){
			@Override
			public void abc() {
			System.out.println("안녕");
			}
			
		}
		);
		
		//이걸 사용하기 위해선?? 그냥 쓸 수 없음.
		
		
	}
	
	//함수 하나 정의
	void ji(Io i) {
		i.abc();
	}
	
	
	public static void main(String[] args) {
		new Test05();
	}	
}
	

//인터페이스를 만든다
interface Io{
	//뼈대를 잡는다.
	void abc();
}

		
//인터페이스 만드는 방법
//[접근지정자] [속성] interface 인터페이스이름.. {}매개변수없따쨔샤
//implements로 구현해줘야함. 몸이없는 클래스임. 다형성을 위해 사용
//인터페이스 내부 메서드 => public abstract 기본깔고 감
//인터페이스 내부 필드 => public abstarct final 기본깔고 감.
/*
class Ju implements Ifc{
	public void abc() {
		System.out.println("Ju");
	}
}
*/
//클래스 이름 시작은 대문자로!
//클래스 만드는 방법 - [접근지정자] [속성] class 클래스이름{ }
//반환값타입같은 거 없다... 뇨석아

