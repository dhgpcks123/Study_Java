//★★★
package day10;
/*
	전역변수 컨트롤하기
	
	정수 배열 변수를 만들고
	그 변수의 내용을 수정해보자.
 */

public class Test05 {
	//정수 배열변수 전역변수를 만들었어.
	int[] num;
	public Test05() {
	
		initNum(10);
	}
	
	//정수 배열변수 초기화해주는 함수 크기도 조절해주는 거 아니야?
	public void initNum(int a) {
		num = new int[a];
		setData();
		toPrint();
	}
	//정수 배열변수안에 1~5까지 채우는 함수
	public void setData() {
		for(int i = 0 ; i<num.length;i++) {
			num[i] = i+1;
		}
	}
	
	public void toPrint() {
		for(int i = 0 ; i<num.length;i++) {
			System.out.println(num[i]);
		}
	}
	
	
	public static void main(String[] args) {
		new Test05();
	}
}
