//★★
package day14;
/*
Figure 배열을 만들고 배열에 
Figure, Sagak, Semo, Dongle 을 랜덤하게 만들어서
0		1		2		3
10개를 기억시킨다.

그리고 하나씩 꺼내서
꺼낸것이 어떤 타입의 클래스인지를 판별해서 출력하세요.
*/
import static java.lang.Math.*;
public class Test05 {
	public Test05() {
		Figure[] fg = new Figure[10];
		
		for(int i = 0 ; i<fg.length ; i++) {
			int ran = (int)(random()*99);
			Figure type = null;
			switch(ran%4) {
			case 0 :
				type = new Figure();
				break;
			case 1 :
				type = new Sagak();
				break;
			case 2 :
				type = new Samgak();
				break;
			case 3 :
				type =new Dongle();
				break;
			}
			
			fg[i] = type;
		}
		
		
		for(int i = 0 ; i<fg.length ; i++) {
			String str ="";
			if(fg[i] instanceof Dongle) {
				str="동글";
			}else if(fg[i] instanceof Sagak) {
				str="사각";
			}else if(fg[i] instanceof Samgak) {
				str ="삼각";
			}else if(fg[i] instanceof Figure) {
				str="피규어";
			}
			System.out.println(fg[i]+ " 타입은? "+str);
		}
		
		
	}

	
	
	public static void main(String[] args) {
		new Test05();
	}
}
