package day22.source;

import day21.Won;

public class Samgak{
	private int width, height;
	private double area;

	public Samgak() {}
	public Samgak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}

	public void setArea() {
		this.area = width*height*0.5;
	}
	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Samgak [width=" + width + ", height=" + height + ", area=" + area + "]";
	}

	@Override
	public boolean equals(Object o) {
		
		return width == ((Samgak)o).width;
	}
	
	public double hashcode() {
		return width;
	}

	
}
