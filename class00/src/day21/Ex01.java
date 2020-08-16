//★
package day21;
/*
	ArrayList에
	1.밑변과 높이를 랜덤하게 만들어서 삼각형을 만들고
	2.그 삼각형을 10개를 채우고
	3.출력하고
	4.면적을 기준으로 정렬해서
	4-1.출력하고 --> 무명클래스
	5.밑변을 기준으로 정렬해서
	5-1.출력하고 --> 
	6.높이를 기준으로 정렬해서
	6-1.출력하고 --> 외부클래스
 */
import java.util.*;
public class Ex01 {
	public class Stand implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			Samgak samA = (Samgak)o1;
			Samgak samB = (Samgak)o2;
			int result = (int)(samA.getWidth()-samB.getWidth());
			return -result;
		}
		
		
	}
	
	
	public Ex01() {
		ArrayList list = new ArrayList();
		//2 삼각형 10개 채우고
		for(int i = 0 ; i<10 ; i++) {
			list.add(setSamgak());
		}
		System.out.println("추출된 값 출력");
		//3출력하고
		for(int i = 0 ; i <list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		//4 면적기준으로 정렬해서 출력 무명클래스
		Collections.sort(list, new Comparator(){
			@Override
			public int compare(Object o1, Object o2) {
				Samgak sam1 = (Samgak) o1;				
				Samgak sam2 = (Samgak) o2;
				int result = (int)(sam1.getArea()-sam2.getArea());
				return -result;
			}			
		});
		//4-2. 출력
		System.out.println("면적을 기준으로 정렬한 거 출력");
		for(int i = 0 ; i <list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		//5 밑변을 기준으로 정렬해서 출력-- 전역내부클래스
		Collections.sort(list, new Stand());
		//클래스는 무조건 객체화시켜서 사용할 수 있다!
		//5-1 출력
		System.out.println("width을 기준으로 정렬한 거 출력");
		for(int i = 0 ; i <list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		//6.높이를 기준으로 정렬해서
		Collections.sort(list, new Stand2());		
		//6-1.출력하고 --> 외부클래스
		System.out.println("height을 기준으로 정렬한 거 출력");
		for(int i = 0 ; i <list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}

	
	//1.밑변과 높이를 랜덤하게 만들어서 삼각형을 만들고
	//랜덤하게 반지름 만들어서 Won에 데이터 셋팅하고 넘겨주는 함수.

	public Samgak setSamgak() {
		Samgak samgak = new Samgak();
		int width = (int)(Math.random()*90+1);
		int height = (int)(Math.random()*90+1);
		samgak.setWidth(width);
		samgak.setHeight(height);
		samgak.setArea();
		
		
		return samgak;
	}
	
	
	
	
	
	public static void main(String[] args) {
		new Ex01();
	}

}


//--------------------------------------------------
class Stand2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Samgak sam1 = (Samgak) o1;				
		Samgak sam2 = (Samgak) o2;
		int result = (int)(sam1.getHeight()-sam2.getHeight());
		return -result;
	}
	
}
