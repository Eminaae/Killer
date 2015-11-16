
public class Roller {

	public static void main(String[] args) {
		
		int R = 6;
		int h = 4;
		int r = R / 2;
		double pi = 3.14159;
		
	
		double P = 2 * r * r *pi + 2 * r * h * pi;
		double V = r * r * pi * h;
		
//		System.out.printf("P: %f\nV: %f\n", P, V);
//		System.out.printf("R = %d", R);
		
		System.out.printf("P: %.3f\n", P);
		System.out.printf("V: %.3f\n", V);

	}

}
