package Today_22_03_02;

import java.util.Arrays;

public class test {
	
	public static void main(String[] args) {
		
		int[]answer = {1,2,3,4,5};
		
		int[]fir = {1,2,3,4,5}; //5
		int[]sec = {2,1,2,3,2,4,2,5}; //8
		int[]thi = {3,3,1,1,2,2,4,4,5,5}; //10
		
		int firSco = 0;
		int secSco = 0;
		int thiSco = 0;
		
		
		for(int i=0;i<answer.length;i++) {
			
			int temp = answer[i];
			
			if(fir[i%5]==temp) firSco++;
			
			if(sec[i%8]==temp) secSco++;
			
			if(thi[i%10]==temp) thiSco++;
			
			
		}
	
		
	}

}
