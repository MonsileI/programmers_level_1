package second_22_02_15;

public class plusPlaceNumber {
	
	public static void main(String[] args) {
		
		int n = 123;
		
		int answer = 0;
		
		String s = String.valueOf(n);
		
		for(int i=0;i<s.length();i++) {
			
			answer += Integer.parseInt(s.substring(i, i+1));
			
			
		}
		
		System.out.println(answer);
		
	}

}
