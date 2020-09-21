//★
package day26;
/*
	아이디를 입력하면 해당 아이디 소유자를 알려주는 프로그램을 작성하세요
	단, PreparedStatement를 사용해서 작성하세요.
 */


import java.sql.*;
import javax.swing.*;

public class Test03 {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
	public Test03() {
		try {
			// 드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 데이터베이스에 연결
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "hello";
			String pw = "hello";
			con = DriverManager.getConnection(url, id, pw);
			
			// pstmt만들기 전에 질의명령 먼저 만들어둬야해요
			// 질의명령 만들고
			String sql = "SELECT name FROM member01 WHERE id = ? ";
			// PreparedStatement를 만든다.
			pstmt = con.prepareStatement(sql);
			
			// 데이터 보내기 전에 입력받고
			String sid =  JOptionPane.showInputDialog("조회할 아이디를 입력하세요");
			
			// 질의명령을 완성하고
			pstmt.setString(1, sid);
			
			// 이제 질의명령의 ?가 실제 데이터로 채워져서 실행가능한 상태가 됐다.
			// 따라서 질의명령을 실행해달라고 요청만 하면 된다.
			
			// 질의명령 실행요청하고 결과 받고
			rs = pstmt.executeQuery();
			
			// 작업 행 이동시키고
			rs.next();
			
			//데이터꺼내고<== 이제 작업행은 실제 결과 첫번째 행으로
			//이동한 상태이므로 필요한 데이터를 꺼내기만 하면 된다.
			
			String name = rs.getString("name");
			
			//출력한다.
			JOptionPane.showMessageDialog(null,
										"<html><h2>입력아이디 <span style=\"color:red\"> "
										+sid+"</span>는 "
										+name+" 회원이다.</h2></html>");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
