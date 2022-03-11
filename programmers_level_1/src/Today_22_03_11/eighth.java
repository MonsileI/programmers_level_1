package Today_22_03_11;

public class eighth {
	
	public static void main(String[] args) {
		
		int[] absolutes = {4,7,12};
		boolean[]signs = {true,false,true};
		int result = 0;
		
		for(int i=0;i<absolutes.length;i++) {
			
			result += absolutes[i] * (signs[i]? 1 : -1);
			
		}
		
		System.out.println(result);
		
		
	}

}
