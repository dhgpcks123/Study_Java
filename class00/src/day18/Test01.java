//★★
//내가 정의하는 Exception!
package day18;
/*
1~10사이의 정수를 입력받는 창을 만들고
1~10사이가 아닐 때
10보다 크면 사용자정의예외를 만들고
1보다 작으면 넘버포맷익셉션예외를 발생시키소.
 
*/


import javax.swing.*;
public class Test01 {
	public Test01() {
		boolean bool = true;
		while(true) {
		String sno = JOptionPane.showInputDialog("1~10까지의 정수를 입력하세요");
		if(sno.equals("q"))
			break;
		int no= 0;
		
		try {
			//숫자형태가 아닌 문자열이 입력될 경우 포맷 예외가 발생하 것이므로
			//예외처리를 해준다.
			no = Integer.parseInt(sno);
			if(no>10) {
				//이 부분에서 강제로 우리가 정한 예외클래스의 예외를 발생시켜야 한다.
				//따라서 우리가 만든 예외 클래스를 강제로 던진다(throw) 한다.
				//new Exc1()은 그냥 객체만드는거임. 이게 예외다라는 걸 JVM에게 알려주는
				//그 기능이 바로 throw임.
				throw new Exc1();
			}else if(no<1) {
				throw new NumberFormatException();
			}
		}catch(Exc1 e) {
			System.out.print(e);
			e.printStackTrace();
			continue;
		}catch(NumberFormatException e) {
			System.out.print("숫자가 1보다 작다.");
			e.printStackTrace();
			continue;
		}catch(Exception e) {
			
			e.printStackTrace();
			continue;
		}
	
		
		JOptionPane.showMessageDialog(null, "입력한 숫자는"+no+"다");
		}		
	}

	public static void main(String[] args) {
		new Test01();
	}
}
//1~10 사이 이외의 숫자가 입력되면 발생될 예외
//즉, 우리가 제작하는 클래스에서만 통용될 예외를 만든다.
//1. Exception 클래스를 상속 받은 클래스를 만든다.
class Exc1 extends Exception {
	//2. 예외 정보를 출력한 toString()함수를 오버라이드 한다.
	
	public String toString() {
		return "숫자가 10보다 큽니다.";
	}
	
}