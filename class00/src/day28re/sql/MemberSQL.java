package day28re.sql;

public class MemberSQL {
	public final int SEL_MEMB_LIST =1001;
	public final int INT_MEMB_LIST =2001;

	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code) {
			case SEL_MEMB_LIST:
				buff.append("SELECT ");
				buff.append("	mno, id, pw, name, mail, tel, gen, avt ");
				buff.append("FROM ");
				buff.append("	member01");
			break;
			case INT_MEMB_LIST:
				buff.append("INSERT INTO member01");
				buff.append("(mno, id, pw, name, mail, tel, gen, avt) ");
				buff.append("VALUES( ");
				buff.append("(SELECT (NVL(MAX(mno)+1, 100)) FROM member01),  ");
				buff.append("	?, ?, ?, ?, ?, ?, ?); ");
			break;
	}
		return buff.toString();

	}
}
