package day19;
/*
	Scanner를 이용해서 파일에 저장된 내용을 읽어서 출력하자.
 */


import java.io.*; //파일은 io
import java.util.*; //Scanner는 util
public class Test11 {

	public Test11() {
		File file = new File("D:\\class\\java\\git\\jstudy\\class02\\src\\day01\\Test01.java");
		//스캐너 변수를 선언하고 null로 초기화해둔다.
		Scanner sc = null; //파일 없을수도 있으니까 null로 해놓는 거
		
		try {
			//파일을 입력해서 스캐너 만들고
			sc = new Scanner(file);
			//스캐너 내용 뽑아오고
			/*
			String str = sc.nextLine() + "\n";
			str += sc.nextLine() + "\n";
			str += sc.nextLine() + "\n";
			*/
			StringBuffer buff = new StringBuffer();
			while(sc.hasNext()) {
				buff.append(sc.nextLine()+"\n");
			}
			
			
			//출력하고
			System.out.println("### Test01.java ###");
			System.out.println(new String(buff));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
