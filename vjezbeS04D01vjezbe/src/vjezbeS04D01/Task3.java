package vjezbeS04D01;


/*
 * Napisati program koji prima dva parametra sa command line, tj. koristi args parametre. Ispisati kolicnik ta dva broja na konzolu. Handle-ati sve exceptione koji se mogu desiti, 
 * ukljucujuci i scenarij kada args bude prazan! Zapakovati program u jar file i pokrenuti ga preko command line-a.
 */
public class Task3 {
/**
 * 
 * @param args
 * @throws ArithmeticException
 */
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Hey, you need more arguments.");
			System.out.println("At least two.");
			System.exit(0);
		} else if (args.length >2) {
			System.out.println("Hey, you need less arguments.");
			System.out.println("two.");
			System.exit(0);
		}
		
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		if (b == 0) {
		throw new ArithmeticException("Infinity");
		}
		System.out.println("Result is :" + a/b);

	}

}
