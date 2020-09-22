package day28.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DB.MyJDBC;
import day28.controller.MemberJoin;
import day28.evt.JoinEvent;
import day28.sql.MemberSQL;
import day28.vo.MemberVO;

public class MemberDao {
	MyJDBC db;
	MemberSQL mSQL;
	
	public MemberDao() {
		db = new MyJDBC();
		mSQL = new MemberSQL();
	}
	
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	// 회원리스트 가져오기 데이터베이스 작업 전담 처리함수
	public ArrayList<MemberVO> getList(){
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
			con = db.getCon();
			stmt = db.getSTMT(con);
			try {
				rs = stmt.executeQuery(mSQL.getSQL(mSQL.SEL_MEMB_LIST));
				while(rs.next()) {
					MemberVO vo = new MemberVO();
					vo.setMno(rs.getInt("mno"));
					vo.setId(rs.getString("id"));
					vo.setName(rs.getString("name"));
					vo.setMail(rs.getString("Mail"));
					list.add(vo);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					db.close(rs);
					db.close(stmt);
					db.close(con);					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		return list;
	}

	public ArrayList<MemberVO> getmemb(){
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		con= db.getCon();
		pstmt = db.getPSTMT(con, mSQL.getSQL(mSQL.SEL_MEMB_INFO));
		String id = JOptionPane.showInputDialog("조회할 id입력하세요");
		try {
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {

				MemberVO vo = new MemberVO();
				vo.setMno(rs.getInt("mno"));
				vo.setId(rs.getString("id"));
				vo.setMail(rs.getString("mail"));
				vo.setAno(rs.getInt("ano"));
				vo.setAname(rs.getString("aname"));
				vo.setJoinDate(rs.getDate("joindate"));
				vo.setJoinTime(rs.getTime("joindate"));
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				db.close(pstmt);
				db.close(con);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	
	public void intList(){
		con = db.getCon();
		try {
			pstmt = con.prepareStatement(mSQL.getSQL(mSQL.INT_MEMB_LIST));
//			mno, id, name, mail
			String id = JOptionPane.showInputDialog("id 입력하세요");
			String name = JOptionPane.showInputDialog("이름 입력하세요");
			String mail = JOptionPane.showInputDialog("메일 입력하세요");
			String tel = JOptionPane.showInputDialog("전화번호 입력하세요");
			String gen = JOptionPane.showInputDialog("성별을 입력하세요");
			String avt = JOptionPane.showInputDialog("아바타번호를 입력하세요");
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, mail);
			pstmt.setString(4, tel);
			pstmt.setString(5, gen);
			pstmt.setString(6, avt);
			
			int cnt = pstmt.executeUpdate();
		
			JOptionPane.showMessageDialog(null, "업데이트에 성공했습니다.");
			System.out.println("ID = "+ id+ "|name = "+ name+ "|mail = " + mail+"|tel = " + tel+"|gen = "+gen+"|avt = "+avt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "업데이트에 실패했습니다.");
		}finally {
			try {
				db.close(pstmt);
				db.close(con);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		}
		
		public int joinlist(MemberVO vo){
			int cnt = 0 ;
			con = db.getCon();
			try {
				pstmt = con.prepareStatement(mSQL.getSQL(mSQL.INP_MEMB_LIST));
				JoinEvent je = new JoinEvent();
				

				System.out.println("vo클래스담기");
				pstmt.setString(1, vo.getId());
				pstmt.setString(2, vo.getName());
				pstmt.setString(3, vo.getPw());
				pstmt.setString(4, vo.getMail());
				pstmt.setString(5, vo.getTel());
				pstmt.setString(6, vo.getGen());
				pstmt.setInt(7, vo.getAno());
				System.out.println("테스트2" + vo.getId());
				System.out.println("vo클래스 뽑기");
				cnt = pstmt.executeUpdate();
				
				JOptionPane.showMessageDialog(null, "업데이트에 성공했습니다.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "업데이트에 실패했습니다.");
			}finally {
				try {
					db.close(pstmt);
					db.close(con);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		
		
			return cnt;
	}
	//아이디 카운트 조회 전담 처리함수
	public int idCount(String id) {
		int cnt = 0 ; 
		

		
		return cnt;
	}
}
