//★★★
//HashSet와 Hash코드 불러오기
package day22;

import java.util.*;
public class Test05 {

	public Test05() {
		HashSet set = new HashSet();
		set.add("고길동");
		set.add("둘리");
		set.add("고길동"); //중복
		set.add("희동이");
		set.add("철수");
		set.add("영희");
		set.add("마이콜");
		set.add("또  치");
		set.add("도우너");
		set.add("마이콜");
		
		for(Object o : set) {
			System.out.println(String.format("%-6s", o) + " | " + String.format("%-8d", o.hashCode()));
		}
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
