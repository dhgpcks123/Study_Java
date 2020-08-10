//★★
//예외처리줘서 문제풀기
package day18;

import javax.swing.JOptionPane;

/*
	문제 1 ]
		String[] str = {"123","456","789", "a", "89/2", "111"};
		이런 배열이 있는 경우
		이것의 합과 평균을 구하는 프로그램을 작성하세요.
		
		단, 발생할 수 있는 예외를 가정하여 모두 처리하세요.
		1. 배열의 인덱스를 벗어나는 경우	-IndexOutOfBoundsException
		2. 숫자로 변환이 불가능한 경우	-	NumberFormatException
		3. 평균을 계산하는데 0으로 나누는 경우... - ArithmeticException
 */
public class Ex01 {
	String[] str = {"123","456","789", "a", "89/2", "111"};
	public Ex01() {
		int sum = 0;
		double avg = 0;
		int len= 0;
		
		for(int i = 0 ; i<str.length;i++) {
			try {
				sum += Integer.parseInt(str[i]);
				len++;
			}catch(NumberFormatException e){
				e.printStackTrace();
				continue;
			}catch(IndexOutOfBoundsException e) {
				e.printStackTrace();
				break;
			}
			
			
		}
		try {
			avg = (double)(sum /len);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, sum+", "+avg);
		
		
	}
	public static void main(String[] args) {
		new Ex01();
	}		
}