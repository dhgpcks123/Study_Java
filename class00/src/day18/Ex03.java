package day18;

import javax.swing.JOptionPane;

/*
	학생의
		이름, java, oracle, web, jsp, total
	(2명의)성적을 관리할 클래스를 작성하세요.
	
	1. toString 오버라이드
		단, 클래스를 출력하면
			"???? 학생의 성적 : java-xxx, oralce-xxx, web-xxx, jsp-xxx total-xxx"
		의 형식으로 출력되게 하세요.
	
	2. equals() 오버라이드
		학생이름이 같으면 같은 학생으로 처리되게 하세요. 그럼? 다시 입력시켜야지
		
 */
public class Ex03 {

	public Ex03() {
		Stud[] student = new Stud[2];
		for(int i = 0 ; i<2; i++) {
			try {
				student[i].name = JOptionPane.showInputDialog("이름을 입력하세요");
				
				if( i!=0 && student[i].name.equals(student[i-1].name)) {
					throw new Exception();
				}
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "다시 입력하세요");
				i--;
			}
			
			int[] score = new int[4];
			for(int j = 0 ; j<4; j++) {
				int no = (int)(Math.random()*100-10+1)+10;
				score[j] = no;
			}		
			student[i] = new Stud(student[i].name,score[0],score[1],score[2],score[3]);
		}
		
		
		//점수를 입력해주자.
		String msg = student[0].name.equals(student[1].name) ? "같은 " : "다른 ";
		JOptionPane.showMessageDialog(null, "두 학생은 " + msg + "학생입니다.\n" + student[0] + "\n" + student[1]);

	}
	public static void main(String[] args) {
		new Ex03();
	}
	
}

//-------------------------------------------------
class Stud {
	String name;
	int java, oracle, web, jsp, total;
	public Stud() {}
	public Stud(String name, int java, int oracle, int web, int jsp) {
		this.name =name;
		this.java =java;
		this.oracle=oracle;
		this.web=web;
		this.jsp=jsp;
		setTotal();
	}
	
	public void setTotal() {
		total = java+oracle+web+jsp;
	}
	public String toString() {
		return name+" 학생의 성적 : java-"+java+", oralce-"+oracle+", web-"+web+", jsp-"+jsp+" total-"+total;
	}
	
	public boolean equals(Object o) {
		return this.name == ((Stud)o).name;
	}
	
}