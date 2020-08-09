//★★
package day14;
//자동형변환과 instanceof로 상속관계 알아보기
public class Test02 {
	public Test02() {
		Figure f1 = new Figure();
		Figure f2 = new Sagak(15, 30);
		Figure f3 = new Samgak();
		Sagak s1 = new Sagak();
		Samgak s2 = new Samgak();
		Dongle d1 =new Dongle();
//		Sagak s33 = new Samgak();
		
		System.out.println(s1 instanceof Sagak); //true
		System.out.println(s1 instanceof Figure); // true
		System.out.println((Figure)s1 instanceof Samgak); //false;
		System.out.println(f1 instanceof Figure); //true
//		System.out.println((Sagak)f1 instanceof Sagak); 
		//형변환은 되지만 에러가난다... f1은 사각형의 요소가 없따!
		System.out.println(f1 instanceof Samgak); //false
		System.out.println(f1 instanceof Dongle); //false
		
		
	}
	public static void main(String[] args) {
		new Test02();
	}

}
//--------------------------------------------------------
class Figure{
double getArea() {
		return 0.0;
	}
	public String toString() {
		return "이것은 도형입니다.";
	}
}

//----------------------------------------------------------

class Sagak extends Figure {
	int width, height;
	double area;
	
	public Sagak() {
		this(1, 1);
		//원칙은 this.Sagak(1,1)호출해야하지만 생성자함수는
		//일반함수처럼 사용할 수 없다.
		
	}
	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		area = getArea();
	}
	public double getArea() {
		return width*height;
	}
	public String toString() {
		return "이 도형은 가로가 " + width + 
				" 이고 세로가 " + height + 
				" 이고 넓이가 " + area + 
				" 인 사각형입니다.";
	}
}

class Samgak extends Figure {
	int width, height;
	double area;
	
	public Samgak() {
		this(1, 1);
		//원칙은 this.Sagak(1,1)호출해야하지만 생성자함수는
		//일반함수처럼 사용할 수 없다.
		
	}
	public Samgak(int width, int height) {
		this.width = width;
		this.height = height;
		area = getArea();
	}
	public double getArea() {
		return width*height;
	}
	public String toString() {
		return "이 도형은 가로가 " + width + 
				" 이고 세로가 " + height + 
				" 이고 넓이가 " + area + 
				" 인 삼각형입니다.";
	}
}

class Dongle extends Figure {
	int rad;
	double arround, area;
	
	// 생성자 함수
	public Dongle() {
		this(1);
	}
	
	public Dongle(int rad) {
		this.rad = rad;
		area = getArea();
		setArround();
	}
	
	public double getArea() {
		return rad * rad * 3.14;
	}
	
	// 둘레 변수 초기화 해주는 함수
	public void setArround() {
		arround = ((int)(2 * rad * 3.14 * 100 + 0.5)) / 100.0;
	}
	
	public String toString() {
		return "이 도형은 반지름이 " + rad + 
				" 이고  둘레가 " + arround + 
				" 이고 넓이가 " + area + 
				" 인 원입니다.";
	}
}

