//★★★
package day11;

public class Test05 {
		public Test05() {
			//네모 데이터를 5개 가지는 배열을 만들고 출력하세요!
			
			//1. 배열부터 만든다.
			Nemo[] nemo = new Nemo[5];
			
			/*
			nemo[0] = new Nemo();
			nemo[1] = new Nemo();
			nemo[2] = new Nemo();
			nemo[3] = new Nemo();
			nemo[4] = new Nemo();
			*/
			//객체를 만드는 과정이다.
			for(int i = 0 ; i<nemo.length; i++) {
				nemo[i] =new Nemo();
				
				//객체가 만들어지면 변수를 초기화해준다
				int garo = (int)(Math.random()*16+5);
				int sero = (int)(Math.random()*16+5);
				nemo[i].setNemo(garo, sero);
			}
//오 이건 왜 이렇게 쓰는거지? 향상 된 for문 공부가 필요함.
			for(Nemo n : nemo) {
			System.out.println(n.garo+" "+n.sero+" " + n.area);	
			}
		}
		
		
	public static void main(String[] args) {
		new Test05();
	}
}


//----------------------------------------------------------
class Nemo{
	int garo, sero, area;
	
	//가로와 세로를 입력하면 모든 변수가 초기화가 되는 함수
	public void setNemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		area = garo*sero;
	}
}