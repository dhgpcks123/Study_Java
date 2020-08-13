package addCls01;

import java.util.*;
public class Test03 {

	public Test03() {
		Object o = "abcd";
		System.out.println(o.equals("abcd"));
		
		//함수는 인스턴스 쪽을 따른다.
		//여기서 equals는 abcd쪽을 따라. String에서 오버라이딩한 equals임.
		//만약 아니었으면 false가 나오겠지.
		
		Comparator c1 = new MyComp01(); 
		System.out.println(c1.compare("abc","ab"));

		
		Comparator[] cArr = new Comparator[3];
		cArr[0] = new MyComp01();
		cArr[1] = new MyComp02();
		cArr[2] = new MyComp03();

		for(int i = 0 ; i<cArr.length ; i++) {
			System.out.print(cArr[i].compare("abc", "efg")+" | ");
		}
//		for(int i = 0 ; i<cArr.length ; i++) {
//			System.out.print(cArr[i].compare()+" | ");
//		}Comparator는 compare() 모르는 함수야. 호출 안됨.
	}

	public static void main(String[] args) {
		new Test03();
	}

}


class MyComp01 implements Comparator{
	public int compare(Object o1, Object o2) {
		return 100;
	}
	public int compare() {
		return 100;
	}
	
}
class MyComp02 implements Comparator{
	public int compare(Object o1, Object o2) {
		return 200;
	}
	public int compare() {
		return 200;
	}
	
}
class MyComp03 implements Comparator{
	public int compare(Object o1, Object o2) {
		return 300;
	}
	public int compare() {
		return 300;
	}
	
}