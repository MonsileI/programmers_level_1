package first_From_02_08_to_02_14;

public class theMiddleString {

	public static void main(String[] args) {
		
	String s = "abba";
	
	
	if(s.length()%2==0) {
		
		System.out.println(s.substring(s.length()/2-1, s.length()/2+1));
		
	}else {
		
		System.out.println(s.substring(s.length()/2, s.length()/2+1));
	}
	
	}
}
