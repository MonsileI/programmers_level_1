package first_From_02_08_to_02_14;

import java.util.Arrays;
import java.util.Collections;

public class StringReverse {

	public static void main(String[] args) {
		
		String s = "Zbcdefg";
		
		String answer[] = s.split("");
		String str="";
		Arrays.sort(answer, Collections.reverseOrder());
		
		for(int i=0;i<answer.length;i++) {
			str+=answer[i];
			
		}
		
		System.out.println(str);
		
	}
}
