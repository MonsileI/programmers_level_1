package Today_22_03_11;

public class forth {
	
	public static void main(String[] args) {
		
		String s = "one4seveneight";
		
		String[]alpha = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String []num = {"0","1","2","3","4","5","6","7","8","9"};
		
		for(int i=0;i<10;i++) s = s.replaceAll(alpha[i], num[i]);
		
		
		System.out.println(s);
	}

}
