//★★★ this함수, private
package day10;

public class Test06 {
	public Test06(){
	
	}
	private int num;
	private String str;
	private char ch;
	private String name;
	private String addr;
	private String tel;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNum(int num) {
		num = num; //이건 그냥 자기자신한테 반환해줌 num출력해도 값 안나와
		
	}
	
	public static void main(String[] args) {
		new Test06();
	}
}
