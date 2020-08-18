package day24;

import java.io.*;
public class Test02 {

	public Test02() {
		File file = new File("D:\\day24\\fTest\\test.txt");
		String name = file.getName();
		System.out.println("파일 이름 : "+name);
		//메모리상에서만 존재함. 그래서 name은 가져올 수 있다.
		//객체에만 존재하는 상태임 ㅎㅎㅎㅎㅎㅎㅎ
	}

	public static void main(String[] args) {
		new Test02();
	}

}
