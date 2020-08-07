//★
//Dim~ Dimension설명하기 위해 만든 클래스
package day17;

public class Sagak {
	int width, height;
	double area;
	
	public Sagak() {}
	public Sagak(int width, int height) {
		this(new Dim(width, height));
	}
	public Sagak(Dim dim) {
		width = dim.width;
		height =dim.height;
		area = width*height;
				
	}
	
}

