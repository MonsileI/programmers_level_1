package Third_22_02_20;

import java.util.Stack;

public class crane {
	
	public static void main(String[] args) {
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		int answer = 0;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i =0; i<moves.length;i++) {
			
			for(int j=0;j<board.length;j++) {
				
				if(board[j][moves[i]-1] != 0) {
					
					if(!stack.empty() && stack.peek() == board[j][moves[i]-1]) {
						
						answer++;
						stack.pop();
						
						board[j][moves[i]-1] = 0;
						break;
					}else {
						
						stack.push(board[j][moves[i]-1]);
						board[j][moves[i]-1] = 0;
						break;
						
					}
				}
			}
			
		}
		
		System.out.println(answer*2);
	
	}

}
