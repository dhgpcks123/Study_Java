package codingDojang.newDay;

import java.util.*;
import java.util.stream.*;
public class Stream_Ex {
	
	private ArrayList<String> list;
	public Stream_Ex() {

		list = new ArrayList<String>();
		list.add("민영");
		list.add("햇찬");
		list.add("피자");
		
		outItor();
		System.out.println();
		outStream();
	}
	
	public void outItor() {
		System.out.println("--------- iterator 반복자 사용 ----------");
		Iterator itor = list.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next()+" | ");
		}
	}
	
	public void outStream() {
		System.out.println("--------------- Stream 사용 ----------------");
		Stream stream = list.stream();
		stream.forEach(name -> System.out.print(name+" | "));
	}

	public static void main(String[] args) {
		new Stream_Ex();
	}

}
