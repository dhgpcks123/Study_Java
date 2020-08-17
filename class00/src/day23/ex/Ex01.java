//★
package day23.ex;

import day23.*; //iu.iu 파일은 패키지가 다르기 때문에....
//이거 없어도 쓸 수 있음. 파일을 가지고 오는거니까.
import java.io.*;
import java.util.*;

/*
	문제 1 ]
		Test02에서 만든 iu.iu파일의 내용을 읽어서 출력하세요.
		단, Map.Entry 타입으로 반환받아서 처리하세요.
		
		참고 ]
			Map.Entry
			는 키와 밸류를 변수로 만들어서 저장해놓은 일종의 VO클래스이다.
 */

public class Ex01 {


	public Ex01() {
		Properties prop = new Properties();
		
		
		String msg ="";
		FileInputStream file = null;
		try{
			file = new FileInputStream("src/day23/iu.iu");
			prop.load(file);
			msg ="성공";
			
		}catch(Exception e) {
			e.printStackTrace();
			msg="실패";
		}
		System.out.println(msg);
		Set set = prop.entrySet();

		/*
		for(Object o : set) {
			Map.Entry data = (Map.Entry)o;
			Object value =data.getValue();
			Object key =data.getKey();
			System.out.println(key + " | " + value);
		}
		*/
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			Map.Entry data = (Map.Entry)itor.next();
			Object value =data.getValue();
			Object key =data.getKey();
			System.out.println(key + " | " + value);
		}
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
