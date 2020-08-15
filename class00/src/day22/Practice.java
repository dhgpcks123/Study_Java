package day22;

import java.util.*;

public class Practice {

	public Practice() {
		Hashtable table = new Hashtable();
		table.put("이름","지원자");
		table.put("성별","차원");
		table.put("전화","지원자");
		table.put("폰번","010-5554-2343");
		table.put("폰번","다이줘버려아");
		table.put("민들레","가나다");
		table.put("개나리","카타파하");
	
		
		
		
		System.out.println(table.get("이름"));
		System.out.println(table.get("폰번"));
		System.out.println();
		System.out.println();
		System.out.println(table.keys());
		System.out.println(table.keySet());
		System.out.println();
		System.out.println();
		System.out.println(table.values());
		Collection col = table.values();
//		Collections.sort((ArrayList) col);
		for(Object o : col) {
			System.out.println(o+"====");
		}
		System.out.println();
		System.out.println(table.toString());
		System.out.println();
		Object[] o = col.toArray();
		for(int i = 0; i<o.length ; i++) {
			System.out.print(o[i]+" | ");
		}
		
		Iterator itor = col.iterator();{
			while(itor.hasNext()) {
				System.out.println(itor.next());
			}
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$4");
		ArrayList listtest = new ArrayList(table.keySet());
		for(int i = 0 ; i<listtest.size() ; i++) {
			System.out.print(listtest.get(i)+"\\");
		}
		System.out.println();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$4");
		
		ArrayList list = new ArrayList(col);
		for(int i = 0 ; i<list.size() ; i++) {
			System.out.print(list.get(i)+"\\");
		}
		System.out.println();
		Collections.sort(list);
		for(int i = 0 ; i<list.size() ; i++) {
			System.out.print(list.get(i)+"@@");
		}
		
		System.out.println();
		Enumeration en = table.keys();
		while(en.hasMoreElements()) {
			Object key = en.nextElement();
			Object value = table.get(key);
			System.out.println(key+" "+" "+value);
		}
		
		Set set = table.keySet();
		for(Object key:set) {
			Object value = table.get(key);
				System.out.println(key+" "+value);
			}
		
		Iterator ito = set.iterator();
		for(int i = 0 ; ito.hasNext();i++) {
			Object key =ito.next();
			Object value = table.get(key);
			System.out.println();
		}
		
		Collection listo2 = new ArrayList(set);
		for(Object s :listo2) {
			
			Object key =s;
			Object value = table.get(key);
			System.out.println(value+" "+key);
		}
System.out.println();		
		ArrayList listo = new ArrayList(set);
		for(Object s :listo) {
			
			Object key =s;
			Object value = table.get(key);
			System.out.print(value+"22"+key);
		}
		System.out.println();
		Collections.sort(listo);
		for(Object s :listo) {
			
			Object key =s;
			Object value = table.get(key);
			System.out.println(value+"33"+key);
		}
		
		//뭐야이거 그냥 다 쓸 수 있잖아?
		//바꿀줄만알면 HashMap//Hashtable얘네도
		//Collection에넣거나 ArrayList에넣어서
		//정렬같은기능도 그냥 쓸 수 있음
	}
	
	
	
	
	public static void main(String[] args) {

		new Practice();
	}

}
