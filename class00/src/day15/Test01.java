//★★
//자동형변환과 강제형변환
package day15;
	
public class Test01 {
	public Test01() {
		Son s= new Son();
		Father f =s; //자동형변환이 일어남.
		Father f2 = new Son(); //같은 말
		
		//강제형변환도 가능하긴 해
		Son s2 = (Son)f;
//		Son s3 = (Son)(new Father);
		Father ff = new Father();
		Son s4 = (Son)ff; //강제형변환
		//father>son
		//son>father>son
		
		
	}
public static void main(String[] args) {
	new Test01();
}
}


class Father{
	
}

class Son extends Father{
	
}

class Son2 extends Father{
	
}