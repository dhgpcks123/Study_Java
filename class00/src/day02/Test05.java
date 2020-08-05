//★★★
package day02;

public class Test05 {
	public static void main(String[] args) {
		// 1. 논리값 참을 저장할 변수를 선언하고 초기화하세요.
		boolean bool;
		bool = true;
		boolean bool2 = true;
		boolean bool1 = false;
		
		//같은 블럭 안에서 *** 같은 이름으로 변수를 선언할 수 없다.
		
		bool = bool1;
		
		// bool => false가 된다. bool에 bool1을 집어넣는다고 이해하면 됨.
		
		// 2. A를 기억할 변수를 만들고 초기화 하세요.
		 char ch = 'A';
		 System.out.println(ch);
		 char ch1 = (char) 65;
		 System.out.println(ch1);
		 char ch2 = (char)(ch1 +5);
		 System.out.println(ch2);
		 
		 System.out.println((char)('C'-'A'));
		 System.out.println('C'-'A');
		 
		 //3.14를 기억할 float 타입의 변수 num을 선언하고 초기화하세요
		 float num;
		 num = 3.14f;// 리터럴 형변환 리터럴풀에 3.14f형태로 넣어뒀다가 꺼내는거임.
		 			//그냥 float형태로 집어넣는거지.
		 num = (float)3.14; //강제 형변환 손실이 일어날 수 있음.
		 
		 //참고
		 //정수데이터에 .을 붙이면 실수가 된다.
		 //예] 10. ==> 10.0과 같은 의미(double형 데이터)
		 
		 //"홍길동"이라는 문자열을 기억할 변수를 선언하고 초기화하세요
		 String name;
		 name = "홍길동";
		 
		 String irum = new String("홍길동");
		 
		 System.out.println(name);
		 System.out.println(irum);
		 System.out.println(name ==irum);
		 // 문자열의 데이터 비교는 equlas()함수를 이용해서 해야한다.
		System.out.println(name.equals(irum)); 
		
		//밑에껀 문자열 자체를 비교했기 때문에 true가 나오고 위에껀 == 주소끼리 비교하니까
		//다르다고 나오는거야. 심지어 name은 리터럴풀에 데이터가 저장되어있고 주소를 변수가 가져온거고
		// irum은 new해줌으로써 힙에 데이터가 저장되어 리터럴풀이 힙의 주소를 다시 또 까져오는거지.
		//둘이 프로세서 다르니까 당근 안 같을 수 밖에!!
		
	String tmp = "\"";
	/*
	 * 줄바꿈 기호 \n
	 * 백스페이스 \b
	 * 탭키 \t
	 * \" \' \\
	 *
	 */
		 
	System.out.println("abcd");
	System.out.println("\t\ncdef");
		 
	}
}
