//★★
package day08;
/*
문제 3 ]
	
	계산식을 입력하면
	계산의 결과를 출력해주는 프로그램을 작성하세요.
	단, 배열을 이용해서 처리하세요.
	
	예 ]
		
		계산식을 입력하세요! : 22-11
		22-11 의 결과는 11 입니다.
		
	힌트 ]
		
		"421-111"
		로 입력하는 경우는
		{"421", "-", "111"}
	
	보너스 ]
		계산기 만들어주세요.
*/
import javax.swing.*;
public class Ex03 {
	public static void main(String[] args) {
	
	//계산식 입력하라는 메시지를 띄우고 str에 저장
	while(true) {
		String str = JOptionPane.showInputDialog("계산식을 입력하세요.");
	if(str.equals("q")){
		JOptionPane.showMessageDialog(null, "종료하겠다 삐리리");;

		break;
	}
	
	//\스트링 배열을 선언하고 초기화해줌
	String[] sArr = new String[3];
	/*
	 * str = "333-11";
	 * sArr[0] = "333";
	 * sArr[1] = "-";
	 * sArr[2] = "11";
	 * 
	 */
	
	int idx = 0;
	for(int i = 0 ; i <str.length(); i++) {
		if(str.charAt(i)<'0' || str.charAt(i)>'9') {
			idx = i;
		}
	}
	//charAt을 써서 i번째 껄 뽑아와 그 값이 0~9사이 아니면 idx가 바로 그 기호겠지?!
	
	//substring을 활용해서 0,1,2번째 방에다가 값을 입력해줄 수 있겠지.
	sArr[0] = str.substring(0, idx);
	sArr[1] = str.substring(idx,idx+1);
	sArr[2] = str.substring(idx+1);
	
	//숫자형태의 문자열을 정수로 변환시킨다.
	int stoNum1 = Integer.parseInt(sArr[0]);
	int stoNum2 = Integer.parseInt(sArr[2]);
	
	
	int result=0;
	switch(sArr[1]) {
	case("+"): 
		result = stoNum1+stoNum2;
		break;
	case("-"):
		result = stoNum1-stoNum2;
	break;
	case("*"):
		result = stoNum1*stoNum2;
	break;
	case("/"):
		result = stoNum1/stoNum2;
	break;
	case("%"):
		result = stoNum1%stoNum2;
	break;
	default:
		JOptionPane.showMessageDialog(null, "부호 잘못 썼다");;
	}
	
	JOptionPane.showMessageDialog(null, "입력한 계산식" +str+"의 연산은" +result+"이다.");

	}
	}
}
