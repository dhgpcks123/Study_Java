//★★
package day21;
/*
	 1. 가로와 세로가 랜덤하게 만들어진 사각형을 10개 만들고
	 2. ArrayList에 담고
	 3. 내용을 출력하고
	 
	 4-1. 면적을 기준으로 정렬하고
	 4-2. 출력하고
	 5-1. 가로를 기준으로 정렬하고
	 5-2. 출력하고
	 6-1. 세로를 기준으로 정렬하고
	 6-2. 출력하고
	 
 */
import java.util.*;
public class Ex02 {

	public Ex02() {
		//ArrayList에 담고
		ArrayList list = new ArrayList();
		for(int i = 0; i <10 ; i++) {
			list.add(setSagak());
		}
		//내용 출력해보자
		for( int i = 0 ; i <list.size(); i++) {
		System.out.println(list.get(i));// get!!!!!!!!
		//배열뽑아낼 때!!! list.get!!!!!!!!!!!!!
		}

//------------------------------------------------------------
		
		
//		 4-1. 면적을 기준으로 정렬하고
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Sagak sa1 = (Sagak)o1;
				Sagak sa2 = (Sagak)o2;
				int result = sa1.getArea()-sa2.getArea();
				return result;
			}
		});
		
//		 4-2. 출력하고
		System.out.println("----------면적기준 출력----------");
		for(int i = 0 ; i <list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
//		 5-1. 가로를 기준으로 정렬하고
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Sagak sagak1 = (Sagak) o1;
				Sagak sagak2 = (Sagak) o2;				
				return (int) ((sagak1.getHeight()-sagak2.getHeight()>0)?1:-1);
			}
		});
//		 5-2. 출력하고
		System.out.println("----------height기준 출력----------");
		for(int i = 0 ; i <list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
//		 6-1. 세로를 기준으로 정렬하고
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Sagak sagagak1 = (Sagak)o1;
				Sagak sagagak2 = (Sagak)o2;
				int result = sagagak1.getWidth()-sagagak2.getWidth();
				return result;
			}
			
		});
//		 6-2. 출력하고
		System.out.println("----------Width기준 출력----------");
		for(int i = 0 ; i <list.size() ; i++) {
			System.out.println(list.get(i));
		}	
	}
	
	//------------------------------------------------------------	
	
	//1.가로와 세로를 랜덤하게 생성해서 클래스 만들어주는 함수
	public Sagak setSagak() {
		int width = (int)(Math.random()*50+1);
		int height = (int)(Math.random()*50+1);
		Sagak sagak = new Sagak();
		sagak.setWidth(width);
		sagak.setHeight(height);
		sagak.setArea();
		return sagak;
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

}
