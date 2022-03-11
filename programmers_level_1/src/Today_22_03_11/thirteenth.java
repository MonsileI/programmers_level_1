package Today_22_03_11;

import java.util.Arrays;

public class thirteenth {
	
	public static void main(String[] args) {
		
		int[]array = {1, 5, 2, 6, 3, 7, 4};
		int [][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] result = new int[commands.length];
		
		for(int i=0;i<commands.length;i++) {
			
			
			int[]temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			
			Arrays.sort(temp);
			
			result[i] = temp[commands[i][2]-1];
			
			
			
		}
		
		for(int i : result) System.out.println(i);
		
		
		
	}

}
