package first_From_02_08_to_02_14;

import java.util.Arrays;

public class numberRemainder {

	public static void main(String[] args) {
		
	int n = 13;
	
	int num = 0;
	for(int i=1; i<=n;i++) {
		
		if(n%i==1) {
			
			num = i;
			break;
		
		}
		
	}
		System.out.println(num);
		
	}
}
