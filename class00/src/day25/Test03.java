//★★★
//char기반 출력클래스를 써보자.
package day25;

import java.io.*;
public class Test03 {

	public Test03() {
		FileWriter fw =null;
		
		try {
			fw = new FileWriter("src/day25/docu/fileTest01.txt");
			
			
			//1. 한글자(2바이트)만 저장해보자.
//			char ch = '안';
//			fw.write(ch);
			
			//2. 여러글자를 저장해보자.
//			String str = "저 이제 쉬어요 떠날 거에요\r\n" + 
//					"노트북 꺼 놔요 제발 날 잡진 말아줘\r\n" + 
//					"시끄럽게 소리를 질러도 어쩔 수 없어 나\r\n" + 
//					"가볍게 손을 흔들며 see ya-\r\n";
//			char[] chArr = str.toCharArray();
//			fw.write(chArr);
			
			//3. 문자열을 저장해보자.
			String str = "저 먼 바다 끝엔 뭐가 있을까\r\n" + 
					"다른 무언가 세상과는 먼 얘기\r\n" + 
					"구름 위로 올라가면 보일까\r\n" + 
					"천사와 나팔 부는 아이들\r\n" + 
					" \r\n" + 
					"숲 속 어디엔가 귀를 대보면\r\n" + 
					"오직 내게만 작게 들려오는 목소리\r\n" + 
					"꿈을 꾸는 듯이 날아가볼까\r\n" + 
					"저기 높은 곳 아무도 없는 세계";
			fw.write(str);
			/*
				char 단위는 텍스트 데이터만 처리하도록 되어있기 때문에
				기본함수에 + 문자처리기능이 추가되어있다.
			 */
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
