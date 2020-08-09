//★★
//추상함수 상속
package day15;

public class Test04 {
	public Test04() {
		int no1= (int)(Math.random()*16+5);
		int no2= (int)(Math.random()*16+5);
		Figure nemo = new Nemo(no1, no2);
		Figure semo = new Semo(no1, no2);
		Figure dongle =new Dongle(no1);
		
		nemo.toPrint();
		semo.toPrint();
		dongle.toPrint();
		
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}

//-------------------------------
//추상함수로 뼈대를 만들어준다.
abstract class Figure{
	public abstract void setArea();
	public abstract void toPrint();
	//추상클래스 안에는 추상함수가 들어가겠지!
}

//-----------------------------------------
//public쓰면 안됨. 한 java파일내에서 public은 클래스하나만!
//public으로 쓸 것 같으면 자바 파일 자체를 나눠서 쓰도록 하세요/
class Nemo extends Figure{
	int width, height;
	double area;
	
	public Nemo() {}
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void setArea() {
		area = width*height;
	}
	public void toPrint() {
		System.out.print(width+" "+height+" "+area);
	}
	
}

//----------------------------------------
class Semo extends Figure{
	int width, height;
	double area;
	
	public Semo(){}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
	}
	//public abstract void 함수이름을 오버라이딩할때
	//public void 함수이름(){}으로 가져온다.
	public void setArea() {
		area = width*height*0.5;
	}
	public void toPrint() {
		System.out.println(width+" "+height+" "+ area);
		
	}
}

//-----------------------------------------------
class Dongle extends Figure{
	int rad;
	double area;
	public Dongle() {}
	public Dongle(int rad) {
		this.rad = rad;
	}
	
	public void setArea() {
		area = rad*rad*Math.PI;
	}
	public void toPrint() {
		System.out.println("반지름"+rad+"넓이"+area);
	}
	
}
