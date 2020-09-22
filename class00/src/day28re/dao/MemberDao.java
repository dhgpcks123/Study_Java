package day28re.dao;

import java.sql.*;
import java.util.*;

import day28re.vo.*;
import DB.MyJDBC;
import day28re.sql.*;
import day28re.controller.*;

public class MemberDao {
	MyJDBC db;
	MemberSQL mSQL;
	MemberJoin join;
	
	public MemberDao() {
		db = new MyJDBC();
		mSQL = new MemberSQL();
	
	}
	public MemberDao(MemberJoin join) {
		db = new MyJDBC();
		mSQL = new MemberSQL();
		this.join = join;
	}
	Connection conn;
	Statement stmt;
	ResultSet rs;
	PreparedStatement pstmt;
	public ArrayList<MemberVO> getlist(){
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		conn = 	db.getCon();
		stmt = db.getSTMT(conn);
		MemberSQL ms = new MemberSQL();
	try {
		rs= stmt.executeQuery(ms.getSQL(ms.SEL_MEMB_LIST));
		while(rs.next()) {
			MemberVO vo = new MemberVO();
			vo.setMno(rs.getInt("mno"));
			vo.setId(rs.getString("id"));
			vo.setPw(rs.getInt("pw"));
			vo.setName(rs.getString("name"));
			vo.setMail( rs.getString("mail"));
			vo.setTel( rs.getString("tel"));
			vo.setGen( rs.getString("gen"));
			vo.setAvt( rs.getInt("avt"));
	
			
			list.add(vo);
		};	
	
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		db.close(rs);
		db.close(stmt);
		db.close(conn);
	}
	return list;
	}

	public void intmemb(){
		conn = db.getCon();
		MemberSQL ms = new MemberSQL();
		pstmt = db.getPSTMT(conn, ms.getSQL(ms.INT_MEMB_LIST));
		join = new MemberJoin();
		
		
		String id = join.id.getText();
		String pw = join.pw.getText();
		String name = join.name.getText();
		String mail = join.mail.getText();
		String tel = join.tel.getText();
		String gen = join.gen.getText();
		int avt = Integer.parseInt(join.avt.getText());
		System.out.println("정보받기");
		try {
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, mail);
			pstmt.setString(5, tel);
			pstmt.setString(6, gen);
			pstmt.setInt(7, avt);
		
		int cnt = pstmt.executeUpdate();
			
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				db.close(pstmt);
				db.close(conn);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
