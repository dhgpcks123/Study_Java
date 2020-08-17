//★
package day23.ex;

/*
	day23.source.Student 데이터를 입력하는 맵의 문제 07을
	TreeMap을 사용해서 처리하세요.
	
	1.키 값을 학생번호로 하는 방법
	2.키 값을 학생이름으로 하는 방법
	
	5명
	학생번호 , 학생이름, java점수, db점수, web점수, jsp점수, total점수

	extra]
		내림차순 정렬
 */
import java.util.*;
import day23.source.*;
public class Ex02 {

	public Ex02() {
		System.out.println();
		System.out.println("//1. 키 값을 학생번호로 하는 방법");
		//TreeMap을 <int no, Student>제너릭 타입으로 만들어주고
		TreeMap<Integer, Student> map = new TreeMap<Integer, Student>();
		
		
		//번호list를 담을 ArrayList만들어주고
		ArrayList<Integer> noList = new ArrayList<Integer>();
		//1000번부터 5개 담아주고
		for(int i = 0 ; i <5 ; i++) {
			noList.add(1000+i);
		}
		//이름 list를 담을 ArrayList만들어주고
		ArrayList<String> nameList = new ArrayList<String>();
		//nameList에 이름 담아주고.
		nameList.add("아이유");
		nameList.add("린다지");
		nameList.add("아이린");
		nameList.add("슬기");
		nameList.add("이효리");
		
		for(int i = 0 ; i <nameList.size(); i++) {
			//점수 4개 담긴 배열만들어주기
			int[] score = new int[4];
			for(int j = 0 ; j<score.length;j++) {
				score[j] = (int)(Math.random()*100-60+1)+60;
			}
			Student stud = new Student(noList.get(i),nameList.get(i),score);
			map.put(noList.get(i), stud);
		}
		//여기까지 map에 (번호랑, Student클래스타입)으로 내용이 담겼음.
		//키 값을 학생번호를 하는 방법?
		//일단 출력하면 자동정렬될 것 같은데? 키 값 정렬해주니까.
	
		
		Set set = map.keySet();
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			int key = (int)itor.next();
			Student value = (Student)map.get(key);
			System.out.println("no"+key+" | "+value);
		}
		
		
		System.out.println();
		System.out.println("//2. 키 값을 학생이름으로 하는 방법");
		
		TreeMap<String, Student> map2 = new TreeMap<String, Student>();
		
		for(int i = 0 ; i <nameList.size(); i++) {
			//점수 4개 담긴 배열만들어주기
			int[] score = new int[4];
			for(int j = 0 ; j<score.length;j++) {
				score[j] = (int)(Math.random()*100-60+1)+60;
			}
			Student stud = new Student(noList.get(i),nameList.get(i),score);
			map2.put(nameList.get(i), stud);
		}
		Set<String> set2 = map2.keySet();
		Iterator<String> itor2 = set2.iterator();
		while(itor2.hasNext()) {
			String key = itor2.next();
			Student value = map2.get(key);
			System.out.println(key+" | "+value);
		}
		
		
		System.out.println();
		System.out.println("//3. 내림차순 정렬해보기");
		//내림차순 정렬 프린트해보기.
		ArrayList<String> list = new ArrayList<String>(set2);
		Collections.reverse(list);
		for(int i = 0 ; i<list.size(); i++) {
			String key = list.get(i);
			System.out.println(list.get(i)+" | "+ map2.get(key));

		}
	}
	

	public static void main(String[] args) {
		new Ex02();
	}

}
