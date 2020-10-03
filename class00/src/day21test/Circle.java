package day21test;

public class Circle {
	private int rad;
	private double arround;
	private double area;
	
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArround() {
		return arround;
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
		this.area = rad*rad*Math.PI;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Circle [rad=" + rad + ", arround=" + arround + ", area=" + area + "]";
	}
	
}
