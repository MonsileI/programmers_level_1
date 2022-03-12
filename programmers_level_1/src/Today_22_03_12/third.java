package Today_22_03_12;



public class third {
	
	public static void main(String[] args) {
		
		int[][]sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int result = 0;
		
		int garo = 0;
		int sero = 0;
		
		for(int i=0;i<sizes.length;i++) {
			
			int v = Math.max(sizes[i][0], sizes[i][1]);
			int h = Math.min(sizes[i][0], sizes[i][1]);
			
			garo = Math.max(v, garo);
			sero = Math.max(h, sero);
		}
		
		System.out.println(garo*sero);
		
	}

}
