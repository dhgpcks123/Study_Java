package day20;

public class Test08 {

	public Test08() {
		Father f = new Son1();
		Father f1 = new Son2();
		
		f1= f;
		Son2 s1 = (Son2)f;//형변환은 된다. //근데 안에 필드다르니까 쓸 수 없다.
	}
	
	public static void main(String[] args) {
		new Test08();
	}

}


//------------------------------------------------------------------------------------------

class Father {
	void abc() {}
}

class Son1 extends Father {
	int money;
}

class Son2 extends Father {
	int honor;
}

