package codingDojang.dojang;

/*A씨는 게시판 프로그램을 작성하고 있다.
A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때
총 페이지수를 리턴하는 프로그램이 필요하다고 한다.

입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
출력 : 총페이지수
A씨가 필요한 프로그램을 작성하시오.
*/
public class PostProgram {
	private int page;
	
	public PostProgram() {
		getPage(31,5);
	}
	
	public int getPage(int m, int n) {
		
		if(n<1) {
			System.out.println("n은 1보다 크거나 같아야 합니다.");
			return page;
		}
		if(m%n == 0) {
			page = m/n;
		}else {
			page = m/n+1;
		}
		System.out.println("총 건수 : " + m + " 보여줄 게시물 수 : " + n 
							+ " 총페이지 수 : " + page);
		return page;
	}

	public static void main(String[] args) {
		new PostProgram();
	}
}
