package day24;

import java.io.*;
/*
원하는 내용을 파일에 저장하는 프로그램을 만들어보자.
*/
//저장경로 "C:\\Users\\class02\\git\\javaBasics\\class00\\src\\day24\\wtest\\FileText.txt"
public class Test {
	public Test() {
		FileOutputStream file = null;
		
		
		
		try {
			//한글자만 입력해보자
			file = new FileOutputStream("C:\\Users\\class02\\git\\javaBasics\\class00\\src\\day24\\wtest\\FileText.txt");
//			file.write('t');
			
			//2.여러글자 입력해보자
//			byte[] strArray = str.getBytes();
//			file.write(strArray);
			
			//3. s부터 뽑아보자
			String str =" of the specified array of bytes.";
			int len = str.indexOf('e');
			byte[] strArray = str.getBytes();
			file.write(strArray, len,str.length()-len );
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				file.close();
			}catch(Exception e) {
				
			}
		}

		
	}


	public static void main(String[] args) {
		new Test();
	}

}
