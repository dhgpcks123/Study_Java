//★
package day26;
//JDBC를 이용해 ORACLE의 member01에서 name이 오혜찬인 데이터를 지우자.
import java.sql.*;
public class Test02_extra {

	Connection con = null;
	public Test02_extra() {
		//드라이버를 가져온다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("***드라이버 가져오기 성공");
			//드라이버를 연결시킨다.
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "hello";
			String pw = "hello";				
			//드라이버를 연결시켜주는 클래스가 있따~ DriverManager.getConnection
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("***커넥션 성공");
			
			//statement를 만들어줘야하는데
			Statement stmt = con.createStatement();
			//질의문을 만들어주고
			String sql = "DELETE FROM member01 WHERE name = '오혜찬'";
			
			//이제 커넥션에다가 보내야해. 그리고 숫자를 반환받아.
			int cnt = stmt.executeUpdate(sql);
			if(cnt != 1){
				System.out.println("에러가 났다");
			}else {
				System.out.println("삭제가 성공했다.");
			}
			
			
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		new Test02_extra();
	}

}
