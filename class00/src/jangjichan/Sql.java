package jangjichan;

public class Sql {

	public final int SEL_ID_ALIST =1000;
	
	public final int SEL_ID_LIST = 2000;
	public final int SEL_IP_LIST = 2001;
	
	public String getSql(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_ID_ALIST :
			buff.append("SELECT ");
			buff.append(" 	id ");
			buff.append("FROM ");
			buff.append("	id_ipList ");
			break;
			
		case SEL_ID_LIST :
			buff.append("SELECT ");
			buff.append("	id ");
			buff.append("FROM ");
			buff.append("	id_ipList ");
			buff.append("WHERE ");
			buff.append("	ip = ? ");
			break;
		case SEL_IP_LIST :
			buff.append("SELECT ");
			buff.append("	ip ");
			buff.append("FROM ");
			buff.append("	id_ipList ");
			buff.append("WHERE ");
			buff.append("	id = ? ");			
			break;
		}
		
		return buff.toString();
	}
	

}
