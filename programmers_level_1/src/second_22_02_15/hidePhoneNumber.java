package second_22_02_15;

public class hidePhoneNumber {

	public static void main(String[] args) {
		
		String phone_number="01033334444";
		String answer="";
		
		for(int i=0;i<=phone_number.length()-5;i++) {
			
			answer += "*";
			
		}
		for(int i=phone_number.length()-4;i<=phone_number.length()-1;i++) {
			

			answer += phone_number.charAt(i);
			
		}
	
		System.out.println(answer);
	}
}
