//★
//TreeMap

package day22;

/*
	TreeMap에 사각형1, 사각형2, .. 라는 키값을 갖는
	Nemo 데이터 5개를 입력하고 출력하자.
*/

import java.util.*;
import day22.source.*;
public class Test09 {

	public Test09() {
		TreeMap map =new TreeMap();
		for(int i = 0 ; i< 5 ; i++) {
			map.put("사각형"+(i+1)+"번째 ",
					new Nemo((int)(Math.random()*13+3),(int)(Math.random()*13+3)));
		}
		
		// 각 사각형의 면적을 출력해보자.
		// 모두 출력하려면 키값을 모두 알아야한다.
		// 따라서 키값만 먼저 꺼내오자.
		Set set = map.keySet();
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			String key = (String) itor.next();
			//	int value = ((Nemo)map.get(key)).getArea(); 밑에 두개 한방에 쓴거임
			Nemo n = (Nemo) map.get(key);
			int value = n.getArea();
			System.out.print("key : "+ key + " | 면적 " + value + "\n");
			System.out.println(n);
			}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
