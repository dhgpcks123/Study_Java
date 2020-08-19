//★★
//파일 복사하기
package day24;

import java.io.*;
/*
doc/고슴.jpg복사해온다.
 */
import java.util.Arrays;
import javax.swing.*;

public class Test07 {

	public Test07() {
		/*
		 	할 일 ]
		 		스트림은 단방향이다.
		 		그런데 복사라는 개념은 한 곳에서 읽어서 다른 곳에 쓰면 된다.
		 		따라서 스트림이 두개가 필요하다. 
		 */
		
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			// 스트림 두개를 만든다.
			fin = new FileInputStream("doc/고슴.jpg");
			fout = new FileOutputStream("doc/animalGo.jpg");
			//한 고셍서 읽어서 그대로 다른 곳에 쓰면 된다
			//그런데 몇번이 반복되어야할지 알 수 없으므로 반복문으로 처리한다.
			byte[] buff = new byte[1024];
			while(true) {
				// 배열 초기화
				Arrays.fill(buff, (byte)0);
				// 읽는다
				int len = fin.read(buff);
				if(len == -1 ) {
					break; //읽은 데이터가 없는 경우이므로 종료시킨다.
				}
				//읽은 내용을 그대로 쓰면 된다.
				fout.write(buff, 0, len);
			}
			JOptionPane.showMessageDialog(null, "★★★ 파일 복사가 완료되었습니다.★★★");
		}catch(Exception e) {

		}finally{
			try {
				fout.close();
				fin.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
