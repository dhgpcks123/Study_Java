//★★
package day18;
/*
	사각형의 면적이 같으면 같은 사각형이 되도록
	클래스를 정의하세요.
	
	//equals함수를 오버라이드하세요.
 */
public class Test03 {
	public Test03() {
		
		Sagak n1 =new Sagak(2,3);
		Sagak n2 =new Sagak(3,2);
		
		String msg =(n1.equals(n2)?"같은":"다른");
		System.out.println(msg);
	}
	public static void main(String[] args) {
		new Test03();
	}
}

//---------------------------------------------

class Sagak/*extends Object*/{
	int width, height;
	double area;
	public Sagak() {
		this(1,1);
	}
	public Sagak(int width, int height) {
		this.width = width;
		this.height =height;
		getArea();
	}
	
	public void getArea() {
		area = width*height;
	}
	
	@Override
	public boolean equals(Object o) {
		return this.area == ((Sagak)o).area;
		/*
		 * boolean bool = false;
		 * Sagak n = (Sagak)new o;
		 * if(this.area = n.area){
		 * bool = ture}
		 * return = boole
		 * 
		 *현재 실행중인 이 객체와 매개변수로 입력된 객체를 비교해야됨.
		 *매개변수로 입력된 Object는 분명 Nemo타입 객체일테고.
		 *따라서 Object를 Nemo타입으로 형변환해줘야되는데
		 *Object가 더 넓으니까 강제형변환해줘.
		 */
		
	}
	
	
}