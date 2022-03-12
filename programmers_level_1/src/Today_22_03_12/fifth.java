package Today_22_03_12;

public class fifth {
	
	public static void main(String[] args) {
		
		int price = 3;
		int money = 20;
		int count = 4;
		int result = 0;
		long answer = money;
		for(int i=1;i<=count;i++) {
			
			answer -= price * i;
			
		}
		if(answer > 0) result = 0;
		answer = answer * -1;
		System.out.println(answer);
	}

}
