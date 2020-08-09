//★★
//Object최상위 클래스에 여러 타입 데이터 담고 instanceof로 걸러내기.
package day14;

public class Test03 {

	public Test03() {
		Object[] obj = new Object[5];
		obj[0]="문자열";
		obj[1]=10;
		obj[2]='A';
		obj[3]=3.14;
		obj[4]=false;
		
		String str="";
		for(int i = 0; i<obj.length ; i++) {
			if(obj[i] instanceof String) {
				str= "문자열";
			}else if(obj[i] instanceof Integer) {
				str="정수";
			}else if(obj[i] instanceof Character) {
				str="캐릭퉈";
			}else if(obj[i] instanceof Double) {
				str="실수타입";
			}else if(obj[i] instanceof Boolean) {
				str="불리안타입";
			}
			System.out.println(obj[i]+"는 " +str);
		}
	
	}
	
	
	public static void main(String[] args) {
		new Test03();
	}

}
