package Today_22_03_11;

public class test {
	
	public static void main(String[] args) {
		
		String s = "..&*^..&.^*&*__--0101..";
		
		s = s.replaceAll("[^A-Za-z0-9-_.]","");
			
		System.out.println(s);
	 
		s = s.replaceAll("[.]{2,}", ".");
		
		System.out.println(s);
		
		s = s.replaceAll("^[.][.]$", "");
		
		System.out.println(s);
		
		String test = ".zzzzzz.";
		
		test = test.replaceAll("^[.][.]$","");
		
		System.out.println(test);
		
	}

}
