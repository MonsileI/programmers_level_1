package Today_22_03_11;

public class fifth {
	
	public static void main(String[] args) {
		
		int[]numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		String result = "";
		int rp = 10;
		int lp = 12;
		for(int i=0;i<numbers.length;i++) {
			
			
			if(numbers[i]==0) numbers[i]=11;
			
			if(numbers[i]%3==0) {
				
				result = result+"R";
				rp = numbers[i];
			}else if(numbers[i]%3==1) {
				
				result = result+"L";
				lp = numbers[i];
				
			}else{
				
				int checkR = Math.abs(numbers[i]-rp)/3+Math.abs(numbers[i]-rp)%3;
				int checkL = Math.abs(numbers[i]-lp)/3+Math.abs(numbers[i]-lp)%3;
				
				if(checkR>checkL) {
					result = result + "L";
					lp = numbers[i];
				}else if(checkR<checkL) {
					result = result + "R";
					rp = numbers[i];
				}else {
					if(hand.equals("right")) {
						result = result + "R";
						rp = numbers[i];
					}else {
						result = result + "L";
						lp = numbers[i];
					}
				}
				
				
				
			}
			
			
			
		}
		
		System.out.println(result);
	}

}
