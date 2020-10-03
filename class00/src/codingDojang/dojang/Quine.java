package codingDojang.dojang;

import java.io.*;
import java.util.Arrays;

public class Quine {

	public Quine() {
		try {
			FileInputStream fin = new FileInputStream("src/codingDojang/Quine.java");
			
			byte[] buff = new byte[1024];
			int cnt = fin.read(buff);
			String str = new String(buff, 0, cnt);
			System.out.println(str);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Quine();
	}

}
