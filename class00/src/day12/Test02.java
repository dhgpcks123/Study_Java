//★★
package day12;

public class Test02 {
	public Test02() {
		Member m = new Member();
		Member[] memb = m.getMembers();
		
		m.toPrint("윤요셉", memb);
	}
	
	public static void main(String[] args) {
		new Test02();
	}
}


//------------------------------------------------------------

class Member{
	int mno;
	String id, name, mail, tel;
	char gen;
	
	//5명의 회원을 저장한 배열을 반환해주는 함수
	public Member[] getMembers() {
		Member[] mArr = new Member[5];
		
		String[] names = getNames();
		String[] ids = getIds();
		String[] mails = getMails();
		String[] tels = getTels();
		char[] gens = getGens();
		for(int i = 0 ; i<names.length;i++) {
		mArr[i] = new Member();
		mArr[i].mno =1001+i;
		mArr[i].name = names[i];
		mArr[i].id = ids[i];
		mArr[i].mail = mails[i];
		mArr[i].tel = tels[i];
		mArr[i].gen = gens[i];
		
		}
		return mArr;
	}

	//길이를 입력하면 회원 배열을 반환해주는 함수
	public Member[] getMembers(int len) {
		Member[] mArr = new Member[len];
		
		return mArr;
	}

	//회원 이름 배열을 반환해주는 함수
	public String[] getNames() {
		String[] names = {"아이유", "윤요셉", "유병욱", "오혜찬", "이지우"};
		return names;
	}
	//회원 전화번호들을 배열로 반환해주는 함수
	public String[] getTels() {
		return new String[] {"010-1111-1111", "010-5069-8600", 
				"010-2587-2304", "010-7648-5213", 
				"010-3843-4798"};
	}
	
	//회원 메일을 배열로 반환해주는 함수
	public String[] getMails() {
		return new String[] {"iu@increpas.com", "joseph@increpas.com", 
				"wook@increpas.com", "chan@incerpas.com", 
				"jiwoo@increpas.com"};
	}
	// 회원 성별을 배열로 반환해주는 함수
	public char[] getGens() {
		return new char[] {'F', 'M', 'M', 'M', 'M'};
	}
	
	// 회원 아이디를 배열로 반환해주는 함수
	public String[] getIds() {
		return new String[] {"iu", "joseph", "wook", "chan", "jiwoo"};
	}
	
	public void toPrint(String name, Member[] memb) {
		for(int i = 0 ; i < memb.length ; i++ ) {
			if(name.equals(memb[i].name)) {
				System.out.println("*******************************");
				System.out.println("-------- " + name +" 님 정보 -------");
				System.out.println("-------------------------------");
				System.out.printf("회원번호 : %5d\n이    름 : %3s\n아 이 디 : %-15s\n전화번호 : %13s\n이 메 일 : %-25s\n성    별 : %2s\n", 
						memb[i].mno, memb[i].name, memb[i].id, memb[i].tel, memb[i].mail, memb[i].gen == 'M' ? "남자" : "여자");
				System.out.println("===============================");
			}
		}
	}
	
}


