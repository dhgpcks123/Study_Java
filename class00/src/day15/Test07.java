//★★
package day15;
/*
	문제 2]
		Dohyung 인터페이스를 구현한
			Sagak
			Samgak
			Won
		클래스를 구현하고
		
		랜덤하게 0 ~ 15까지 숫자를 발생시켜서
			3으로 나눈 나머지가 0이면 Won
			1  이면	Samgak
			2 면	Sagak
		을 만들고
		
		Dohyung 배열에 10개 채우고
		출력하세요.
*/
public class Test07 {
	Dohyung[] doh = new Dohyung[10];
	
	public Test07() {
		
		for(int i =0 ; i<doh.length; i++) {		
		int ran = (int)(Math.random()*16);
			int no1 = (int)(Math.random()*16+1);
			int no2 = (int)(Math.random()*16+1);
			switch(ran%3) {
			case 0 :
				doh[i] = new Sagak(no1, no2);
				break;
			case 1 :
				doh[i] = new Samgak(no1, no2);
				break;
			case 2 :
				doh[i] = new Won(no1);
				break;
				
				//초기화할 때 생성자함수 바로 사용된다.
				//뉴시키고 나중에 매개변수넣는다고 그게
				//생성자함수(매개변수)사용이 되는 게 아니다.
			}
		}
		toPrint();
	}
	//출력함수
	public void toPrint() {
		for(int i = 0 ; i<doh.length; i++) {
			doh[i].toPrint();
		}
	}
	public static void main(String[] args) {
		new Test07();
	}

}
//-----------------------------------------------------
class Sagak implements Dohyung{
	int width, height;
	double area;
	
	public Sagak(){}
	public Sagak(int width, int height){
		this.width = width;
		this.height =height;
		setArea();
	}
	
	public void setArea() {
		area = width*height;
	}
	public void toPrint() {
		System.out.println("사각"+width+","+height+" = "+area );
	}
}

class Samgak implements Dohyung{
	int width, height;
	double area;
	
	public Samgak() {}
	public Samgak(int width,int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	public void setArea() {
		area= width*height*0.5;
	}
	public void toPrint() {
		System.out.println("삼각"+width+","+height+" = "+area );
	}
	
}


class Won implements Dohyung{
	int rad;
	double area, arround;
	
	public Won() {}
	public Won(int rad) {
		this.rad = rad;
		setArea();
		setArround();
	}
	
	public void setArea() {
		area = (int)(rad*rad*Math.PI*100+0.5)/100.;
	}
	public void setArround() {
		arround = (int)(2*rad*Math.PI*100+0.5)/100.;
	}
	public void toPrint() {
		System.out.println("반지름"+rad+" 넓이"+area+" 둘레"+arround);
	}
	
}