package day24;
/*
	수업설명 문서가 있는 폴더 내의 파일 목록을 알아내자.
 */
import java.io.*;
public class Test03 {

	public Test03() {
		// 목록을 알아내고 싶은 폴더를 File로 객체생성한다.
		File file = new File("C:\\Users\\class02\\git\\javaBasics\\class00\\doc");
		/*
		//이름 목록을 알아낸다.
		String[] fList= file.list();
		//출력
		for(String fName : fList) {
			System.out.println(fName);
		}
		*/
		
		/*
		// 이름과 정보도 같이 리스트로 꺼내오는 방법
		File[] fList = file.listFiles();
		for(File f : fList) {
			File fInfo = f;
			String fName = fInfo.getName(); //파일 이름 꺼내기
			long len = fInfo.length();	//파일 크기 꺼내기
			//출력한다
			System.out.println(fName+" - "+len+" byte");
		}
		*/
		/*
		//확장자가 txt인것만 골라서 정보를 출력해보자.
		File[] fList = file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				
					매개변수의 역할
						File dir - 현재 파일의 정보를 알려준다.
						String name - 현재 파일의 이름을 알려준다.
						
						우리는 확장자가 .pdf로 끝나는 파일만 보기를 원한다.
						
						그런데 이 함수는(accept())는 자동 호출되는 함수이다.
						목록을 구하는 파일을 하나씩 발견할 때마다 이 함수가 호출된다.
						이 함수에서 true를 반환하면 목록에 포함시키고
						이 함수에서 false를 반환하면 목록에서 제욋키ㅣㄴ다.
				
				if(name.endsWith("txt")) { //파일의 확장자가 pdf(txt이니?
					return true;
				}else {
					return false;
				}
			}
			
		});
		
		for(int i = 0 ; i<fList.length; i ++){
			File f = fList[i];
			// 파일이름 알아내고
//			System.out.println(f); //경로를 뽑아다주는 군. 배열에 담긴 파일들.
			String fName = f.getName();
			// 파일 크기 알아내고
			long len = f.length();
			//출력하고
			System.out.println(fName+" - " + len+ "byte");
		}
		*/
		
		
		// 문제 ]day01.txt, day02.txt, day03.txt 파일의 정보만 필터를 적용해서 보기 원해
		File[] fList = file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				String tmp = name.substring(4, name.indexOf('.'));
				boolean ck1= false;
				for(int i = 0 ; i<tmp.length(); i++) {
					char ch = tmp.charAt(i);
					if(ch>='0' && ch<= '9') {
						ck1 = true;
					}else {
						ck1 = false;
					}
				}
				
				if(name.startsWith("day0")&& ck1 && name.endsWith("txt")){
					return true;
				}else{
					return false;
				}
			}
		});
		
		
		for(int i = 0 ; i<fList.length; i ++){
			File f = fList[i];
			// 파일이름 알아내고
//			System.out.println(f); //경로를 뽑아다주는 군. 배열에 담긴 파일들.
			String fName = f.getName();
			// 파일 크기 알아내고
			long len = f.length();
			//출력하고
			System.out.println(fName+" - " + len+ "byte");
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
