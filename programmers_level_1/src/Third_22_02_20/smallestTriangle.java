package Third_22_02_20;

public class smallestTriangle {

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
		
		result = garo*sero;
		
		System.out.println(result);
		
		
		
	}
}
