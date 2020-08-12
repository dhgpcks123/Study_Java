package day20;

/*
	1. 	Vector를 만들고
		이름, 자바, 디비, 웹, jsp, 총점을 저장해서 
		출력하세요.
	
	2. 3명을 출력하세요.
		
 */
import java.util.*;
public class Ex03 {

	public Ex03() {
		/*
		Vector vec = new Vector();
		vec.add("오혜찬");
		int sum=0;
		for(int i = 0 ; i<4 ; i++) {
			int no = (int)(Math.random()*100);
			vec.add(no);
			sum+= no;
		}	
		vec.add(sum);
		
		System.out.print(" | ");
		for(int i = 0 ; i<vec.size() ; i++) {
			System.out.print(vec.get(i)+" | ");
		}
		*/
		
		
		
		Vector vec1 = new Vector();
		Vector v = new Vector();
		
		Vector name = new Vector();
		name.add("홍길동");
		name.add("오혜찬");
		name.add("둘리");
		name.add("감자");
		
		
		for(int i = 0 ; i<3 ; i++) {
			int sum1=0;
			v.add(name.get(i));
			for(int j = 0 ; j<4 ; j++) {
				int no = (int)(Math.random()*100);
				sum1+= no;
				v.add(no);
			}
			v.add(sum1);
			
			}
		vec1.add(v);
	
	for(Object o : vec1) {
		System.out.print(((Vector)o).toString());
	}
	
	System.out.println();
	System.out.print("-----------------------");
	
		Vector testVector = new Vector();
		Vector testSubVector = new Vector();
		System.out.println();
		
		
		int sum = 0;
			for(int j = 0 ; j <3 ; j++) {
				testSubVector.add(name.get(j));
			sum=0;
			for(int i = 0 ; i <4; i ++) {
				int no1 = (int)(Math.random()*100);
				testSubVector.add(no1);
				sum+= no1;
			}
			testSubVector.add(sum);
			}
			System.out.print("-----------------------");
			System.out.println();
		testVector.add(testSubVector);

		System.out.println(testVector.get(0));
	}

	
	

	public static void main(String[] args) {
		new Ex03();
	}

}
