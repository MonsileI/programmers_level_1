package Today_22_03_12;

public class eighth {

	public static void main(String[] args) {
		int n = 5;
		
		String[]result = new String[n];
		int[]arr1 = {9, 20, 28, 18, 11};
		int[]arr2 = {30, 1, 21, 17, 28};
			for(int i=0;i<n;i++) {
				
				String first = Integer.toBinaryString(arr1[i]);
				String second = Integer.toBinaryString(arr2[i]);
				
				if(first.length()<n) {
					while(first.length()<n) {
						first = "0"+first;
					}
				}
				if(second.length()<n) {
					while(second.length()<n) {
						second = "0"+second;
					}
				}
				
				String answer = "";
				for(int j=0;j<n;j++) {
					if(first.charAt(j)=='1'||second.charAt(j)=='1') {
						answer += "#";
					}else {
						answer += " ";
					}
				
				}
				result[i] = answer;
				
			}
			
		for(String s : result) System.out.println(s);
	}
}
