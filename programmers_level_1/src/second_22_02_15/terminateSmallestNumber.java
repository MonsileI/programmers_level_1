package second_22_02_15;

import java.util.ArrayList;

public class terminateSmallestNumber {
	
	public static void main(String[] args) {
			
		int [] arr = {4,3,2,1};
	
		 // 배열의 길이가 1일 때
        if(arr.length <= 1){
            int[] answer = {-1};
            System.out.println(answer);
        }
        
        // 배열의 길이가 1보다 클 때
        // 주어진 배열에서 가장 작은 수를 뺀 길이로 초기화
        int[] answer = new int[arr.length-1];
        
        // 하나의 값을 기준으로 잡는다.
        int min = arr[0];
        
        // Math.min(int, int)함수를 사용하여
        // 제일 작은 수를 구한다.
        for(int i=1; i<arr.length; i++){
            min = Math.min(min,arr[i]);
        }
        
        // 반복문 index용
        int index = 0;
        
        // 가장 작은 수를 제외한 배열 만들어주기
        for(int i=0; i<arr.length; i++){
            // 배열의 값이 가장 작은 수라면
            if(arr[i] == min){
                // continue를 이용하여 배열에 넣어주지 않고 넘어간다.
                continue;
            }
            answer[index++] = arr[i];
        }
        
       System.out.println(answer);
		
	}

}
