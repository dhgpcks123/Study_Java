//★
package day12;
/*
1. 	노래한곡을 저장할 클래스를 정의하고
		곡명, 가수, 작곡가, 재생시간(문자열)
	앨범 한 장(12곡) 을 저장할 배열을 만들고
	내용을 출력하는 프로그램을 작성하세요.

2. 	곡 명을 입력하면 해당 곡의 정보를 출력하도록 하세요.

*/
import javax.swing.*;
public class Ex01 {
	public Ex01() {
		Album oo=new Album();
		oo.setData();
		
//		String str = JOptionPane.showInputDialog("이름을 입력하세요");
//		oo.toPrint(str);
		System.out.println();
		oo.toPrint();
	}
public static void main(String[] args) {
	new Ex01();
}
}


//--------------------------------------------------------------------------------------------

class Album{
	String name, singer, maker, time;
	Album[] cd;
	
	//노래 배열을 담아줄 변수 만들기
	public void setData() {
		cd = new Album[12];
		
		String[] names = setName();
		String[] singers = setSinger();
		String[] makers = setMaker();
		String[] times = setTime();
		
		for(int i =0 ; i<cd.length ; i++) {
		cd[i] = new Album();
		cd[i].name = names[i];
		cd[i].singer = singers[i];
		cd[i].maker = makers[i];
		cd[i].time = times[i];
		
		}
	}
	
//	//배열의 길이를 정해주는 함수
//	public Album[] setData(int len) {
//		Album[] cd = new Album[len];
//		return cd;
//	}
	
	//name 배열
	public String[] setName(){
		String[] name = new String[] {"붉은노을","태양이지는바다","싹쑤리","오랫동안","오렌지","카라멜",
										"볼 수", "있는게", " 그만" ,"12곡!?", "댕많네", "퍼레이드"};
		return name;
	}
	public String[] setSinger(){
		String[] singer = new String[] {"아이유","수지","햇찬","제리케이","슬릭","fx",
				"v.o.s", "봐즈", "ft아일랜드" ,"학폭잔나비", "파이널리", "gd"};
		return singer;
	}
	public String[] setMaker(){
		String[] maker = new String[] {"카사디안","루비","햇찬","제리케이","슬릭","설리",
				"jos", "버즈", " 중학교밴드" ,"비내리는날", "호랭이", "무도"};
		return maker;
	}
	public String[] setTime(){
		String[] time = new String[] {"3:00","2:00","5:00","3:00","2:00","1:30","5:00", "4:10", "2:10" ,"21분", "1:15", "3:50"};
		return time;
	}
	
	public void toPrint() {
	for(int i = 0; i<cd.length; i++) {
		System.out.println(cd[i].name+" "+cd[i].singer+" "+cd[i].maker+" "+cd[i].time);
	}
	}
	public void toPrint(String name) {
		for(int i = 0; i<cd.length; i++) {
			if(name.equals(cd[i].name)){
				System.out.print(cd[i].name+" "+cd[i].singer+" "+cd[i].maker+" "+cd[i].time);
			}
		}
	}
	
}