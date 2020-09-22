/*
 0,1,2를 랜덤으로 입력받아서
 원형, 삼각형, 사각형.. 다른 도형으로 10개를 만들어주고
 그걸 배열에 담은다음에 출력해줘~ toPrint쓰고
 */
package day12;

public class Ex05 {
	public Ex05() {
		Moyang[] m1 = new Moyang[10];
		for(int i = 0 ; i < m1.length ; i++ ) {
			int sh = (int)(Math.random()*3);
			int no1 = (int)(Math.random()*16 + 5);
			if(sh == 0) {
				m1[i] = new Moyang(no1);
				continue;
			}
			int no2 = (int)(Math.random()*16 + 5);
			m1[i] = new Moyang(no1, no2, sh);
		}
		// 출력하기
		for(Moyang m : m1) {
			m.toPrint();
		}
	}
	public static void main(String[] args) {
		new Ex05();
	}
}
