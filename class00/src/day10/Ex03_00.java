package day10;

import java.util.Arrays;

public class Ex03_00 {

	public Ex03_00() {
		  // 조건) 석차를 저장하는 배열  : { 3,5,4,...,1}
		  int[] r = {90,80,85,70,75,60,65,50,55,95,100};
		  int[] s = new int[r.length];
		  
		  for (int i=0 ; i<r.length; i++){
			  int rank = 1;
			  		for (int j=0 ; j < r.length; j++){
			  			if(r[i] < r[j] )
			  				rank += 1;
			  		}
			  s[i] = rank;
		  }
		  System.out.println(Arrays.toString(s));
	}

	public static void main(String[] args) {
		new Ex03_00();
	}

}
