package second_22_02_15;

public class keyPad {
	
	public static void main(String[] args) {
		
		int[]numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		String answer ="";
		
		StringBuilder sb = new StringBuilder();
		
		int rightTemp = 0;
		int leftTemp = 0;
		
		for(int i=0;i<numbers.length;i++) {
			
			if(numbers[i]%3==0) {
				sb.append("R");
				rightTemp = numbers[i];
			}else if(numbers[i]%3==1) {
				sb.append("L");
				leftTemp = numbers[i];
			}else{
				
				int right = Math.abs(rightTemp-numbers[i]);
				int left = Math.abs(leftTemp-numbers[i]);
				
				if(right<left){
					
					sb.append("R");
					rightTemp = numbers[i];
				}else if(left<right){
					sb.append("L");
					leftTemp = numbers[i];
				}else {
					
					if(hand.equals("right")) {
						sb.append("R");
						rightTemp = numbers[i];
					}else {
						sb.append("L");
						leftTemp = numbers[i];
					}
					
				}
				
				
				
				
			}
			
			
			
		}
		
		answer = sb.toString();
		
		System.out.println(answer);
		
	}

}
