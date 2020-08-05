//★★★
package day11;

public class Test01 {
	//Heap Type이 Moyang[]인 변수를 만들자.
	Moyang[] m1;
	public Test01() {
		m1 = new Moyang[5];
		
		
		//힙 타입을 만들어줘야지. 귀찮으니까 반복문으로 한방에 처리했다~
		for(int i = 0 ; i <m1.length ; i++) {
			m1[i] = new Moyang();
		}
		
		//데이터 입력해주고
		m1[0].figure = "삼각형";
		m1[1].figure = "사각형";
		m1[2].figure = "원  형";
		m1[3].figure = "타원형";
		m1[4].figure = "삐딱형";
		
		for(int i = 0 ; i <m1.length ; i++) {
			System.out.println(m1[i].figure);
		}
	}
	public static void main(String[] args) {
		new Test01();
	}
}
