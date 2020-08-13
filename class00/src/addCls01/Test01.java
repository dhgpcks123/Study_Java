package addCls01;


import static java.lang.Math.*;
public class Test01 {
	public int num = 1000;
	
	public Test01() {
		int no = (int)(Math.random()*10);
		double pi = PI;
		//static 메모리에 미리올려둠 왜?
		//쓸 때 마다 객체만들어서 써야하는데.. PI같은 경우 고정되어있을거 아니야!
		//메모리도 아끼고, 귀찮음도 덜고.
		//같은 이름? ㄴㄴ 딱 한 개만 올림.
	}

	public static void main(String[] args) {
		new Test01(); //Test01은 인스턴스화되어있지 않음.
//		int no1 = num;
		Test01 t1 = new Test01();
 		int no = t1.num;
 		
 		String str1 = "abcd";
 		String str2 = new String("abcd"); //힙에 객체 만들어줌
 		
 		System.out.println(str1);
 		System.out.println(str2);
 		System.out.println(str1 == str2);
 		System.out.println(str1.equals(str2));
// 		Object에 있는 equals함수는 주소를 비교하는 역할
//		String에 있는 경우?? 좀 곤란해져서 equals함수는 기능을 바꿨어.
//		lang패키지는 기본적으로 가져오니까 그 안에 들어있는 String도 기본적으로 가져온거야.
//		그래서 String.equals(String2)
//		그래서 이렇게 생겼구나!!!! str1.equals(str2)!!!!!!!!!!!

 		
	}

}
