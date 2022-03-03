package Today_03_03;

public class sum {

	public static void main(String[] args) {
		int n = 12;
		int answer = 0;
		
		for(int i=1;i<=12;i++) {
			
			if(n%i==0) answer += i;
			
		}
		
		System.out.println(answer);
	}
}
