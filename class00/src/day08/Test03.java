//★★★
package day08;

public class Test03 {
	public static void main(String[] args) {
		
	
	int[] no1 = new int[] {1,2,3,4,5,6,7,8,9,10};
	
	int[] no2 = new int[10];
	
	System.arraycopy(no1, 0, no2, 0, no1.length);
	no1[9] = 50;
	System.out.println();
	System.out.println("no1[9] : " + no1[9]);
	System.out.println("no3[9] : " + no2[9]);
	}
}
