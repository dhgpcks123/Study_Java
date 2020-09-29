package jangjichan;

import jangjichan.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
import java.util.*;
public class LeftJTextArea {
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	public Vector<String> v = new Vector<String>();
	
	Sql sql = new Sql();

	public LeftJTextArea() {
		MyJDBC db = new MyJDBC();
		con = db.getCon();
		
		stmt = db.getSTMT(con);
		
		String str = sql.getSql(sql.SEL_ID_ALIST);
		try {
			rs = stmt.executeQuery(str);
			while(rs.next()) {
				v.add(rs.getString("id"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		System.out.println("완료");
	}
	
	public String idToip(String sid) {
		MyJDBC db = new MyJDBC();
		con = db.getCon();
		String tmp = sql.getSql(sql.SEL_IP_LIST);
		pstmt = db.getPSTMT(con, tmp);
		String ip = "";
		try {
			pstmt.setString(1, sid);
			rs = pstmt.executeQuery();
			rs.next();
			ip = rs.getString("ip");
		} catch(Exception e) {
			
		} finally {
			try {
				db.close(rs);
				db.close(pstmt);
				db.close(con);
			} catch(Exception e) {}
		}
		
		return ip;
	}

	
	public static void main(String[] args) {
		new LeftJTextArea();
	}
}
