package codingDojang.dojang;

import java.util.stream.IntStream;

/*
	1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
	8이 포함되어 있는 숫자의 갯수를
	카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
	(※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 함)
*/
public class NumberCounting {

	public NumberCounting() {
		int cnt = 0;
		for(int i = 1 ; i <= 10000 ; i++) {
			String str = Integer.toString(i);
			int len = str.length();
			switch(len) {
			case 1 :
				if (str.charAt(0)=='8') cnt++;
				break;
			case 2 :
				if (str.charAt(0)=='8') cnt++;
				if (str.charAt(1)=='8') cnt++;
				break;
			case 3 :
				if (str.charAt(0)=='8') cnt++;
				if (str.charAt(1)=='8') cnt++;
				if (str.charAt(2)=='8') cnt++;
				break;
			case 4 :
				if (str.charAt(0)=='8') cnt++;
				if (str.charAt(1)=='8') cnt++;
				if (str.charAt(2)=='8') cnt++;
				if (str.charAt(3)=='8') cnt++;
				break;
			}

		}
		System.out.println(cnt);
		
	}

	
	public static void main(String[] args) {
		new NumberCounting();
	}

}
