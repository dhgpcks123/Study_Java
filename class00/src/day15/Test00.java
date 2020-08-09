//★★
//여러 Saram클래스 [5명]정보 담을 배열만들기.
package day15;

public class Test00 {
	Saram[] people = new Saram[5];
	public Test00() {
		
		String[] names = {"오혜찬", "윤요셉", "유병욱", "이지우", "아이유"};
		int[] ages = {15,25,35,15,15};
		char gen = 'F';
		
		for(int i = 0 ; i<names.length; i++) {
			people[i] = new Saram(names[i],ages[i],gen);
		}
		
	}
	
	
	public static void main(String[] args) {
		new Test00();
		
	}
}

class Saram{
	String name;
	int age;
	char gen;
	
	public Saram(){}
	public Saram(String name, int age, char gen) {
		this.name = name;
		this.age = age;
		this.gen = gen;
	}
}