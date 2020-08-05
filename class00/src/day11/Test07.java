//★
package day11;

import java.sql.Date;

public class Test07 {
	public Test07() {
		
	}
	public static void main(String[] args) {
		new Test07();
	}
	
}


//-----------------------------------------------------------------
class Memb{
	private int mno;
	private String name, id, pw, mail, tel, addr;
	private char gen;
	private String birth;
	private Date joinDate;

	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno =mno;
	}
	public String getName( ) {
		return name;
	}
	public void Setname(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw= pw;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	@Override
	public String toString() {
		return "Memb  : mno=" + mno + ", name=" + name + ", id=" + id + ", pw=" + pw + ", mail=" + mail + ", tel=" + tel
				+ ", addr=" + addr + ", gen=" + gen + ", birth=" + birth + ", joinDate=" + joinDate ;
	}
	
}
