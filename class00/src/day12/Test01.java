//★★
package day12;

public class Test01 {
	//여태 자동으로 만들어줬던 생성자 함수 생성하고
	//클래스를 사용하기 위해서
	double area;
	
	public Test01() {
		setArea(10, 5);
		System.out.println(area);
		
		System.out.println(setArea(10));
		
		//위에껀 변수 설정해줘서 반환값void로 해주고 변수 자체에다가 값을 입력하는 방식으로했고,
		//밑에껀 반환값으로 해서 함수 자체에 반환값으로 돌려주고, 그걸 area에 대입해서 area를 출력했다.
		//그래서 함수 자체를 출력하는 것도 가능하다.
	}
	

	
	//메인함수 만들고
	
	public static void main(String[] args) {
		//가장 먼저 힙에 오브젝트만들어주고.
		new Test01();
	}



//	사각형 넓이 구해주는 함수
	public void setArea(int width, int height) {
		area = width* height;
	}

	
	//원의 넓이를 계산해서 반환해주는 함수
	public double setArea(double rad) {
		return (int)(rad * rad *3.14*100+0/5)/100.;
	}

}
