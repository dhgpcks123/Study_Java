//★
package day12;
/*
문제 2 ]
	1.
		java, oracle, html, jsp, total 점수를 기억할 클래스를 만들고
		학생 한명의 데이터를 입력해서 출력하세요.
		
		조건 ]
		점수는 70 ~ 95 사이로 한다.
		출력함수도 만드는 것으로 한다.
	
	2. 
		생성자 함수를 오버로딩해서
		4 과목 점수를 입력해서 객체가 만들어지게 하세요.
		출력...
	
	3. 
		3명 데이터를 관리할 배열을 만들어서 
		입력하고
		출력하세요.
		
*/
public class Ex02 {
	public Ex02() {
//		Exam ex = new Exam();
//		ex.setData();
	}
	public Ex02(int a, int b, int c) {
		Exam ex2 = new Exam();
		ex2.setData(a,b,c);
//		ex2.toPrint();
	}
	public static void main(String[] args) {
		new Ex02(30, 40 ,50);
	}
}
//-------------------------------------------------------
class Exam{
	int java, oracle, html, jsp, total;
	Exam[] student;
	
	public void setData(int a, int b,int c) {
	java = a;
	oracle = b;
	html = c;
	total = a+b+c;
	System.out.println(java+ " " + oracle+ " " + html+"  "+ total);
	}
	
	public void setData() {
		int[] java = new int[3];
		int[] oracle = new int[3];
		int[] html = new int[3];
		int[] jsp = new int[3];
		int[] total = new int[3];
		for(int i = 0 ; i<java.length ; i++) {
			
			int no1 = (int)(Math.random()*(95-70+1)+1);
			java[i] = no1;
			int no2 = (int)(Math.random()*(95-70+1)+1);
			oracle[i] = no2;
			int no3 = (int)(Math.random()*(95-70+1)+1);
			html[i] = no3;
			int no4 = (int)(Math.random()*(95-70+1)+1);
			jsp[i] = no4;
			total[i] = no1+no2+no3+no4;
		}
		
		student = new Exam[3];
		
		for(int i = 0; i<student.length ; i++) {
		student[i] = new Exam();	
		
			student[i].java = java[i];
			student[i].oracle = oracle[i];
			student[i].html = html[i];
			student[i].jsp = jsp[i];
			student[i].total = total[i];
		}
	}
	public void toPrint() {
		for(int i = 0 ; i<student.length ; i++) {
			System.out.println(student[i].java+" "+student[i].oracle+" "+
					student[i].html+" "+student[i].jsp+"토탈점"+student[i].total);
			
		}
	}
	
}