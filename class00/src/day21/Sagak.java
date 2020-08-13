package day21;

public class Sagak {
	private int height, width, area;

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

	public int getArea() {
		return area;
	}
	public void setArea() {
		this.area = height*width;
	}
	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Sagak [height=" + height + ", width=" + width + ", area=" + area + "]";
	}
	
}
