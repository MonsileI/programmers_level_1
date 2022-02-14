package first_From_02_08_to_02_14;

public class WhereIsMr_Kim {
	
	public static void main(String[] args) {
		
		String[] seoul = {"Jane","Kim"};
		String answer = "";
		
		StringBuilder sb = new StringBuilder();
		
		String find = "Kim";
		
		for(int i =0;i<seoul.length;i++) {
			
			if(find.equals(seoul[i])) {
				sb.append("김서방은 ");
				sb.append(i);
				sb.append("에 있다");
				
			}
			
		}
		
		answer = sb.toString();
		
		System.out.println(answer);
		
	}
	

}
