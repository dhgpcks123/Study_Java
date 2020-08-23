//★★★
package day04;

public class Test05 {
	public static void main(String[] args) {
		
	int no = (int)(Math.random()*(99-10+1)+10);
	
	String str = "";
	
	if(no>50) {
		str = "50보다 큰 수";
	}else if(no<50){
		str = "50보다 작은 수";		
	}else {
		str = "50과 같은 수";
	}
	System.out.println("랜덤 발생 숫자 "+no+"는 "+str);
	}
}
