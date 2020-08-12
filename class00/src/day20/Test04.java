//★★
//SimpleDateFormat
package day20;
/*
	현새 시간을
	
		XXXX년 XX월 XX일 X요일 ##시 ##분 ##초
	로 출력해보자.
 */

import java.util.*;
import java.text.*;
public class Test04 {

	public Test04() {
		//폼 만들어주고
		SimpleDateFormat form = new SimpleDateFormat("yyyy년 M월 dd일 E요일 HH시 mm분 ss초");
		
		//문자열 만들고
		Calendar cal = Calendar.getInstance();
//		String str = form.format(cal);
		//데이터타입아닌 캘린터타입으로 넣어줘서 에러남
		Date date = cal.getTime();
		String str = form.format(date);
		
		System.out.println("현재시간 : " + str);
		
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
