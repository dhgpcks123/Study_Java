//★★
//Arrays클래스의 sort함수
package day19;
import java.util.Arrays;
import java.util.Random;
public class Test03 {

	public Test03() {
		//배열 만들고
		int[] num = new int[5];
		
		//배열에 데이터 채우고
		for(int i = 0 ; i <num.length ; i++) {
			Random ran = new Random();
			//1~100까지
			num[i] = ran.nextInt(100)+1;
		}
		//채운내용 출력해보고
		System.out.println(Arrays.toString(num));
		//채운내용 정렬하고
		Arrays.sort(num);
		//정렬 확인해보고
		System.out.println(Arrays.toString(num));
	}

	public static void main(String[] args) {
		new Test03();
	}

}
