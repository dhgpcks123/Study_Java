package day11;
/**
문제 2]
	1. 세모 한개를 만들고 데이터를 출력하기.
	
	2.
	세모 데이터 5개를 관리하는 배열을 만들고
	각 인스턴스의 변수를 초기화 해서
	내용을 출력하세요.
*/
public class Ex01 {
		Semo[] manySemo;
		public Ex01() {


			//1 세모 한 개를 만들고 데이터를 출력하자.
			Semo oneSemo = new Semo();
			int height = (int)(Math.random()*10-1+1)+1;
			int width = (int)(Math.random()*10-1+1)+1;
			oneSemo.getData(height, width);
		
			oneSemo.height = (int)(Math.random()*10-1+1)+1;
			oneSemo.width = (int)(Math.random()*10-1+1)+1;
			System.out.println(oneSemo.height+":"+oneSemo.width+" "+oneSemo.area);
		
			//2 세모 데이터 5개를 관리하는 배열을 만들고 각 인스턴스의 변수를 초기화해서 내용을 출력하세요.
			semoArr();
		}
		public void semoArr() {
			manySemo = new Semo[5];
			for(int i = 0; i<manySemo.length ; i++) {
				manySemo[i]= new Semo();
				int height = (int)(Math.random()*10-1+1)+1;
				int width = (int)(Math.random()*10-1+1)+1;
				manySemo[i].getData(height,width);
			}
			
		}
	public static void main(String[] args) {
		new Ex01();
	}

}

//--------------------------------------------------------------

class Semo{
	int height, width;
	double area;
	
	public void getData(int height, int width) {
		this.height = height;
		this.width = width;
		area = height*width*0.5;
		toPrint();
	}
	public void toPrint() {
		System.out.println("가로의 넓이" +height+"세로의 길이"+width+"의 넓이는"+area+"입니다.");
	}
	
}