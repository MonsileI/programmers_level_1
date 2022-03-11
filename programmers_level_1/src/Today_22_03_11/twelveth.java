package Today_22_03_11;

import java.util.Arrays;

public class twelveth {

	public static void main(String[] args) {
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[]completion = {"stanko", "ana", "mislav"};
		String result = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i=0;i<completion.length;i++) {
			
			if(!participant[i].equals(completion[i])) {
				result = participant[i];
			}
			
		}
		
		
		if(result.equals("")) {
			result = participant[participant.length-1];
		}
		
		System.out.println(result);
	}
	
	
}
