//★★
package day05;

/*
	문제 5 ]
		주사위 2개를 던질 경우
		두 눈의 합이 6이 되는 경우를 출력하세요.
 */
public class Ex05 {

	public static void main(String[] args) {
		// 첫 번째 주사위 눈의 경우 반복문
		repeat:
		for(int i =0 ; i<6 ; i++) {
			// 두 번째 주사위의 경우의 수
			for(int j = 0 ; j<6 ; j++) {
				//주사위의 합이 6이 되는 경우
				if(((i+1)+(j+1))== 6) {
					System.out.println("첫 번째 주사위 눈 :" + (i+1) + "두 번째 주사위 눈"+ (j+1));
					continue repeat;
					//System.out.println("*************");
				}
			}

		}

	}

}
