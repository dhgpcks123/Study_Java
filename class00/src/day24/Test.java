package day24;

import java.io.*;
import java.util.Arrays;
//doc/고슴.jpg를 복사해본다.
public class Test {
	public Test() {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		
		
		try {
			fin = new FileInputStream("doc/고슴.jpg");
			fout = new FileOutputStream("doc/고슴복사.jpg");
			
			while(true) {
			byte[] aaa = new byte[1024];
			Arrays.fill(aaa, (byte)0);	
			int len = fin.read(aaa);
			if(len== -1 )break;
			String str= new String(aaa, 0, len);
			fout.write(aaa, 0, len);
			}

			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();
				fin.close();
			}catch(Exception e) {
				
			}
		}

		
	}


	public static void main(String[] args) {
		new Test();
	}

}
