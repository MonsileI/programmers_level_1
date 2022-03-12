package Today_22_03_12;

public class second {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 24;
		
		String answer = cal(a,b);
		System.out.println(answer);
	}
	
	public static String cal(int a, int b) {
		
		int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
		String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		int total = 0;
		
		for(int i=0;i<a-1;i++) {
			
			total += month[i];
		}
		
		total += b;
		
		total--;
		
		String answer = day[total%7];
		
		return answer;
		
		
	}
}
