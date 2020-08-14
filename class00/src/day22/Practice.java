package day22;

import java.util.*;

public class Practice {

	public Practice() {
	HashMap map = new HashMap();
	map.put("둘리", "010-2222-2222");
	map.put("또치", "010-7777-7777");
	map.put("고길동", "010-1234-7547");
	map.put("도우너", "010-9876-5551");
	map.put("마이콜", "010-3105-5459");
	
//	Set set = map.keySet();
//	Iterator itor =set.iterator();
//	while(itor.hasNext()) {
//		Object key = itor.next();
//		Object value = map.get(key);
//		System.out.println(key+"|"+value);
//	}
	Set set = map.entrySet();
	Iterator itor =set.iterator();
	while(itor.hasNext()) {
		Map.Entry data = (Map.Entry)itor.next();
		System.out.println(data.getKey()+"|"+data.getValue());
	}
	
	}
	
	
	
	public static void main(String[] args) {

		new Practice();
	}

}
