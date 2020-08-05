//★
package day12;
/*
문제 3 ]
	회원정보를 기억할 클래스를 작성하세요.
	회원 정보는 
		회원번호, 회원이름, 아이디, 메일
	
	1. 회원이름만 입력하면 객체로 만들수 있게 한다.
	2. 회원 이름과 아이디를 입력해야만 객체가 될 수 있게 한다.
	3. 회원번호, 회원이름, 아이디, 메일을 모두 입력해야 객체가 될 수 있도록 한다.
	
	생성자 함수 오버로딩 문제....
	
*/
public class Ex03 {
	Mem2 M = new Mem2();
	public Ex03(String name){
		M.toPrint(name);
	}
	public Ex03(String name, String id) {
		M.toPrint(name,id);
	}
	public Ex03(String mno, String name, String id, String mail) {
		M.toPrint(mno,name,id,mail);
		
	}
	
	public static void main(String[] args) {	
	new Ex03("110", "오혜찬", "dhgpcks","dhgpcks123@naver.com");
	
	}
}
//------------------------------------------------------------------------------
class Mem2{
	String mno, name, id, mail;
	
	public void setData() {
		mno = "110";
		name = "오혜찬";
		id = "dhgpcks";
		mail= "dhgpcks123@naver.com";
	}
	
	public void toPrint(String name) {
		setData();
		System.out.println(mno + name + id + mail);
	}
	public void toPrint(String name, String id) {
		setData();
		System.out.println(mno + name + id + mail);
		
	}
	public void toPrint(String mno, String name, String id, String mail) {
		setData();
		System.out.println(mno + name + id + mail);
	}
	
}