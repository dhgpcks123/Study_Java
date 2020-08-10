package day18;
/*
	사각형의 면적이 같으면 같은 사각형이 되도록
	클래스를 정의하세요.
 */

import javax.swing.JOptionPane;

public class Test03 {

	public Test03() {
		//가로세로가 각각 2, 3 그리고 3,2인 두 사각형을 비교해보자.
		Nemo n1 = new Nemo(2,3);
		Nemo n2 = new Nemo(3,2);
		
		String msg = "가로/세로가 각각 2, 3 그리고 3, 2인 두 사각형은 "+
					(n1.equals(n2) ? "\"같은\" ": "\"다른 \"")+ "사각형입니다.";
		JOptionPane.showMessageDialog(null, msg);
		
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}


//--------------------------------------

class Nemo/*extends Object*/ {
	int width, height;
	double area;
	public Nemo() {
		this(1,1); //Nemo(1,1)로 호출해야 하지만 그건 안됨. this(1,1)사용
	}//this()오버로딩된 다른 생성자함수를 쓰는 방법.
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	public void setArea() {
		area = width*height;
	}
	public void setArea(int width, int height) {
		area = width*height;
	}
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		// 현재 실해중인 이 객체와 매개변수로 입력된 객체를 비교를 해야 하므로
		// 매개변수로 입력된 Object는 분명히 Nemo타입의 객체일 것이다.
		// 따라서 Object를 Nemo타입으로 형변환해줘야하고
		// 이 경우는 Object가 더 넓기 때문에 강제형변환이 되어야 한다.
		Nemo n = (Nemo) o;
		if(this.area == n.area) {
			bool = true;
		}
		
		return bool;
	}
	
}