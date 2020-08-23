package day22;

import java.util.*;
import day22.source.*;
public class Test {

	public Test() {
		TreeMap map = new TreeMap(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				return ((Nemo)o1).getArea()-((Nemo)o2).getArea()>0?1:-1;
			}
		});
		
		for(int i = 0 ; i<5 ; i ++) {
			map.put(i+1+"번째 사각형",new Nemo((int)(Math.random()*10+1),(int)(Math.random()*10+1)));
		}
		
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
		new Test();
	}
}
