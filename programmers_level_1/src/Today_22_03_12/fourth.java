package Today_22_03_12;

public class fourth {

	public static void main(String[] args) {
		
		int n = 12;
		int result = 0;
		
		for(int i=2;i<n;i++) {
			
			if(n%i==1) {
				result = i;
				break;
			}
			
		}
		System.out.println(result);
	}
}

