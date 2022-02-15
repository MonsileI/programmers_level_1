package second_22_02_15;

public class squareRootInteger {
	
	public static void main(String[] args) {
		
		int n = 121;
		long answer = 0;
		long sqrt = (long) Math.sqrt(n);
		if(n==Math.pow(sqrt, 2)) {
			
			answer = (long)Math.pow(sqrt+1, 2);
			
			
		}else {
			
			answer = -1;
		}
		
		
		
	}

}
