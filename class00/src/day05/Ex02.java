//(반복필요)★★
package day05;

/*
 	예제 2]
 		5자리 숫자를 입력받아서
 		그 숫자가 회문수인지 아닌지 판별하세요.
 		
 		단 for 반복문을 사용해서 처리하세요.
 */
import javax.swing.*;
public class Ex02 {
	public static void main(String[] args) {
		// 문자열로 입력받고
		String sno = JOptionPane.showInputDialog("다섯자리 숫자를 입력하세요 : ");
		
		// 1. 문자열로 비교하는 방법
		// 참고 ] 문자열의 길이를 반환해주는 함수 : .length()
		
		String tmp = "";
		int len =sno.length();
		// 역순으로 된 문자열 반복해서 만든다.
		for(int i =0 ; i<len ; i++)	{
			tmp += sno.charAt((len-1) -i);
		}
		//자바에서 문자갯수 셀 때는 !!!!! 0부터 갯수를 센다.
		//그래서 (len-1)가 4번째 수 = 내가 생각하는 5번째 수다
		
		
		// 만들어진 문자열을 비교한다.
		boolean bool = sno.equals(tmp);
		
		String result;
		if(bool == true) { // 그냥 =로 하면 다 true로 나오네. 근데 문제는 = <이런 거 안 써;;
				result="입니다.";
		}else {
			result="아닙니다.";
		}
		
		JOptionPane.showMessageDialog(null, "입력한 숫자 " + sno +"는 회문수"+result);
	}
}
