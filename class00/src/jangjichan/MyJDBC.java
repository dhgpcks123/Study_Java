package jangjichan;

import java.sql.*;

public class MyJDBC {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String user = "hello";
	private String pw = "hello";

	
	public MyJDBC() {
		
		try {
			Class.forName(driver);
			System.out.println("## 드라이버가 준비되었습니다 ##");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//Sonnection
	public Connection getCon() {
		Connection con = null;
			try {
				con = DriverManager.getConnection(url, user, pw);
			}catch(Exception e) {e.printStackTrace();}
		return con;
	}
	
	//Statement
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
			try {
				stmt = con.createStatement() ;
			}catch(Exception e) {
				e.printStackTrace();
			}
		return stmt;
	}
	
	//preapredStatement
	public PreparedStatement getPSTMT(Connection con, String sql) {
		PreparedStatement pstmt = null;
			try {
				pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			}catch(Exception e) {e.printStackTrace();}
		return pstmt;
	}
	
	public void close(Object o) {
		try {
			if(o instanceof Connection) {
				((Connection)o).close();
			}else if(o instanceof Statement) {
				((Statement)o).close();
			}else if(o instanceof PreparedStatement) {
				((PreparedStatement)o).close();
			}else if(o instanceof ResultSet) {
				((ResultSet)o).close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
