//★★
//Won Compartor쓰기/ 무명클래스, 전역내부클래스, 외부 클래스
package day21;
/*
	랜덤하게 10 ~ 50 사이의 반지름을 가지는 Won을
	ArrayList에 10개 채우고
	출력하고
	정렬하고
	출력하세요... 3개의 출력방법
 */
import java.util.*;
public class Test07 {
	class MySort2 implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
				Circle c1 = (Circle)o1;
				Circle c2 = (Circle)o2;
				double result = c1.getArea()-c2.getArea();
				
				return -result > 0 ? 1 : -1 ;
		}
		
	}
	public Test07() {
		//ArrayList를 준비한다.
		ArrayList list = new ArrayList();
		// list에 Circle을 10개 채운다
		for(int i = 0 ; i <10 ; i++) {
			Circle won = getWon();
			list.add(won);
		}
		//출력한다.
		System.out.println("-----------------------1. 정렬 전----------------------");
		for(Object o : list) {
			System.out.println(o);
		}
		
		//정렬한다.
		//지금처럼 정렬기준이 없거나 정렬기준을 바꿔야 할 경우는
		//Comparator를 만들어서 Collections.sort(List list, Comparator c);

		//전역 내부 클래스 이용하는 방법-------------------------------------------------
		System.out.println("-------------2-1. 전역 내부 클래스 이용하는 방법-------------");
		Collections.sort(list, new MySort2()); // MySort1는 기준만들어주는 클래스인거지
			//출력한다.
			for(Object o : list) {
				System.out.println(o);
			}
			
		//무명 내부 클래스 이용하는 방법-------------------------------------------------
		System.out.println("-------------2-2. 무명 내부 클래스 이용하는 방법-------------");
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Circle c1 = (Circle)o1;
				Circle c2 = (Circle)o2;
				double result = c1.getArea()-c2.getArea();
				
				return result > 0 ? 1 : -1 ;
			}
			
		});
			//출력한다.
			for(Object o : list) {
				System.out.println(o);
			}
			
		
		
		//외부 클래스 이용하는 방법-------------------------------------------------
		System.out.println("-------------2-3. 외부 클래스 이용하는 방법-------------");
		Collections.sort(list, new MySort1()); // MySort1는 기준만들어주는 클래스인거지
			//출력한다.
			for(Object o : list) {
				System.out.println(o);
			}
			Collections.reverse(list);
			System.out.println("-----------------3. 내림차순 정렬 후-----------------");
			for(Object o : list) {
				System.out.println(o);
			}
		
		
	}
	
	//랜덤하게 반지름 만들어서 Won에 데이터 셋팅하고 넘겨주는 함수.
	public Circle getWon() {
		Circle won = new Circle();
		int no = (int)(Math.random()*41+10);
		won.setRad(no);
		won.setArea();
		won.setArround();
		return won;
	}

	public static void main(String[] args) {
		new Test07();
	}

}
