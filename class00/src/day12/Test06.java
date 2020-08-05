//★★ 가변인자의 사용
package day12;

public class Test06 {
	public Test06() {
		String[] name2 = new String[]{"오혜찬","김씨"};
		
		toPrint(name2);
		System.out.println();
//		toPrint ("윤요셉", "유병욱");
//		System.out.println();
//		toPrint("아이유","윤요셉","유병욱","오혜찬","김씨","표류기");
	}
	public static void main(String[] args) {
		new Test06();
	}
	
	
	
	//회원의 이름들을 입력하면 출력해주는 함수를 작성하세요.
//	public void toPrint(String...name) {
		//가변인자는 문자열을 입력해주면 배열로 변환해서 처리한다.
//		for(String irum:name) {
//			System.out.print(irum);
//		}
//	}
	 public void toPrint(String[] name){
//	 반드시 배열의 형태롬 만들어서 함수를 호출해야 한다.
	 for(String irum2 :name){
	 System.out.println(irum2);
	 
	 }
	 }
 }
