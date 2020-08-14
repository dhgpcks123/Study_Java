package day22.ex;
/*
	1.
	삼각형 클래스를 만들고
	이 클래스가 Set에 담길 때 같은 면적이면 같은 클래스로 판정되도록
	클래스를 정의하고
	HashSet 랜덤하게
		밑변, 높이를 만들어서 입력해서 삼각형을 만들고
		10개를 담고
	출력하세요.
	
	2. 밑변이 같은 클래스는 같은 클래스로 판정되도록...
	3. 높이가 같으면 같은 클래스로 판정되도록....
 */
import java.util.*;

import day22.source.Samgak;
public class Ex01{

	public Ex01() {
		//HashSet을 객체화시킨다.
		HashSet set = new HashSet();
		
		for(int i =0 ; i<10; i++) {
			set.add(new Samgak((int)(Math.random()*30+1),(int)(Math.random()*30+1)));
		}
		//area 중복 없이 출력~!!
		for(Object o : set) {
			System.out.println(o+" | "+((Samgak)o).hashcode());
			}


	}

	public static void main(String[] args) {
		new Ex01();
	}

}
