//★★★
package day11;
import javax.swing.*;
public class Test06 {
	Person[] friend;
	String[] name, tel, mail;
	int[] age;
	char[] gen;
	
	public Test06() {
//		String inputName =JOptionPane.showInputDialog("이름을 입력하세요");
//		setOne()
		setArray();
		setFriend();
		toPrint();
	}
	//1단계 한사람 데이터를 만들어보자. 출력까지 해보자.
	public void setOne() {
		//객체 만들고
		Person p1 =new Person();
		//데이터 초기화하고
		p1.setData("홍길동", "010-1111-1111", "hong@increpas.com", 18, 'M');
		System.out.println(p1.name+""+p1.age+""+p1.gen+""+p1.mail+""+p1.tel);
	}
	
	//전역 변수의 데이터를 초기화해주는 함수
	public void setArray() {
		name = new String[] {"아이유", "윤요셉", "유병욱", "오혜찬", "이지우"};
		tel = new String[] {"010-1111-1111", "010-5069-8600", "010-2587-2304", 
												"010-7648-5213", "010-3843-4798"};
		mail = new String[] {"iu@increpas.com", "joseph@increpas.com", "wook@increpas.com", 
												"chan@incerpas.com", "jiwoo@increpas.com"};
		age = new int[] {28, 33, 29, 28, 26};
		gen = new char[] {'F', 'M', 'M', 'M', 'M'};
	}
	
	//다섯사람의 친구 정보를 저장해보자.
	public void setFriend() {
		//친구 배열 초기화해주고==> 데이터 기억할 공간만 확보한 상태
		friend = new Person[name.length];
		
		//친구 배열에 데이터 채워주고
		for(int i = 0; i<friend.length ;i ++) {
			friend[i] = new Person();
			friend[i].setData(name[i], tel[i], mail[i], age[i], gen[i]);
		}
		
	}
	
	//친구들 모두의 정보를 출력해주는 함수
	public void toPrint() {
	for(int i = 0 ; i <friend.length; i++) {
		System.out.println(friend[i].name+","+friend[i].tel+","+
				friend[i].mail+","+friend[i].age+","+friend[i].gen);
		}
	}
	//친구 한 사람의 정보를 출력해주는 함수
	public void toPrint(String name) {
		int idx = 0;
		for(;idx<friend.length ;idx++) {
			if(friend[idx].name.equals(name)) break;
		}
		System.out.printf("이    름 : %3s\n전화번호 : %13s\n이 메 일 : %-25s\n나    이 : %3d\n성    별 : %2s\n", 
				friend[idx].name, friend[idx].tel, friend[idx].mail, friend[idx].age, friend[idx].gen == 'M' ? "남자" : "여자");
		System.out.println("-----------------------------------------");
	}
	
	public static void main(String[] args) {
		new Test06();
	}
}


//----------------------------------------------------------------

class Person {
	//필요한 변수들을 선언해주고.
	String name, tel, mail;
	int age;
	char gen;
	
	//변수들을 초기화해줄 함수를 만든다.
	public void setData(String name, String tel, String mail, int age, char gen) {
		this.name = name;
		this.tel = tel;
		this.mail = mail;
		this.age = age;
		this.gen = gen;
	}
	
	
	
}