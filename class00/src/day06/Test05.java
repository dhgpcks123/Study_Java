//★★
package day06;
/*
예제 ]
	두 사람이 등산을 한다.
	한사람은 산 아래에서 위로 초당 0.54m 의 속도로 올라가고
	한사람은 상 정상에서 아래로 초당 1.07m의 속도록 내려간다.
	산의 높이가 7564m라고 가정하면
	두 사람이 만나는 시점은 몇분 몇초 후인지 계산하세요.
*/
public class Test05 {

	public static void main(String[] args) {
		
		double no1, no2;
		
		for(int i = 0;;i++) {
			//a의 1초후 위치
			no1 = i*(0.54);
			no2 = (7564-i*(1.07));
			if(no1>no2) {
				System.out.println("둘이 만나는 지점은"+(i/3600)+"시간"+ (i%3600/60)+"분 "+ i%60+"후다.");
				break;
			}
		}

	}

}
