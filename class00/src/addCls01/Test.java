package addCls01;
import java.text.*;
import static java.util.Calendar.*;
import java.util.*;
public class Test {
	public Test() {
		ArrayList list = new ArrayList();
		
		for(int i = 0 ; i <10 ; i++) {
			list.add((int)(Math.random()*10+1));
		}
		System.out.println("정렬전");
		for(int i = 0 ; i<list.size();i++) {
			System.out.print(list.get(i));
		}
		Collections.sort(list);
		System.out.println("정렬후");
		for(int i = 0 ; i<list.size();i++) {
			System.out.print(list.get(i));
		}
		
	}


	public static void main(String[] args) {
		new Test();
	}
}