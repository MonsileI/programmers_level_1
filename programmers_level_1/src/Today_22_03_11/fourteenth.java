package Today_22_03_11;

import java.util.ArrayList;
import java.util.Arrays;

public class fourteenth {

	public static void main(String[] args) {
		
		int[]answers = {1,2,3,4,5};
		
		int[] pos1 = {1,2,3,4,5};
		int[] pos2 = {2,1,2,3,2,4,2,5};
		int[] pos3 = {3,3,1,1,2,2,4,4,5,5};
		
		int fir = 0;
		int sec = 0;
		int thi = 0;
		
		for(int i=0;i<answers.length;i++) {
			
			if(pos1[i%5]==answers[i]) fir++;
			if(pos2[i%8]==answers[i]) sec++;
			if(pos3[i%10]==answers[i]) thi++;
			
		}
		
		int[]result = {fir,sec,thi};
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		int max = Math.max(Math.max(fir, sec), thi);
		
		for(int i=0;i<result.length;i++) {
			
			if(result[i]==max) {
				arr.add(i+1);
			}
			  
			
		}
		
		System.out.println(arr); 
		
		
		
	}
}
