package Today_22_03_28;

public class lotto {

	public static void main(String[] args) {
		
		int [] lottos = {44, 1, 0, 0, 31, 25};
		int [] win_nums = {31, 10, 45, 1, 6, 19};
		
		int winCount = 0;
		int loseCount = 0;
		int nowNum = 0;
		for(int i=0;i<lottos.length;i++) {
			nowNum = lottos[i];
			for(int j=0;j<win_nums.length;j++) {
				if(win_nums[j]==nowNum) {
					loseCount++;
					break;
				}
				else if(nowNum==0) {
					winCount++;
					break;
				}
				
			}
			
		}
		winCount += loseCount;
		
		winCount = check(winCount);
		loseCount = check(loseCount);
		
		int[] answer = new int[2];
		
		answer[0] = winCount;
		answer[1] = loseCount;
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		
		
		
	}
	public static int check(int checkNum) {
		
		if(checkNum>=6) {
			checkNum=1;
		}else if(checkNum>=5) {
			checkNum=2;
		}else if(checkNum>=4) {
			checkNum=3;
			
		}else if(checkNum>=3) {
			checkNum=4;
		}else if(checkNum>=2) {
			checkNum=5;
		}else {
			checkNum=6;
		}
		
		return checkNum;
		
	}
}
