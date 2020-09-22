package day27.dao;

import java.sql.*;
import DB.*;
import day27.sql.*;
import day27.vo.*;

public class MemberDao {
	MyJDBC db ;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	MemberSQL mSQL;
	
	
	public MemberDao() {
			db = new MyJDBC();
			mSQL = new MemberSQL();
	}
	//아이디 리스트 출력해주는 작업 전담 처리함수
	public String selMemb(){
		//커넥션가져오고
		con = db.getCon();
		//2질의명령 꺼내오고
		String sql = mSQL.getSQL(mSQL.SEL_ID_LIST);
		//3 Statement 만들고
		stmt = db.getSTMT(con);
		StringBuffer buff = new StringBuffer();
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				buff.append(rs.getString("id")+"\n");
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		return buff.toString();
		
	}
	
	//회원가입 데이터베이스 작업 전담 처리함수
	public int addMemb(MemberVO mVO) {
		int cnt = 0;
		//할 일
		//1. 커넥션 얻어오고
		con = db.getCon();
		//2. 질의명령 꺼내오고
		String sql = mSQL.getSQL(mSQL.ADD_MEMB);
		//3. PreparedStatement 만들고
		pstmt = db.getPSTMT(con, sql);
		try {
			//4. 질의명령 완성하고
			pstmt.setString(1, mVO.getId());
			pstmt.setString(2, mVO.getName());
			pstmt.setString(3, mVO.getPw());
			pstmt.setString(4, mVO.getMail());
			pstmt.setString(5, mVO.getTel());
			pstmt.setString(6, mVO.getGen());
			pstmt.setInt(7, mVO.getAvt());
			//5. 질의명령 실행 요청하고 결과 반환하고
			cnt = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(pstmt);
			db.close(con);
		}
		//6. 결과 반환해주고
		System.out.println("회원가입 데이터베이스 작업 전담 처리함수");
		return cnt;
	}
	
	//아이디 중복체크 데이터베이스 작업 전담 처리함수
	public int idCount(String id) {
		int cnt = 0;
		// 할 일
		// 1. 커넥션 얻어오고
		con = db.getCon();
		// 2. 질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.SEL_ID_CNT);
		// 3. PreparedStatement 만들고
		pstmt = db.getPSTMT(con, sql);
		try {
			// 4. 질의명령 완성하고
			pstmt.setString(1, id);
			// 5. 질의명령 보내고 결과 받고 받고
			rs = pstmt.executeQuery();
			// 6. 데이터 꺼내고
			rs.next(); //작업줄로 이동
			cnt = rs.getInt("cnt");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		 
		// 7. 데이터 내보내고
		System.out.println("아이디 중복체크 데이터베이스 작업 전담 처리함수");
		return cnt;
	}
	
	

}
