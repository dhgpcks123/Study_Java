package day12;

public class Moyang{
	public static final int DONGLE =0;
	public static final int SEMO =1;
	public static final int NEMO =2;
	
	int width, height, rad, shape;
	double area;
	
	public Moyang() {
		this(10,10,NEMO);
	}
	public Moyang(int width, int height, int code) {
		shape = (code ==SEMO?SEMO:NEMO);
		this.width=width;
		this.height=height;
		getArea(code);
	}
	
}