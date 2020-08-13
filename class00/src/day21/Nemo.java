package day21;
/*
	이 클래스처럼 크기비교가 불가능한 경우에는
	크기비교가 가능하도록 Comparable 인터페이스를 구현해줘야한다.
 */
public class Nemo implements Comparable{
	private int garo, sero, area;


	public int getGaro() {
		return garo;
	}

	public void setGaro(int garo) {
		this.garo = garo;
	}

	public int getSero() {
		return sero;
	}

	public void setSero(int sero) {
		this.sero = sero;
	}

	public int getArea() {
		return area;
	}

	public void setArea() {
		area = garo*sero;
	}
	public void setArea(int area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Nemo : garo=" + garo + ", sero=" + sero + ", area=" + area;
	}

	@Override
	public int compareTo(Object o) {
		//데이터타입 같은 다른 객체 비교할건데, 이름 그 때 그 때 다를텐데
		//그걸 정해놓을 수가 없는거- 그래서 Object매개변수로 다 받는다로 설정해놓은 거.
		Nemo n = (Nemo)o;
		// 이제 필요한 데이터가 준비됐으니 
		// 비교 기준을 정해준다.
		// 우리의 경우 면적(area)를 기준으로 하기로 하자.
		int area1 = n.getArea();
		int result = area - area1; // 큰 숫자 중간 숫자 작은숫자 sort처리해줄꺼거든! 정렬됨
		return /*- 붙이면 역정렬되어 내림차순*/result;
	}
}
