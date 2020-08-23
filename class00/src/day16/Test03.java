//★★★★
//Top Level Inner Class
package day16;

public class Test03 {

	
	public Test03() {
/*Inner02클래스 외부에서 TopIn객체 생성하기 위해서
 Inner02 클래스 객체를 생성할 필요없다. 왜? TopIn은 Static이니까!
 근데 TopIn객체는 만들어줘야함.
 이게 Static에 올린다는 말이 객체를 만들어준다는 의미가 아니고..
 거기 있는 내용 올려준다는거임. new 안해도 쓸 수 있다는 말이지
 그니까 Inner02 new안해줘도 되는거지!
 즉, Inner02는 객체 생성할 필요 없고, TopIn은 객체 생성해야함.
 */
		
		//TopIn객체 생성
		Inner02.TopIn top = new Inner02.TopIn();
//		Inner02.TopIn top1 = Inner02.new TopIn();
//		이거 안됨. Inner02가 new안되어있거든! 나는 Inner02.TopIn()을 new할꺼야.
		top.no = (int)(Math.random()*10);
		System.out.print(top.no);
		
		top.xyz();
		Inner02.abc();//이것도 정적메소드이기 때문에 사용가능.
//		Inner02.tototo();//못 써. 객체생성 안해줬네.
		//static은 외부클래스 객체생성안하고 혼자 객체생성가능하단다~
		
		//static이지만 둘다 객체 생성해주자~
//		Inner02.TopIn two = new Inner02().new TopIn();
		//전역 지역변수랑 다르게 한번에 객체형성x 이미 TopIn은 static에 올라감
		//Inner02 new시켜줄 때 TopIn이 방해함??
		Inner02 jjj = new Inner02();
		
	}
	
	public static void main(String[] args) {
		new Test03();

	}

}

//------------------------------------------------------------
class Inner02{
	String abc;
	int num;
	static int no=10; //static영역에 Inner02.int no =10;
						//객체생성안해도 사용가능static
	
	static void abc() {
		System.out.println("여기는 이너02 정적메소드");
	}
	void tototo() {
		System.out.println("여기는 이너02 메소드");
	}
	//탑레벨이너클래스
	static class TopIn{
		TopIn(){}; //기본생성자 만들 수 있음.
		int no;	//인스턴스 필드
		static int no1;	//정적 필드
		void xyz() {	//인스턴스 메소드
			System.out.println("TopI.xyz()이다");
		}
//		static ab2() {	//정적 메소드는 못 만드네?? 아니 만들필요가 없지.
						//어짜피 클래스가 static인디?
//			System.out.println("정적메소드입니다.");
//		}
	}
	
}