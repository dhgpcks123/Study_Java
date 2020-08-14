//★
package day22.ex;

import java.util.*;
import day22.source.*;
/*
	문제 4 ]
		1.
		학생의 점수를 관리할 클래스(Stud)를
			name, java, db, web, jsp, total
		이라는 변수를 가지는 클래스로 정의하고
		
		학생이름을 키값으로 학생클래스의 객체를 입력해서
		학생의 이름과 총점을 출력하는 프로그램을 작성하세요.

		2. 학생의 이름을 입력하면
			학생의 정보를 출력해주는 프로그램을 작성하세요.
 */
import javax.swing.*;
public class Ex04 {
	HashSet names;
	public Ex04() {
		names = new HashSet();
		setNames();
		//키값이 담겨있는 HashSet names도 있다.
		//학생의 점수를 관리할 클래스(Stud) 클래스를 정의하고 import했다.
		
		Iterator itor = names.iterator();
		
		//해쉬맵 객체생성하고 Stud를 담았어
		HashMap map = new HashMap();
		for(int i = 0; itor.hasNext(); i++) {
			int java = (int)(Math.random()*100+1);
			int db = (int)(Math.random()*100+1);
			int web = (int)(Math.random()*100+1);
			int jsp = (int)(Math.random()*100+1);
			String name = (String)itor.next();
			map.put(name, new Stud(name, java, db, web, jsp));
		}
		//1번 문제 ㅎㅎㅎㅎㅎㅎ
		Set set = map.entrySet();
		Iterator itor2 = set.iterator();
		while(itor2.hasNext()) {
			Map.Entry data = (Map.Entry)itor2.next();
			System.out.println(data.getKey()+" | " +data.getValue());
		}
		
		
		//2번 문제
		//학생이름을 입력받아
		boolean bool = true;
		while(bool) {
		String name=JOptionPane.showInputDialog("학생의 이름을 입력하세요\n"
				+ "학생 :고길동, 둘리, 또치, 도우너, 희동이");
		if(name.equals("q")) {
			break;
		}
		
		//그걸 키값으로 쓸거야
		
		//학생의 이름과 총점을 출력하는 프로그램을 작성하세요
		JOptionPane.showMessageDialog(null, map.get(name));
		}
		
	}
	
	public void setNames() {
		names.add("고길동");
		names.add("둘리");
		names.add("또치");
		names.add("도우너");
		names.add("희동이");
	}
	
	
	public static void main(String[] args) {
		new Ex04();
	}

}
