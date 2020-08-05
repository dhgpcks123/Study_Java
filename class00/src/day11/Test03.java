//★★★
package day11;

public class Test03 {
	public Test03() {
		//원 객체 세개를 만들어보자.
		Circle c1 = getCircle();
		Circle c2 = getCircle();
		Circle c3 = getCircle();

		//방 세개짜리 배열을 만든다.
		//클래스 c1, c2, c3를 한번에 관리하기 위해서!
		Circle[] arr = new Circle[3];
		arr[0] = c1;
		arr[1] = c2;
		arr[2] = c3;
		
		//하나씩 꺼내서 출력해준다.
		for(int i = 0 ; i <arr.length ; i++) {
			System.out.println(arr[i].rad+" "+arr[i].arround+" "+arr[i].area);
		}
	}

	//변수선언하고 힙에 인스턴스 초기화해서 객체만드는 과정을 함수에다 정의한다!
	public Circle getCircle() {
		//객체만들어
		Circle c = new Circle();
		//반지름 랜덤하게 입력해서 값 추출하는 거까지 다 만들어버리자 여기서
		int rad = (int)(Math.random()*46+5);
		//변수를 셋팅해줘야 돼.
		c.setRad(rad);
		
		//데이터를 내보내고
		return c;
		//클래스가 밖으로 보내주는 값이 뭐냐~~ Cricle타입인데~ 그게 c다.
		//여기서 c는 new Circle해준값이야.
	}
	
	public static void main(String[] args) {
		new Test03();
		
	}
	
}
