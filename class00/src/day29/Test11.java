package day29;
//public int num을 main클래스에 선언하고 한 클래스엔 숫자 채우기를,
//또 다른 클래스엔 숫자 읽기를..
//배열에 담아서
import day29.thread.*;
public class Test11 {
	public int[] num = new int[5];
	public Test11() {
		//new Born
		Trd111 t1 = new Trd111(this);
		Trd112 t2 = new Trd112(this);
		//runnable
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test11();
	}

}
