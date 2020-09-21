package day27;

import day27.dao.*;
import day27.sql.*;
import day27.vo.*;

import java.sql.Connection;
import java.util.*;

import DB.MyJDBC;

public class Test03 {
/*
	작업 코드를 입력받는다.
		l	: 회원 아이디 리스트 조회
			==> 콘솔 화면에 아이디리스트가 출력
			
		i	: 회원 정보 조회
			==> 회원 아이디를 입력받아서
				해당 아이디의 정보를 조회하고 콘솔 화면에 출력
			
			p : 전단계 이동
		----------------------------------------------다시 입력받는 곳으로~
		
		q	: 프로그램 종료
			==> 회원 아이디를 입력받아서
*/
	Connection con = null;
	MemberDao mdao = null;
	public Test03() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("작업코드를 입력받으세요. \n"
				+ "l : 회원 아이디 리스트 조회 \n"
				+ "i : 회원 정보 조회 \n");
		String str = sc.nextLine();
			String msg = "";
			if(str.equals('l')){
				msg = "l을 입력했습니다.\n회원 아이디 리스트를 조회합니다.";
				getId();
			}else if(str.equals('i')) {
				msg = "i를 입력했습니다.\n 조회할 아이디를 입력하세요.";
				
			}else if(str.equals('p')) {
				System.out.println("p입력");
				
			}else if(str.equals('q')) {
				System.out.println("q입력");
			}
			
			sc.close();

		}
	
	public void getId() {
		//연결
		mdao = new MemberDao();
		
		System.out.println(mdao.selMemb());
	}

	public static void main(String[] args) {
		new Test03();
	}

}
