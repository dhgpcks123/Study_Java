//★★ 실패해따..... 이건 여러번 반복하자 ㅠㅠㅠ
package day10;
/*
문제 3 ]
	
	5명의 학생의 
	java, oracle, html, jsp
	점수를 입력받자...
	총점과 석차를 구하는 프로그램을 작성하세요.
	
	단, 입력, 총점계산, 석차계산, 출력은 
	함수를 작성해서 처리하세요.
	
*/

/*
10/50/80/90
*/
import javax.swing.*;
import java.util.StringTokenizer;
public class Ex03 {
	int[][] no;
	public Ex03() {
		
	}
	
	//입력받자
	public void setData() {
	String sno1 = JOptionPane.showInputDialog("xx/xx/xx/xx식으로 값을 입력하라.");
	String sno2 = JOptionPane.showInputDialog("xx/xx/xx/xx식으로 값을 입력하라.");
	String sno3 = JOptionPane.showInputDialog("xx/xx/xx/xx식으로 값을 입력하라.");
	String sno4 = JOptionPane.showInputDialog("xx/xx/xx/xx식으로 값을 입력하라.");
	String sno5 = JOptionPane.showInputDialog("xx/xx/xx/xx식으로 값을 입력하라.");
	no = new int[5][4];
	 
			StringTokenizer to1 = new StringTokenizer(sno1, "/");

			while(to1.hasMoreTokens()) {
				for(int i = 0; i <no.length; i++) {
				no[0][i]= Integer.parseInt(to1.nextToken());
				}
		}	

	}
	//총점 계산하기.
	public void sumData() {
		
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}

