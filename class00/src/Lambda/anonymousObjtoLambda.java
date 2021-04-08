package Lambda;

import java.util.Arrays;
import java.util.*;
import java.util.List;

public class anonymousObjtoLambda {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
		
//		Collections.sort(List list, Comparator c)
//		Comparator c = (s1, s2)->s2.compareTo(s1);
		
		Collections.sort(list, new Comparator<String>() {
								public int compare(String s1, String s2) {
									return s2.compareTo(s1);
								}
						});
		//이런 식으로 사용했던 거 기억난다. 여기서 무명객체 만들어서 바로 집어넣는 방식으로 구현했었음. comparator쓸 때!
		//람다식 사용할 수 있음 아주 간단해졌음!
		Collections.sort(list, (s1,s2)->s2.compareTo(s1));
		
		Comparator<String> compare = (s1,s2)->s2.compareTo(s1);
		Collections.sort(list, compare);
		//이렇단 말은. Compartor로 만들어진 Functional Interface가 있단 말인 것 같은데?
	}
}