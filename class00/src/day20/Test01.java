//★
// Data()클래스, Thread
package day20;

import java.util.*;
public class Test01 {

	public Test01() {
		// 날짜 객체를 만든다
		Date d = new Date(); //객체 만드는 '순간'의 시간을 인스턴스에 저장.
		// 현재 시간을 출력한다.
		for(int i =0 ;i<3 ; i++) {
		System.out.println((d.getYear()+1900)+"년"+(d.getMonth()+1)+"월"+d.getDate()+
				"일"+getYoil(d.getDay())+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
			/*
			getMonth() : 함수의 반환값은 0~11까지 반환해줌.
			즉, 월의 시작을 0월부터 시작한다.
			따라서 사용할 때는 반드시 +1을 해서 사용해야 한다.
			-------------------------------------------------------------------
			getYear() : 자바는 1900년 1월 1일 0시 0분 0초가 기준. 밀리초 단위로 기억함.
			기준점부터 환산해서 지금 120년지나서 그럼. 그래서 +1900
			-------------------------------------------------------------------
			getDay() : 요일을 반환해주는 함수인데
			반환값이 0~6까지의 정수를 반환해준다.
				0:일요일 ~ 6:토요일
			*/
		
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	//요일을 문자열로 반환해주는 함수
	public String getYoil(int day) {
		String yoil = "일요일";
		switch(day) {
		case 0:
			yoil = "일요일";
			break;
		case 1:
			yoil = "월요일";
			break;
		case 2:
			yoil = "화요일";
			break;
		case 3:
			yoil = "수요일";
			break;
		case 4:
			yoil = "목요일";
			break;
		case 5:
			yoil = "금요일";
			break;
		case 6:
			yoil = "토요일";
			break;
		}
		return yoil;
	}

	public static void main(String[] args) {
		new Test01();
	}

}
