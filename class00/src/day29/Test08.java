package day29;

import day29.thread.*;
public class Test08 {

	public Test08() {
		Trd08 t1 = new Trd08();
		//NewBorn상태
		t1.start();//runable상태
		
		for(int i = 0; i<10 ; i++) {
			System.out.println("반장님이 아이스크림을 사달라고 조릅니다 - " + (i+1));
			
			try {
				Thread.sleep(200);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		// 이 라인을 실행한다는 것은 프로세스 프로그램의 내용을 모두 실행한 경우이므로
		// 여기서 스레드를 종료시킨다.
		t1.isStart = false;
//		t1.start(); // dlal Death로 전위된 스레드는 다시 실행(Runnable)되지 않는다.
	}

	public static void main(String[] args) {
		new Test08();
		System.out.println("*** 프로그램 종료 ***");
	}

}
