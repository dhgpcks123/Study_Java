//????
package day19;

/*
	과제 3 ]
		Arrays 클래스 함수를 5개 이상 조사한 후
		그 함수를 사용하는 예제 프로그램을 작성하세요.
 */
import java.util.Arrays;
public class Homework02 {

	public Homework02() {
		int[] Arr = new int[] {55, 25, 33};
		String[] sArr = new String[] {"고양이","개","사자"};
		System.out.println(Arr);
		//주소값을 가지고 온다. 객체니까.
		
		//1. toString 문자데이터출력
		System.out.println(Arrays.toString(Arr));
		//2. sort 오름차순정렬
		Arrays.sort(Arr);
		System.out.println(Arrays.toString(Arr));
		//3. stream (???)
		
		//4. spLiterator(???)
		
		//5. asList(???)
		//6. Arrays.equals 배열 비교하는 것인듯?
		String[] sArr2 = new String[] {"개", "고양이", "사자"};
		System.out.println(Arrays.equals(sArr,sArr2));

		
		//7. Arrays.deepEquals //그냥 deep과 아닌 거의 차이는?
		String[] sArr3 = new String[] {"국어", "수학", "영어"};
		String[] sArr4 = new String[] {};
		
		//8. Arrays.fill(boolean[] a, boolean val) (???)
		System.out.println("--------------------");
		//9. parallelSort 병렬... 오름차순정리??? ???
		Arrays.parallelSort(Arr);
		System.out.println(Arrays.toString(Arr));
		//10. Arrays.hashCode(); (???)
		
	}
	public static void main(String[] args) {
		new Homework02();
	}

}
