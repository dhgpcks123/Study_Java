package day16;

public class Test05 {
	public Test05() {
		xyz(new Ifc() {
				@Override
				public void abc() {
					System.out.println("Cls01");
				}
			});
	}
	
	public static void main(String[] args) {
		new Test05();
	}

	public void xyz(Ifc i) {
		i.abc();
	}
}

interface Ifc {
	void abc(); 	// public abstract -함수 public abstract final-변수
}
/*
class Cls01 implements Ifc{		//파일을 하나 만들어야되는거임
	public void abc() {
		System.out.println("Cls01");
	}
}
*/