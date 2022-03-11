package Today_22_03_11;

import java.util.ArrayList;

public class tenth {

	public static void main(String[] args) {
		
		int[]nums = {1,2,7,6,4};
		int result =0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(i + 2 >=nums.length) {
				break;
			}
			for(int j=i+1;j<nums.length;j++) {
				for(int h=j+1;h<nums.length;h++) {
					arr.add(nums[i]+nums[j]+nums[h]);
					
				}
			}
			
		}
		
		for(Integer i : arr) {
			
			int count = 0;
			for(int j=2;j<=i;j++) {
				
				if(i%j==0) {
					count++;
				}
			}
			
			if(count==1) result++;
		}
	
		
		System.out.println(result);
	}
}
