package Today_22_03_11;

import java.util.*;

public class second {

	public static void main(String[] args) {
		
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		int[] result = new int[2];
		
		int good =0;
		int bad =0;
		
		for(int i=0;i<lottos.length;i++) {
			
			if(lottos[i]==0) good++;
			
			for(int j=0;j<win_nums.length;j++) {
				
				if(lottos[i]==win_nums[j]) {
					good++;
					bad++;
				}
			}
			
			
		}
		good = check(good);
		bad = check(bad);
		System.out.println(good +"," + bad);
		
		
	}
	public static int check(int com) {
		
		if(com==6) {
			com=1;
		}else if(com==5) {
			com=2;
		}else if(com==4) {
			com=3;
		}else if(com==3) {
			com=4;
		}else if(com==2) {
			com=5;
		}else {
			com=6;
		}
		
		return com;
		
	}
}
