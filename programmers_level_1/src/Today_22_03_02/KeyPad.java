package Today_22_03_02;

public class KeyPad {
	
	public static void main(String[] args) {
		int[]numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		String[]answer = new String[numbers.length];
		
		int leftP = 10;
		int rightP = 12;
		
		for(int i=0;i<numbers.length;i++) {
			
			int num = numbers[i];
			
			if(num==0) {
				num = 11;
			}
			
			if(num%3==1) {
				answer[i] = "L";
				leftP = num;
			}else if(num%3==0) {
				answer[i] = "R";
				rightP = num;
			}else {
				
				int r = (int)Math.abs(rightP-num) / 3 + (int)Math.abs(rightP-num) %3;
				int l = (int)Math.abs(leftP-num) / 3 + (int)Math.abs(leftP-num) %3;
				
				if(r>l) {
					
					answer[i] = "L";
					leftP = num;
				}else if(r<l) {
					answer[i] = "R";
					rightP = num;
				}else {
					
					if(hand.equals("right")) {
						answer[i] = "R";
						rightP = num;
					}else {
						answer[i] = "L";
						leftP = num;
					}
					
				}
				
				
	
				
				
			}
			
			
			
			
			
		}
		
		for(String s : answer) System.out.println(s);
		
	}

}
