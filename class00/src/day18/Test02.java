//★★
//클래스throw
package day18;

import java.io.*;

public class Test02 {
	public Test02() {
		Test02_01 t = new Test02_01();
//		t.createExcpt(); throw했으니까 얘는 예외처리해야지 쓸 수 있음.
		
		try {
			t.createExcpt();
		}catch(IOException e){
			e.printStackTrace();
		}
//		t.createExcpt(); 쓸 때마다 해줘야되는거!?
		
		Test02_02 t1 = new Test02_02();
		
		try {
			t1.createExcpt();
				
		}catch(EOFException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		try {
			abc();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		new Test02();
	}
	
	public void abc() throws Exception {
		Test02_01 t1 = new Test02_01();
		t1.createExcpt();
	}
}

//-------------------------------------------

class Test02_01 {
	public void createExcpt() throws IOException {
		System.out.println("여기는 Test02_01");
		throw new IOException();
	}
}
//-----------------------------------------
class Test02_02 extends Test02_01{
	public void creatExcpt() throws EOFException{
		
		System.out.println("여기는 Test02_01");
		throw new EOFException();
	}
}