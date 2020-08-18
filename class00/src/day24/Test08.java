package day24;

/*
	내용을 파일에 저장하는 프로그램을 만드세요.
	단, Buffered 스트림을 사용해서 처리하세요.
 */
import java.io.*;
import javax.swing.*;
public class Test08 {

	public Test08() {
		//보조(필터)스트림 쓰려면 타겟 스트림(기본 스트림) 반드시 있어야함.
		FileOutputStream fout = null;
		//필요에 다라서 보조(핕터)스트림을 연결할 수 있다. 이 때 스트림의 방향도 맞춰야한다.
		BufferedOutputStream bout = null;
		try {
			fout = new FileOutputStream("src/day24/wtest/BufferedTest.txt");
			bout = new BufferedOutputStream(fout);
			
			//내용을 적당히 만들자.
			String str = "You got me feeling like a\r\n"
				+
					"psycho psycho\r\n" + 
					"우릴 보고 말해 자꾸 자꾸\r\n" + 
					"다시 안 볼 듯 싸우다가도\r\n" + 
					"붙어 다니니 말야\r\n" + 
					"이해가 안 간대\r\n" + 
					"웃기지도 않대";
				 
			byte[] buff = str.getBytes();
			
			bout.write(buff);
			//bout에 데이터심어주면 자연스럽게 fout로 넘어감.
			/*
			 	문제는 아직 버퍼가 다 채워지지 않았으므로
			 	버퍼의 내용이 FileOutputStream으로 가지 않는다.
			 	따라서 아직 저장이 되지 않았다.
			 	
			 	따라서 반드시 습관적으로 작업이 완료되는 시점에서
			 	*버퍼를 비워주는 습관을 가진다.*
			 	
			 	지금은 그냥 되네 ? ㅎㅎ? ㅎㅎㅎㅎㅎ
			 */
			bout.flush();
			
			JOptionPane.showMessageDialog(null, "파일 저장 완료!");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				bout.close(); //누가 먼저 닫히냐 중요하다고 하는구만 !
				fout.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		new Test08();
	}

}
