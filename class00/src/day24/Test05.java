//★★
//원하는 내용을 파일에 저장하는 프로그램을 만들자.
package day24;

import java.io.*;
/*
	1. 한글자만 입력해보자.
	2. 여러글자 입력해보자
	3. 문자열중에 특정 부분만 저장하는 방법
저장경로 : "C:\\Users\\class02\\git\\javaBasics\\class00\\src\\day24\\wtest\\FileText.txt"
사용문자열 : Assigns the specified byte value to each element of the specified array of bytes.
*/

public class Test05 {

	public Test05() {
		// 파일에 저장하기 위해서는 파일로 연결된 스트림이 필요하다.
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("C:\\Users\\class02\\git\\javaBasics\\class00\\src\\day24\\wtest\\FileText.txt");
			//파일이 존재하지 않아도 자동으로 만들어준다.
			
			//1. 한글자만 입력하자
//			fout.write("와");//한글자만 내보냄? 
//			fout.write('와');//이러면? 내보내지지만 깨짐. 한글 ? bytecode없음. bytecode내보냄
//			fout.write('t');
			
			//2. 여러글자를 입력하자
//			String str = "죽는 날 까지 하늘을 우러러 한 점 부끄럼이 없기를...";
			//바이트배열로 만들고
//			byte[] buff = str.getBytes(); //문자열을 바이트배열로 반환해주는 함수
			// 입력하고
//			fout.write(buff);
			
			//3. 문자열중에 특정 부분만 저장하는 방법
			String str =  "Assigns the specified byte value to each element of the specified array of bytes.";
			byte[] buff = str.getBytes();
			int startidx = str.indexOf('t');
			int len = str.length()-str.indexOf('t');
			fout.write(buff, startidx, len);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				fout.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}
