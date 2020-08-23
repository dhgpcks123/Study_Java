//★★★★
//HashSet 기본사용
package day22;
/*
	10개의 문자열 데이터를 입력하고 
	내용을 확인해보자.
 */


import java.util.*;
public class Test01 {

	public Test01() {
		HashSet set = new HashSet();
		set.add("고길동");
		set.add("둘  리");
		set.add("고길동"); //중복
		set.add("희동이");
		set.add("철  수");
		set.add("영  희");
		set.add("마이콜");
		set.add("또  치");
		set.add("도우너");
		set.add("마이콜");
		
		// 저장된 갯수 확인
		System.out.println("set.size() : " + set.size());
		
		// 데이터를 꺼내서 출력
		/*
			Set 계열은 데이터를 꺼내는 함수가 존재하지 않는다.
			따라서 Iterator로 변환하던지
			아니면 List 계열로 변환해서 사용해야 한다.
		 */
		
//		방법 1 ] Iterator로 변환해서 사용하는 방법
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			String name = (String)itor.next();
			//Iterator에서 데이터를 꺼내는 함수는 next() 함수인데 반환값 타입이 Object이다.
			System.out.println(name);
		}
		
		
//		방법 2 ] ArrayList클래스를 활용해서 사용하는 방법
		System.out.println();
		ArrayList list = new ArrayList(set);
		for(Object o :list) {
			System.out.println(o);
		}
		
		//정렬한다.
		Collections.sort(list);
		System.out.println("\n#정렬 후 출력");
		for(Object o :list) {
			System.out.println(o);
		}//정렬된다?? String클래스 comparTo를 구현하고 있다. 옹???
		
//		방법 3 ] 향상된 for명령으로도 꺼낼 수 있다?? for명령쓰면...
			//정렬해준데. (?확실치않음)그런 함수가 있나봐.
			//아니야. 그런 기능 없음.
		System.out.println("\n#22정렬 후 출력22");
		for(Object o :set) {
			System.out.println(o);
			}
	}
	
	

	public static void main(String[] args) {
		new Test01();
	}

}
