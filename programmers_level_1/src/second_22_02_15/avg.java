package second_22_02_15;

public class avg {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4};
		double answer = 0;
		
		double sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			sum += arr[i];
		}
		
		answer = sum/arr.length;
		System.out.println(answer);
		
	}
}
