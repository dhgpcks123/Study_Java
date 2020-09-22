package day28.sql;

public class MemberSQL {
	public final int SEL_MEMB_LIST = 1001;
	public final int SEL_MEMB_INFO = 1002;
	
	public final int INT_MEMB_LIST = 2001;
	public final int INP_MEMB_LIST = 2002;
	
	//질의명령 반환해줄 함수
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		//코드값에 따라 반환해줄 질의명령 분기처리
		switch(code) {
		case SEL_MEMB_LIST:
			buff.append("SELECT ");
			buff.append("	mno, id, name, mail ");
			buff.append("FROM ");
			buff.append("	member01 ");
			buff.append("WHERE ");
			buff.append("	isshow = 'Y' ");
			buff.append("ORDER BY ");
			buff.append("	mno ");
			break;
		case SEL_MEMB_INFO:
			buff.append("SELECT ");
			buff.append("	mno, id, name, mail, tel, ano, aname, m.gen, joindate ");
			buff.append("FROM ");
			buff.append("	member01 m, avatar a ");
			buff.append("WHERE ");
			buff.append("	avt = ano ");
			buff.append("	AND id = ? ");
			break;
		case INT_MEMB_LIST:
			buff.append("INSERT INTO member01 ");
			buff.append("	(mno, id, name, mail, tel, gen, avt) ");
			buff.append("VALUES( ");
			buff.append(" 	(SELECT (NVL(MAX(mno)+1,100)) FROM member01), ");
			buff.append(" 	?, ?, ?, ?, ?, ? ");
			buff.append(") ");
			break;
		case INP_MEMB_LIST:
			buff.append("INSERT INTO member01 ");
			buff.append("	(mno, id, name, pw, mail, tel, gen, avt) ");
			buff.append("VALUES( ");
			buff.append(" 	(SELECT (NVL(MAX(mno)+1,100)) FROM member01), ");
			buff.append(" 	?, ?, ?, ?, ?, ?, ? ");
			buff.append(") ");
			break;
		}
		
		//회원가입 이름, 아이디, mno, mail
		return buff.toString();
	}

}
