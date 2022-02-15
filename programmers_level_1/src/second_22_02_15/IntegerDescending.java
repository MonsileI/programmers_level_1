package second_22_02_15;

import java.util.Arrays;

public class IntegerDescending {

	public static void main(String[] args) {
		
		long n = 118372;
		
		String s = String.valueOf(n);
		
		char[] arr = s.toCharArray();
		
		Arrays.sort(arr);
		String temp = "";
		for(int i=0;i<arr.length;i++) {
			
			temp += arr[arr.length-i-1];
			
		}
		
		long answer = Long.parseLong(temp);
		
		System.out.println(answer);
	}
	
}
