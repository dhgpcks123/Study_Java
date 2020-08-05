//★★
package day07;

public class Test08 {
	public static void main(String[] args) {
		int[] no = {4, 5, 6};
		//int[][] num = {{1,2,3}, {4,5,6}};
		int[][] num = {{1,2,3}, no};
		
		int[][][] room = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
// 위는 이것과 같은 방 수를 가진다. int[][][] room1 = new int[2][2][3];
		System.out.println(num[1][0]);
		System.out.println(room.length); //방 2개
		System.out.println(room[0].length); // 방 2개
		System.out.println(room[0][0].length); //방 3개
		
		

		no[0] = 9;
		
		System.out.println(no[0]);
	}
}
