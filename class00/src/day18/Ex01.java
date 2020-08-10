//★
//예외처리줘서 문제풀기
package day18;

/*
	문제 1 ]
		String[] str = {"123", "456", "789", ....};
		이런 배열이 있는 경우
		이것의 합과 평균을 구하는 프로그램을 작성하세요.
		
		단, 발생할 수 있는 예외를 가정하여 모두 처리하세요.
		1. 배열의 인덱스를 벗어나는 경우
		2. 숫자로 변환이 불가능한 경우
		3. 평균을 계산하는데 0으로 나누는 경우...
 */
import javax.swing.*;
public class Ex01 {
	
	String[] str = {"123","456","789", "a", "89/2", "111"};
	
	int sum= 0;
	int cnt = 0;
	double ave= 0;

	public Ex01() {

		for(int i = 0 ; i<str.length+1; i++) {
			try {
				sum += Integer.parseInt(str[i]);
				++cnt;
			}catch(NumberFormatException e) {
				//숫자로 변환이 안되는 경우이므로 다음 데이터를 꺼낸다.
				e.printStackTrace();
				continue;
			}catch(IndexOutOfBoundsException e) {
				//배열의 범위를 벗어난 경우이므로 반복문을 중지시킨다.
				e.printStackTrace(); 
				break;
			}
		try {
			ave = sum / (double) cnt;
		}catch(ArithmeticException e) {
		}
		}
		JOptionPane.showMessageDialog(null, "배열의 합계: "+sum+
				"\n배열의 평균: "+ ave);
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
