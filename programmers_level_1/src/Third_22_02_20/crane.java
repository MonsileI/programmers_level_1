package Third_22_02_20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class crane {
	
	public static void main(String[] args) {
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		int result = 0;
		
		HashMap<Integer, Stack<Integer>> heap = new HashMap<Integer, Stack<Integer>>();
	
		for(int i=0;i<board.length;i++) {
		
			for(int j=0;j<board[i].length;j++) {
				
				heap.put(i, heap.get(i).add(j));
				
			}
			
		}
		
		
		
	}

}
