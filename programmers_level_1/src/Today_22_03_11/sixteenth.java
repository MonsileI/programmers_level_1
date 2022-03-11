package Today_22_03_11;

import java.util.HashSet;

public class sixteenth {
	
	public static void main(String[] args) {
		
	int[]num = {3, 3, 3, 2, 2,4};
	int result = 0;
	
	HashSet<Integer> hash = new HashSet<>();
	
	for(int i : num) hash.add(i);
	
	if(hash.size()>num.length/2) result = num.length/2;
	else result = hash.size(); 
	
	
	System.out.println(result);
	
	}

}
