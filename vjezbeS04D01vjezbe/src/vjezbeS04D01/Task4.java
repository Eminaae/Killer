package vjezbeS04D01;

/*
 * Napisati program gdje se niz unosi preko args parametara. Potrebno je sanirati sve exception-e. Napisati metodu koja prima taj niz kao parametar i ispisuje sumu elemenata niza.
 * Napisati javadoc za ovu metodu! Potreban je opis i doc tag-ovi za parametar i za return. Zapakovati program u jar file i pokrenuti ga preko command line-a.
 */
public class Task4 {

	public static void main(String[] args) {
		Sum(args);
	}

	/**
	 * Sum of array arguments
	 * @param args - array arguments
	 * @throws IllegalArgumentException "You need at least one argument."
	 * @throws NumberFormatException for wrong input
	 */
	public static void Sum(String[] args) {
		if (args.length < 0) {
			throw new IllegalArgumentException("You need at least one argument."); 
		} 
		int sum = 0;
		try {
		for (String arg : args) {
			int number = Integer.parseInt(arg);
			sum += number;
		}
		} catch (NumberFormatException ex) {
			System.out.println("NumberFormatException");
		}
		System.out.printf("Suma je: %d\n", sum);
	}

}
