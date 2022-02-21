package Third_22_02_20;

public class seizerPassword {

	public static void main(String[] args) {
		
		String s ="AB";
		int n = 1;
		String answer = "";
		
		for(int i=0;i<s.length();i++) {
			
			char alpa = s.charAt(i);
			
			if(alpa >= 'a' && alpa <= 'z') {
				
				if(alpa + n > 'z') answer += (char)(alpa + n-26);
				else answer += (char)(alpa + n);
				
			}else if(alpa >= 'A' && alpa <='Z') {
				if(alpa + n > 'Z') answer += (char)(alpa + n-26);
				else answer += (char)(alpa + n);
			}
			else answer += (char)alpa;
			
		}
		
		System.out.println(answer);
	}
}
