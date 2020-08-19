//★★
package day25;

import java.io.*;
/*
	day25/docu/fileTest02.txt 파일을 읽어서 -바이트 기반 - 연결스트림- 문자기반 보조스트림
	파일을 복사해서
		fileTesr03.txt
	을 만드는데
	PrintWriter 를 사용해서 처리해보자.
 */
public class Test08 {

	
	public Test08() {
		//바이트 기반 타겟 스트림준비
		FileInputStream fin = null;
		//연결 스트림준비하고
		InputStreamReader ir = null;
		//문자기반 필터스트림 준비하고
		BufferedReader br =null;
		//문자기반 출력 스트림 준비하고
		PrintWriter pw = null; 
		
		try {
			//타겟 스트림 만들고
			fin = new FileInputStream("src/day25/docu/fileTest02.doc");
			
			//연결 스트림 만들고
			ir = new InputStreamReader(fin);
			
			//보조 스트림 만들고
			br = new BufferedReader(ir);
			
			//출력 스트림 만들고
			pw = new PrintWriter("src/day25/docu/fileTest03.txt");
			
			while(true) {
				//읽고
				String line = br.readLine();
				if(line == null)break;
				//쓰고
				pw.println(line);
				
//				pw.flush();
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pw.close(); //close()함수에 flush()기능에 들어가있는 것 같다~
				br.close();
				ir.close();
				fin.close();
				
//				pw.flush();
			}catch(Exception e) {}
		}
		
		
	}

	public static void main(String[] args) {
		new Test08();
	}

}
