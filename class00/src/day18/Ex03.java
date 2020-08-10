package day18;

/*
	학생의
		이름, java, oracle, web, jsp, total
	성적을 관리할 클래스를 작성하세요.
	
	1. toString 오버라이드
		단, 클래스를 출력하면
			"???? 학생의 성적 : java-xxx, oralce-xxx, web-xxx, jsp-xxx total-xxx"
		의 형식으로 출력되게 하세요.
	
	2. equals() 오버라이드
		학생이름이 같으면 같은 학생으로 처리되게 하세요.
 */
public class Ex03 {

	public Ex03() {
		String[] name = new String[] {"유병욱" ,"오혜찬","윤요셉","이지우","오혜찬"};
		int[] java = new int[] {99, 53, 95,82,70} ;
		int[] oracle = new int[] {77, 88, 99, 55, 77};
		int[] web = new int[] {97,78,76,78,96};
		int[] jsp = new int[] {77,67,98,76,87};
		
		Student[] student = new Student[name.length];
		
		for(int i = 0 ; i <name.length; i ++) {
			student[i] = new Student(name[i],java[i],oracle[i],web[i],jsp[i]); 
			System.out.println(student[i]);
		}

		
	System.out.println("-----------------------------------------------------------★");
	/*
	for(int i = 0 ; i <name.length-1; i++) {
		for (int j = i+1 ; j<name.length ; j++) {
			if(name[i].equals(name[j])) {
				System.out.println(name[i]+"와 "+name[j]+"는 같은 학생이다");
			}
		}
	}
	}
	*/
	boolean bool1=false;
	for(int i = 0 ; i<name.length-1; i++) {
		for (int j = i+1 ;j <name.length ; j++) {
			bool1 = student[i].equals(student[j])?true:false;
			if(bool1 == true) {
				System.out.println((i+1)+"번째 "+student[i].name+"학생과 "+(j+1)+"번째 "+student[j].name+"학생은 이름이 같다.");
			}
		}
		
	}
}
	
	public static void main(String[] args) {
		new Ex03();
	}
	

}

//-------------------------------------------
class Student{
	String name;
	int java, oracle, web, jsp;
	double total;
	
	public Student() {}
	public Student(String name, int java, int oracle, int web, int jsp) {
		this.name = name;
		this.java = java;
		this.oracle = oracle;
		this.web = web;
		this.jsp = jsp;
		setTotal();
	}
	public void setTotal() {
		total = java+oracle+web+jsp/4.0;
	}
	public String toString() {
		return name+" 학생의 성적 : java-"+java+", oracle-"+oracle+
				", web-"+web+", jsp-"+jsp+", total-"+total;
	}
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Student s = (Student) o;
		if(this.name== s.name) {
			bool = true;
		}
		return bool;
	}
}