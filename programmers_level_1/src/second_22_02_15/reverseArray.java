package second_22_02_15;

public class reverseArray {

	public static void main(String[] args) {
		
		int n = 12345;
		String s = String.valueOf(n);
		int answer[] = new int[s.length()];
		
		
	for(int i=0;i<answer.length;i++) {
		
		answer[s.length()-i-1] = Integer.parseInt(String.valueOf(s.charAt(i)));
		
	}
	
	
		
		
		
	}
}
