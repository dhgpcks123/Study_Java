//★★★
package day10;
/*
문제 2 ]
	
	1차 배열에 4 과목의 점수를 입력한 후
	총점과 평균을 구하는 프로그램을 작성하세요.
	
	단, 입력, 총점계산, 평균계산, 출력은 
	함수를 작성해서 처리하세요.
	
*/
public class Ex02{
	int[] jum;
	int sum;
	int ave;
	public Ex02() {
		dataSet();
	}
	
	//입력받는 함수 작성
	public void dataSet() {
		jum = new int[4];
		for(int i = 0 ; i<jum.length ; i++) {
			jum[i] = (int)(Math.random()*(100-1+1)+1);
		}
		sumSet();
		aveSet();
		toPrint();
	}
	
	//총점 계산하기
	public void sumSet() {
		for(int i = 0 ; i <jum.length ; i++) {
			sum =+ jum[i];
		}
	}
	
	//평균계산 ?
	public void aveSet() {
		ave = sum/jum.length;
	}
	
	//출력하기
	public void toPrint() {
		for(int i = 0 ; i<jum.length; i++) {
		System.out.println(jum[i]);
		}
		System.out.println("합게"+sum+"평균"+ave);
	}
	
	
	
	public static void main(String[] args) {
		new Ex02();
	}
}
