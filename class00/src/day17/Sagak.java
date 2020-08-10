//★★
//.preferredSize(Dimension(10,15));를 쓰는 이유라는데... 왜 굳이 쓰는걸까?
package day17;

public class Sagak {
	int width, height;
	double area;
	
	public Sagak() {}
	public Sagak(int width, int height) {
		
	}
	public Sagak(Dim dim) {
		width = dim.width;
		height = dim.height;
		area = width*height;
	}
}
