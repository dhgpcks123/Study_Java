package day22.source;

public class Nemo {
	private int garo, sero, area;
	
	public Nemo() {
	}
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		
//		System.out.println("가로 : "+ garo + "  세로 : " + sero);
		setArea();
	}
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
//면죽 셋팅해주는 함수
public void setArea() {
	area = garo*sero;
}
public void setArea(int area) {
	this.area = area;
}
	




	//equals() 함수 오버라이딩 면적이 같으면 같은 사각형되도록
//	public boolean equals(Object o) {
///*
//		Nemo n = (Nemo)o;
//		boolean bool = this.area == n.area();
//		return bool;
//
//		return this.area == ((Nemo)o).area;
//*/
//		return (this.sero == ((Nemo)o).getSero());
//		
//	}
//	public int hashCode() {
//		return 1;
//	}
	/*
		HashSet은 내부적으로 해쉬코드를 사용해서 데이터를 정렬하고 저장한다.
		같은 데이터라는 것은 같은 해쉬코드를 갖는다는 것이 될 것이다.
		
		해쉬코드 값이 같아야 같은 데이터로 처리한다.
		따라서 hashCode() 함수를 오버라이드 해야하는데
		같은 클래스 일 경우 자동호출되는 함수이다.
		HashTable에 있고.. 그 안에서 하나씩 꺼내와서 쓴다.
		true가 반환되면 이 값을 꺼낸다?????
	 */
	@Override
	public String toString() {
		return "Nemo [garo=" + garo + ", sero=" + sero + ", area=" + area + "]";
	}
	
	
	//hashCode()도 java.lang.Object 패키지에 포함되어있다. 그래서 쓸 수 있음.
//	public int HashCode() {
//		return 1;
//	}
//	public int hasCode() {
//		return -1;
//	}

	
}