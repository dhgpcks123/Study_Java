//★
package day21;
/*
	학생의 시험 점수를 관리할 클래스를 정의해서
		이름, java, db, web, jsp, total을 입력해서 데이터를 완성하고
	ArrayList에 5명의 데이터를 추가하고
	출력하고
	
	총점을 기준으로 정렬하고
	출력하고
	java점수를 기준으로 정렬하고
	출력하고
	java넣으면 java기준으로 출력되게 해보자~
 */
import java.util.*;
import javax.swing.*;
public class Ex03 {

	Vector name = new Vector();
	public Ex03() {

		name.add("고길동");
		name.add("마이클");
		name.add("둘  리");
		name.add("홍길동");
		name.add("아이유");
		//ArrayList에 5명의 데이터를 추가하고 출력하고
		ArrayList list = new ArrayList();
		for(int i = 0 ; i<5; i++) {
			Exam exam = new Exam();
			exam.setName((String) name.get(i));
			int java = (int)(Math.random()*100+1);
			int db = (int)(Math.random()*100+1);
			int web = (int)(Math.random()*100+1);
			int jsp = (int)(Math.random()*100+1);
			exam.setJava(java);
			exam.setDb(db);
			exam.setWeb(web);
			exam.setJsp(jsp);
			exam.setTotal();
			list.add(exam);
		}
		for(int i = 0 ; i<list.size(); i++) {
		System.out.println(list.get(i));
		}
		
		
		Collections.sort(list, new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				Exam exam1 = (Exam)o1;
				Exam exam2 = (Exam)o2;
				int result = exam1.getJava()-exam2.getJava();
				return -result;
			}
		});
		//출력
		System.out.println("Java기준------------------------------------------------------");
		for(int i = 0 ; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

		Collections.sort(list, new Comparator(){
			
			@Override
			public int compare(Object o1, Object o2) {
				Exam exam1 = (Exam)o1;
				Exam exam2 = (Exam)o2;
				int result = exam1.getTotal()-exam2.getTotal();
				return -result;
			}
		});
		
		Collections.sort(list, new Comparator(){
			
			@Override
			public int compare(Object o1, Object o2) {
				Exam exam1 = (Exam)o1;
				Exam exam2 = (Exam)o2;
				int result = exam1.getName().compareTo(exam2.getName());
				return result;
			}
		});
		//출력
		System.out.println("이름기준------------------------------------------------------");
		for(int i = 0 ; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		//출력하고
		//java점수를 기준으로 정렬하고
		//출력하고
		
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
