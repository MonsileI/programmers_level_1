package first_From_02_08_to_02_14;

public class StringController {
	
	public static void main(String[] args) {
		
		String s = "a234";
		boolean answer = true;
		
	
		if(s.length()!=4&&s.length()!=6) {
			answer = false;
		}
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) < '0' || s.charAt(i) > '9') {
				answer = false;
			}
		
		}
		
		System.out.println(answer);
	}

}
