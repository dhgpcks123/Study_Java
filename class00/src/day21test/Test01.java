package day21test;

import java.util.Vector;

public class Test01 {
	
	public Test01() {
		Vector scoreList = getVector();
		for(int i = 0 ; i<scoreList.size(); i++) {
			Stud st = (Stud)scoreList.get(i);
			System.out.println(st);
		}
	}
	public static void main(String[] args) {
		new Test01();
	}

	public Vector getVector() {
		Vector name = new Vector();
		name.add("둘리");
		name.add("고길동");
		name.add("도우너");
		name.add("또  치");
		name.add("마이콜");
		
		Vector stud = new Vector();
		for(int i =0; i<name.size();i++) {
			Stud s = new Stud();
			s.setName((String)name.get(i));
			setVO(s);
			
			stud.add(s);
		}
		return stud;
	}
	public void setVO(Stud vo) {
		Vector score = new Vector();
		for(int i = 0 ; i<4; i ++) {
			int no = (int)(Math.random()*41+60);
			score.add(no);
		}
		vo.setJava((int)score.get(0));
		vo.setDb((int)score.get(0));
		vo.setWeb((int)score.get(0));
		vo.setJsp((int)score.get(0));
		vo.setSum();
	}
}


class Stud {
	String name;
	int java, db, web, jsp, sum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getSum() {
		return sum;
	}
	public void setSum() {
		this.sum = java+db+web+jsp;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "Stud [name=" + name + ", java=" + java + ", db=" + db + ", web=" + web + ", jsp=" + jsp + ", sum="
				+ sum + "]";
	}
	
}