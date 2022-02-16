package second_22_02_15;

public class StrangeString {
	
	public static void main(String[] args) {
		
		String s = "try hello world";
		String answer = "";
		String[] split = s.split(" ");
	
		for(int i=0;i<split.length;i++) {
		
			for(int j=0;j<split[i].length();j++) {
				
				if(j%2==0) {
					answer += String.valueOf(split[i].charAt(j)).toUpperCase();
					
				}else {
					answer += String.valueOf(split[i].charAt(j)).toLowerCase();
				}
				
			}
			
			answer += " ";
		}
		
		answer = answer.substring(0, answer.length()-1);
		System.out.println(answer);
	}
	
	

}
