package day11;

import javax.swing.*;
public class Health {
		String name, mail, id;
		int age;
		char gen;
		
		public void setData(String name, String mail, String id, int age, char gen ) {
		this.name = name;
		this.mail = mail;
		this.id = id;
		this.age = age;
		this.gen = gen;		
		}
		
		public void toPrint() {
			JOptionPane.showMessageDialog(null, "회원 정보 : " +name+" "+mail+ id+" "+age+" "+ gen);
		}
		
}
