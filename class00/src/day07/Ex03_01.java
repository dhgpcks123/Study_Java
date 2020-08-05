//(오름차순 정렬 실패...)★
package day07;

/*
	다섯 학생의 국어, 영어, 수학, 코딩, 총점 을 관리할 배열을 만들고
	랜덤하게 과목 점수를 만들어서 입력하고
	총점을 계산하세요.
	출력하세요.
	
	1.
		각 과목의 배열을 만들고 점수를 입력해서 배열을 완성하고
		2차원 배열로 합쳐서 처리하는 방법
		
		
	2. Ex03_01
		2차원 전체 배열로 처리하는 방법 ex03_01
	
	보너스 ]
		점수가 높은 사람부터 정렬해서 출력하세요.

*/

public class Ex03_01 {
	public static void main(String[] args) {
		//2차원 배열로 처리하는 방법
		int[][] ban = new int[5][5];
		
		for(int i = 0 ; i<ban.length-1 ; i++) {
			for(int j = 0 ; j<ban[0].length; j++) {
				//어짜피 [5][5]가 선언되었을 때 [5][5]넣어도 상관없다. 어짜피 다 같은 수로 선언되네!
				int ran = (int)(Math.random()*(100-1+1)+1);
				ban[i][j] = ran;
				ban[4][j] += ban[i][j];
		
			
			}
			
			//(실패)순서 오름차순으로 변경
			for(int l = 0 ; l<ban.length ; l++) {
				for(int m = l+1 ; m<ban[l].length; m++) {
					if(ban[i][l]<ban[i][m]) {
						int tmp = ban[i][l];
						ban[i][l] = ban[i][m];
						ban[i][m] = tmp;
						//점수가 높은 사람부터 정렬해서 출력하세요.
						//총점비교해서 순서만 바꿨더니.. 합계만 바뀜;;
						
						//슈바 ㅠㅠ못 풀겠다...
						//그렇다고 lotto에서 한 것처럼 처음부터 끝까지 바꾸게 하니까
						// 사람에 맞춰서 점수가 바뀐게 아니라 그냥 점수 자체들이 바뀜;;
						// 강사는 이런 걸 원했어도, 실제로는 이런 프로그램으로 운용못하는데;;
					}
				}
			}
			
			
		}
		for(int k= 0 ; k<5 ; k++) {
			System.out.printf("%1d번째 학생 국 :%2d 영:%2d 수%2d 코%2d, 합계%3d \n", (k+1), ban[0][k], ban[1][k], ban[2][k], ban[3][k], ban[4][k] );
		}
		
		
		
		
		
		for(int k= 0 ; k<5 ; k++) {
			System.out.printf("%1d번째 학생 국 :%2d 영:%2d 수%2d 코%2d, 합계%3d \n", (k+1), ban[0][k], ban[1][k], ban[2][k], ban[3][k], ban[4][k] );
		}
		//향상된 for문
		System.out.print("총 합계 순서대로 나열" );
		for(int no : ban[4]) {
			System.out.print(+no+ "|");
		}
		
	}
}
