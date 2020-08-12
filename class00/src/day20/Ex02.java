package day20;
/*
	세 사람의 시험 결과를 출력하세요.
	형식은
		
		전은석 - java : 100, oracle : 95, web : 75, JSP : 95, Total = 365
		
	의 형태로 출력되게 하세요.
	점수는 랜덤하게 만들어도 됩니다.
 */

import java.text.*;

public class Ex02 {
	public Ex02() {
		String[] name = {"윤요셉", "유병욱", "오혜찬"};
		Exam[] exam = new Exam[name.length];
		for(int i = 0 ; i<exam.length ; i++) {
			exam[i] = new Exam(name[i]);
		}
		
		//출력하기
		for(Exam ex : exam) {
			System.out.println(ex);
		}
	
	
	
	}
	

	public static void main(String[] args) {
		new Ex02();
	}

}
//---------
class Exam{
	String name;
	int java, oracle, web, JSP, total;
	public Exam(String name) {
		int[] num = new int[4];
		
		for(int i = 0 ; i<num.length ; i++) {
			num[i] = (int)(Math.random()*41+60);
			this.name = name;
			java=num[0];
			oracle=num[1];
			web=num[2];
			JSP=num[3];
			setTotal();
			
		}
	}
	public Exam(String name, int java, int oracle, int web, int JSP) {
		this.name = name;
		this.java = java;
		this.oracle = oracle;
		this.web =web;
		this.JSP =JSP;
		setTotal();
	}
	public void setTotal() {
		total = java+oracle+web+JSP;
	}
	@Override
	public String toString() {
		MessageFormat form = new MessageFormat("{0} - java: {1}, oracle{2}, web: {3}, JSP : {4}, totla : {5}");
		Object[] obj = {name, java, oracle, web, JSP, total};
		String result = form.format(obj); 
		return result;
	}
	
}