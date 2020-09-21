package day26;
/*
	dbms오라클 member01 테이블에서
	이름을 입력하면 해당 유저가 avt 번호를 알려주는 프로그램을 작성하세요
	단, PreparedStatement를 사용해서 작성하세요.
*/
import java.sql.*;

import javax.swing.JOptionPane;
public class Test03_extra {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
	public Test03_extra() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url ="jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "hello";
			String pw = "hello";
			con = DriverManager.getConnection(url, user, pw);
			
			String sql = "SELECT avt FROM member01 WHERE name = ? ";
			
			pstm = con.prepareStatement(sql);
			String sname =  JOptionPane.showInputDialog("조회할 이름를 입력하세요");

			pstm.setString(1, sname);
			
			rs = pstm.executeQuery();
			rs.next();
			int avt = rs.getInt("avt");
			System.out.println("입력한 이름"+sname+" 아바터번호는 "+ avt);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstm.close();
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

	public static void main(String[] args) {
		new Test03_extra();
	}

}
