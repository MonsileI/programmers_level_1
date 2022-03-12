package Today_22_03_12;

import java.util.HashSet;
import java.util.Iterator;

public class first {

	public static void main(String[] args) {
		int[]numbers = {2,1,3,4,1};
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<numbers.length-1;i++) {
			
			for(int j=i+1;j<numbers.length;j++) {
				
				set.add(numbers[i]+numbers[j]);
				
			}
			
		}
		
		 int[]answer = new int[set.size()];
	        
		 Iterator iter = set.iterator();
		 
		 for(int i=0;i<set.size();i++) {
			 
			 answer[i] = (int) iter.next();
		 }
		
		 System.out.println(answer[0]);
		
	}
}
