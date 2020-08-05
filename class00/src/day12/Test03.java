//★★
package day12;

public class Test03 {
	public Test03() {
		String[] name = {"윤요셉", "유병욱", "오혜찬"};
		int[] age = {18,17,16};
		
		//Saram 3개를 저장할 배열을 만들고 초기화
		Saram[] mans = new Saram[name.length];
		//Saram 클래스의 데이터를 입력할 공간 확보한 상태
		
		//데이터 담아줘야ㅣㅈ
		for(int i = 0 ; i<mans.length ; i++) {
			mans[i] = new Saram();
			mans[i].name = name[i];
			mans[i].age = age[i];
		}
		
		
		//출력해
		for(int i = 0 ; i<mans.length ; i++) {
			mans[mans.length-1-i].toPrint();
		
		Saram s1 = mans[0];
		System.out.println(s1.getName());
		}

		
	}
 public static void main(String[] args) {
	new Test03();
}
 
 public void forTest() {
	 Saram s1 = new Saram();
	 Saram s2 = new Saram();
	 Saram s3 = new Saram();
	 Saram s4 = new Saram();
	 Saram s5 = new Saram();
	 Saram[] saram = {s1, s2, s3, s4, s5};

 }
}



//----------------------------------------------------------------

class Saram{
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	
	public void toPrint() {
		System.out.println(name+" -"+age);
	}
	
}