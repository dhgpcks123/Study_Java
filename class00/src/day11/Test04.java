//★★★
package day11;

public class Test04 {
	public Test04() {
		//사각형을 하나 만들고 면적을 출력해보자.
		Sagak s01 = new Sagak();
		int width = (int)(Math.random()*9+2);
		int height = (int)(Math.random()*9+2);
		
		s01.width = width;
		s01.height = height;
		s01.area = s01.width*s01.height;
		
		System.out.println(s01.width+" "+s01.height+" "+s01.area);
		
		Sagak s02 = new Sagak();
		s02.width = (int)(Math.random()*9+2);
		s02.height = (int)(Math.random()*9+2);
		s02.area = s02.width*s02.height;
		System.out.println(s02.width+" "+s02.height+" "+s02.area);
	}
	public static void main(String[] args) {
		new Test04();
	}
}

//-------------------------------------------------
class Sagak {
	int width, height, area;
}