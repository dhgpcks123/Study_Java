//★
//Won
package day21;
/*
	랜덤하게 10 ~ 50 사이의 반지름을 가지는 Won을
	ArrayList에 10개 채우고
	출력하고
	정렬하고
	출력하세요...
 */
import java.util.*;
public class Test06 {

	public Test06() {
		//ArrayList 객체하고
		ArrayList list = new ArrayList();
		
		//ArrayList에 Won클래스 10개 넣고
		for(int i = 0 ; i<10 ; i++) {
			list.add(setWon());
			
		}
		//출력
		System.out.println("Won타입 won 10개 ArrayList에 채우고 출력");
		for(int i = 0 ; i<10 ; i++) {
		System.out.println(list.get(i));
		}
		
		//오름차순 정렬
		Collections.sort(list);
		System.out.println();
		System.out.println("오름차순 정렬해서 출력 'Collections.sort()' 사용");
		for(int i = 0 ; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
		System.out.println("######################################");
		System.out.println("list 0번째 들어있는 won클래스의 area : "
							+((Won)list.get(0)).getArea());
		
		
	}
	//Won클래스를 셋팅해줄 함수 만들고
	public Won setWon() {
		Won won = new Won();
		int no = (int)(Math.random()*41+10);
		won.setRad(no);
		won.setArea();
		won.setArround();
		return won;
	}

	public static void main(String[] args) {
		new Test06();
	}

}
