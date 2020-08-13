//★
package day21;

//반지름 ArrayList 10개 채우고
//10개 정렬해서 출력하세요.
import java.text.*;
public class Won implements Comparable{

	private int rad; //반지름 기억할 변수
	private double arround; //둘레 기억할 변수
	private double area; //둘레 기억할 변수
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public String getArround(int code) {
		DecimalFormat form = new DecimalFormat("##########.##");
		String str = form.format(arround);
		return str;
	}
	public void setArround() {
		this.arround = 2*Math.PI*rad;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public double getArea() {
		return area;
	}

	public void setArea() {
		this.area = ((int)(rad*rad*Math.PI*100+0.5)/100.);
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		// 우리가 만드는 모든 클래스는 Object 클래스를 상속받아서 만드는 클래스가 되므로
		// Object가 가지고 있는 멤버는 모두 가지고 있게 된다.
		return "Circle : rad=" + rad + ", arround=" + getArround(0)+ ", area=" + area;
	}
	@Override
	public int compareTo(Object o) {
		Won won = (Won)o;
		int result = rad - won.getRad();
		
		return -result;
		/*	area비교
		Won won = (Won)o;
		double area1 = won.getArea();
		
		return (area-area1)<0?-1:1;
		*/
	}
	
}
