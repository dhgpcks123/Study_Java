package day22.source;

import java.text.*;
public class Make01_Dongle {
	private int rad;
	private double area, arround;
	
	public Make01_Dongle() {}
	public Make01_Dongle(int rad) {
		this.rad =rad;
		setArea();
		setArround();
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public String getArea() {
		DecimalFormat form = new DecimalFormat("0000.00");
		String str=form.format(area);
		return str;
	}
	public void setArea() {
		this.area = Math.PI*rad*rad;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getArround() {
		DecimalFormat form = new DecimalFormat("0000.00");
		
		return form.format(arround);
	}
	public void setArround() {
		this.arround = 2*rad*Math.PI;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
//equals랑 hashcode 오버라이드해줄꺼야
	public boolean equals(Object o) {
		return this.rad == (((Make01_Dongle)o).getRad());
	}
	
	public int hashCode() {
		return 1;
		//hashCode 코드는 대문자!!!!!!!!!
	}
	@Override
	public String toString() {
		return "원 [rad=" + rad + ", area=" + getArea() + ", arround=" + getArround() + "]";
	}
	
}
