package predavanjaS19D01;

public class Kvadratna {
	public static Double d;
	public static Double x1;
	public static Double x2;
	
	public static  void jednacina (Double a, Double b, Double c) {
		d = b * b - 4 * a * c;
		
		if (d < 0) {
			System.out.println("Nema realni rijesenja");
		} else if (d > 0) {
			
			x1 = (- b + Math.sqrt(d)) / 2 * a;
			x2 = (- b - Math.sqrt(d)) / 2 * a;
			System.out.println("Ima dva realna rijesenja i ona su razlicita i iznose " + x1 + " i " + x2);
		} else {
			x1 = (- b ) / 2 * a;
		
			System.out.println("Ima samo jedno rijesenje i ono je: " + x1 );
		}
		
	}

	public static void main(String[] args) {
		jednacina (1.0, 3.0, 2.0) ;
		
	}

}
