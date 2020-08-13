package day21;

import java.text.*;
public class Samgak {
	private int height, width;
	private double area;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double getArea() {
		return area;
	}
	public String getArea(int a) {
		DecimalFormat decimal = new DecimalFormat("0000.00");
		String str = decimal.format(area);
		return str;
	}
	public void setArea() {
		area = height*width*0.5;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Samgak [height=" + height + ", width=" + width + ", area=" + getArea(5) + "]";
	}

}
