package second_22_02_15;

public class GCDandLMC {

	public static void main(String[] args) {
		
	int num = 333434331;
	
	int count = 0;
	long n = num;
	while(n != 1) {
		
		if(n%2==0) {
			n /= 2;
			
		}else {
			n *= 3;
			n++;
			
			
		};
		
		count++;
		
		if(count >=500) {
			count = -1;
			n = 1;
		}

		
	}
	
	
		System.out.println(count);
		
	}
}
