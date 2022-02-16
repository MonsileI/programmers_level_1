package second_22_02_15;

public class lottos {

	public static void main(String[] args) {
		
		int[] lottos = {44,1,0,0,31,25};
		int[] win_nums = {31,10,45,1,6,19};
		int[]result = new int[2];
		

		int right = 0;
		for(int i=0;i<lottos.length;i++) {
			
			for(int j=0;j<win_nums.length;j++) {
				
				if(lottos[i]==win_nums[j]) {
					
					right++;
					break;
				}
				
			}
			
			
		}
		
		int bonus = 0;
		for(int i=0;i<lottos.length;i++) {
			
			if(lottos[i]==0) {
				bonus++;
			}
			
		}
		
		lotto lt = new lotto();
		
		result[0] = lt.lotto(right+bonus);
		result[1] = lt.lotto(right);
		
		System.out.println(result[0]);
		System.out.println(result[1]);
		

			
		
	}
}

class lotto{
	
	public static int lotto(int com) {
		
		
		if(com>=6) {
			com = 1;
		}else if(com>=5) {
			com = 2;
		}else if(com>=4) {
			com = 3;
		}else if(com>=3) {
			com = 4;
		}else if(com>=2) {
			com =5;
		}else {
			com =6;
		}
		
		return com;
		
	}
	
}
