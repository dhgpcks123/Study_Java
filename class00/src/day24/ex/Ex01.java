//★
package day24.ex;
/*
	day24.Test04.java 파일을 복사해서
	day24.Test04_test.txt 파일을 만드세요.
 */


//가지고 와서 내보내는것도 만들어줘야함


import java.io.*;
import java.util.Arrays;

import javax.swing.*;
public class Ex01 {

	public Ex01() {
		//복사를 해주기 위해선 빨대가 두개 필요하다.
		//가져오는 스트림클래스
		//내보내는 스트림클래스를 null로 선언해준다
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			//객체생성해준다. 가져오는 스트림, 내보내는 스트림 둘다.
			fin = new FileInputStream("src/day24/Test04.java");
			fout = new FileOutputStream("src/day24/Test04_test.txt");
			
			//가져왔을 때 둘 공간으로 바이트배열을 만든다
			while(true) {
				byte[] by = new byte[1024];
			//가져온다.
			int len = fin.read(by);
			//1024만큼 읽었겠지.
			
			//일단 그 만큼만 출력해본다.
//			fout.write(by);
			if(len == -1) {
				break;
			}
			fout.write(by, 0, len);
			}
			
			JOptionPane.showMessageDialog(null, "성공");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//습관적으로 종료해준다.
			//네트워크 연결된 상태...? 끊어줘야한다.
			try {
				fout.close();
				fin.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
