//★★★
package day23;

import java.io.*;
import java.util.*;

//프로그램에 관련된 정보를 자동으로 뽑아서 살펴보자.
public class Test03 {

	public Test03() {
		Properties prop = System.getProperties();
		/*
			System.getProperties() 함수가
			프로그램에 관련된 정보를 Properties의 형식으로 반환해주는 함수이다.
			
			Properties는 Map의 일종이니
			프로그램의 정보를 Map의 형태로 반환해주는 함수이다.
		 */
		
		//일단 정보는 받아왔는데 키 값이 어떤것들이 있는지 알지 못한다.
		//따라서 키 값만 뽑아내야겠다.
		Enumeration en = prop.keys();
		//keys()는 반환값이 Enumeration 타입이고 이것은 Iterator의 구버전이다.
		while(en.hasMoreElements()) {
			String key = (String)en.nextElement();//nextElement() 함수는 반환값이 Object타입
			String value1 = prop.getProperty(key);
			//get함수도 그냥 두고, 문자열로 꺼내는 함수도 따로만들었어요 getProperty()
			//어짜피 문자열만 들어가있기 때문에.......... ?
			System.out.println(key + " - "+ value1);
		}
		
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
