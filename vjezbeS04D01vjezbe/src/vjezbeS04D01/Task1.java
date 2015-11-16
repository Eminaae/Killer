package vjezbeS04D01;

/*
 * Napisati metodu koja prima jedan parametar a, sto je zapravo duzina stranice kvadrata. Ispisati na ekran povrsinu kvadrata za datu vrijednost stranice a. Ukoliko se desi da je dati
 * parametar a negativan, tj. manji od nule, onda throw-ati IllegalArgumentException, a u informaciju Exception-a staviti da je vrijednost a losa.
 * Napisati javadoc za ovu metodu! Potreban je opis i doc tag-ovi za parametar, return i za exception. Metoda:double getAreaOfSquare(double a)
 */
public class Task1 {
	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Area is = ");
		System.out.println(doubleAreaOfSquare(-1));
	}

	/**
	 * Calculate square area.
	 * @param a - rectangle length
	 * @return area - square area
	 * @throws - IllegalArgumentException if a <= 0
	 */
	public static double doubleAreaOfSquare(double a) {

		if (a <= 0) {
			throw new IllegalArgumentException("Value of a is negative."); 
		}
		double area = a * a;
		return area;
	}

}
