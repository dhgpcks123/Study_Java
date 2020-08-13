package day21;

public class Exam {
	private String name;
	private int java, db, web, jsp, total;
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
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = java+db+web+jsp;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "시험점수 [name=" + name + ", java=" + java + ", db=" + db + ", web=" + web + ", jsp=" + jsp + ", total="
				+ total + "]";
	}
	
	
}
