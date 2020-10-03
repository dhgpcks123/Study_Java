package codingDojang.newDay;

/*
	10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
	1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
*/

import java.util.*;
import java.util.stream.*;
public class IntStream_Ex {

	public IntStream_Ex() {
		int hap = 0;
		
		for(int i = 1 ; i<1000 ; i ++) {
			if(i%3 == 0 || i%5 == 0) {
				hap += i;
			}
		}
	}
	
	//int데이터 타입을 위한 Stream빨대
    private static int setData(int end) {
        return IntStream.range(1, end).filter(j -> j%3==0 || j%5==0).sum();
    }

	public static void main(String[] args) {
		new IntStream_Ex();
	}

}
