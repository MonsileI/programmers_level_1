package second_22_02_15;

public class intervalX {
	
	public static void main(String[] args) {
		
		int x = -4;
		int n = 2;
		
		long[]answer = new long[n];
		
		for(int i =1;i<=n;i++) {
			
			answer[i-1] = (long)x*i;
			
			
		}
		
		
		System.out.println(answer);
		
		
	}

}
