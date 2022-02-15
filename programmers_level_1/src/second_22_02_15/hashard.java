package second_22_02_15;

public class hashard {

	public static void main(String[] args) {
		
		 boolean answer = true;
		 
		 int arr = 11;
		 
		 String s = String.valueOf(arr);
		 
		 int a = 0;
		 
		 for(int i =0;i<s.length();i++) {
			 
			 a += Integer.parseInt(String.valueOf(s.charAt(i)));
			 
		 }
		 
		 if(arr%a!=0) {
			 answer = false;
		 }
		 
		 System.out.println(answer);
		
	}
}
