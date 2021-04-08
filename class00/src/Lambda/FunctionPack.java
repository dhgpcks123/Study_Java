package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionPack {
	public static void main(String[] args) {
		Supplier<Integer> s = () -> (int)(Math.random()*100)+1; //1 ~100 난수
		Consumer<Integer> c = i -> System.out.print(i+", ");
		Predicate<Integer> p = i -> i%2==0; //짝수 검사
		Function<Integer, Integer> f = i -> i/10*10; // i의 일의 자리를 없앤다.
		// 얘네 람다식을 쓰기 위해서는 인터페이스 구현해서 만들어둬야하는데,
		// 매개변수 1개, 2개는 그냥 쓸 수 있도록 자바에서 제공해주고 있다.
		
		List<Integer> list = new ArrayList<>();
		makeRandomList(s, list); // list를 랜덤 값으로 채운다.
		System.out.println(list);
		
		printEvenNum(p, c, list);
		
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
	}
	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());
		
		for(T i: list) {
			newList.add(f.apply(i)); // 일의 자리를 없애서 새로운 list에 저장
		}
		// TODO Auto-generated method stub
		return newList;
	}
	//makeRandomList해주는 함수
	// Supplier<T> s를 받고, list를 받아서 list에 s.get()하면 이건 안에 내용을 가져오는건가?
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i = 0 ; i<10 ;i ++) {
			list.add(s.get()); // Supplier로 부터 1~100의 난수를 받아서 list에 추가.
		}
	}
	//printEvenNum해주는 함수
	//	Consumer<Integer> c = i -> System.out.print(i+", ");
	//	Predicate<Integer> p = i -> i%2==0; //짝수 검사
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i)) //짝수인지 검사.
					c.accept(i); // Consumer<Integer> c = i -> System.out.print(i+", "); 화면에 i 출력
		}
		System.out.println("]");
	}
}
