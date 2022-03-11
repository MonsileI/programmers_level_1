package Today_22_03_11;

import java.util.Arrays;


public class seventeenth {
	
	public static void main(String[] args) {
		
		int left = 13;
		int right = 17;
		int result = 0;
		
		for(int i=left; i<=right;i++) {
			
			int a = 0;
			
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) a++;
				
				
			}
			
			if(a%2==0) result += i;
			else result -= i;
			
		}
		
		
		
		System.out.println(result);
				
		
	}

}
