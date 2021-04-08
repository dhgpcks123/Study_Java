package Lambda;

public class Lambda {
	public static void main(String[] args) {
//		Object obj = (a, b) -> a>b?a:b //람다식. 익명 객체
		
		// 람다식은 원래 익명객체이다. 이렇게 만들어봐.
		// 자바에서는 규칙이 메서드만 존재할 수 없어서. 익명 객체 안에 넣어서 표현한 것.
		// 아래 Object obj = new Object() {} 이건 익명 객체를 만든거네!
		/*
		MyFunction f = new MyFunction() {
			public int max(int a, int b) {	// 오버라이딩 - 접근제어자는 좁게 못 바꾼다.
				return a>b?a:b;
			}
		};
		*/
		// 람다식을 다루기 위한 참조변수의 타은 함수형 인터페이스로 한다.
		MyFunction f = (a, b) -> a>b?a:b; //람다식. 익명객체
		
		int value = f.max(3,5);
		// 인텔리j의 장점은 3, 5가 어떤 데이터타입인지 나타내준다는 것!
		// 참조변수 obj에 max라는 메서드 없어. 
		// 쓸 수 없어.
		// 그래서 필요한 게 함수형 인터페이스
		System.out.println("value ="+ value);
		
		
	}
}

@FunctionalInterface //함수형 인터페이스는 단 하나의 추상 메서드만 가져야 한다.
interface MyFunction {
//	public abstract int max(int a, int b); //인터페이스는 public abstract default로 붙는다.
	int max(int a, int b);
}