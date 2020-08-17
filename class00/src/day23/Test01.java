//★
package day23;

import java.util.*;
import java.io.*;
/*
	Sample.txt를 읽어서 Map으로 저장해보자.
 */

public class Test01 {

	public Test01() {
		Properties prop = new Properties();
		/*
		 	외부 파일과 연결할 예정이다.
		 	이 작업은 이후 IO에서 공부할 때 깊게 알아보도록 한다.
		 */
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day23/sample.txt"); //Stream시냇물. 빨대비유함
//			fin = new FileInputStream("src/day23/tel.txt");
			/*
				경로는 절대경로를 이용해서
					C:\Users\class02\git\javaBasics\class00\src\day23\sample.txt
				로 사용해도 된다.
				이클립스 안에 데이터를 만들면 이것은 이클립스 자신이 경로를 새롭게 정해서
				처리하므로 src부터 시작하는 경로를 사용하면 된다.
			 */
			
			//이제 파일의 내용을 Properties에 옮긴다
			prop.load(fin);
			//파일의 내용을 읽어서 Map으로 처리해놓았다.
//			Properites맵의한종류이다.라고 생각하랭
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//이제부터는 HashMap에 데이터가 저장된 것처럼 사용하면 된다.
		
		String name = (String)prop.get("name");
//		String name = (String)prop.get("hong");
		System.out.println("저장된 이름 : "+name);
		
		// KeySet써서 키값-데이터값 출력해보기.
		/*
		Set set = prop.keySet();
		for(Object o : set) {
			String value = (String)prop.get(o);
			System.out.println(o+" | "+value);
		}
		System.out.println();
		for(Object o : set) {
			System.out.println(o + " - " +prop.get(o));
		}
		*/
		
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
