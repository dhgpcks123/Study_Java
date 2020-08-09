//★★
package day13;

public class Test06 {

	public Test06() {
		Member meb1 =new Member("윤요셉", "jo","jo@naver.com");
		Member meb2 = new Member();
		System.out.println(meb1);
		System.out.println(meb2);
		
	}
	public static void main(String[] args) {
		new Test06();
	}
}

class Member{
	String name, id, mail;
	
	public Member() {
		this("홍길동","hong","hong@increpas.com");
		System.out.println();
	}
	
	public Member(String name, String id, String mail) {
		this.name = name;
		this.id = id;
		this.mail = mail;
	}
	
	public String toString() {
		return name+id+mail;
	}
}