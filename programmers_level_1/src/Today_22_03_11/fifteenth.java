package Today_22_03_11;

import java.util.*;

public class fifteenth {

	public static void main(String[] args) {
		
		int n = 5;
		int[]lost = {2,4};
		int[]reserve = {1,3,5};
		int answer = 0;
		
		HashSet<Integer> hash = new HashSet<>();
		
		answer = n - lost.length;
		
		for(int i : reserve) hash.add(i);
		
		for(int i=0;i<lost.length;i++) {
			
			if(hash.contains(lost[i])) {
				
				answer++;
				hash.remove(lost[i]);
				lost[i] = -1;
				
			}
			
			
		}
		
		for(int i=0;i<lost.length;i++) {
			
			if(hash.contains(lost[i]-1)) {
				answer++;
				hash.remove(lost[i]-1);
			}else if(hash.contains(lost[i]+1)) {
				answer++;
				hash.remove(lost[i]+1);
				
			
			}
			
		}
		
		System.out.println(answer);
		
	}
}
