package Today_22_03_12;

public class sixth {

	public static void main(String[] args) {
		
		String s = "abcr";
		String answer = "";
		
		char a = s.charAt(s.length()/2);
		
		if(s.length()%2==1){
			answer = s.substring(s.length()/2, s.length()/2+1);
		}else {
			answer = s.substring(s.length()/2-1, s.length()/2+1);
		}
		
		System.out.println(answer);
		
		
	}
}
