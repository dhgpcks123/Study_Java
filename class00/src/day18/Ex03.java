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
		Stud[] stud = new Stud[2];
		for(int i = 0 ; i<stud.length ; i++) {
			String str = JOptionPane.showInputDialog("이름을 입력하세요");
			
			try{
				if(i!=0 && str.equals(stud[i-1].name)) {
					throw new Exception();}
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "같은 이름을 입력했습니다.");
				i--;
			}
			int[] score = new int[4];
			for(int j = 0 ; j<4 ; j++) {
				score[j] = (int)(Math.random()*41 + 60);
		}
			stud[i] = new Stud(str,score[0],score[1],score[2],score[3]);
		}
		JOptionPane.showMessageDialog(null, stud[0]+"\n"+stud[1]);
		
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
		total= java+oracle+web+jsp;
	}

	public String toString() {
		return name + " 학생의 성적 : java - " + java + ", oracle - " + oracle + ", web - " + web + ", jsp - " + jsp + ", total - " + total;
	}
	
	public boolean equals(Object o) {
		return this.name == ((Stud)o).name;
	}
}
