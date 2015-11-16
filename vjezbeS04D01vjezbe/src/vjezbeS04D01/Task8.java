package vjezbeS04D01;
/*
 * Napisati program koji za dati args parametar N ispisuje jedan prosti broj koji ima N cifara. Broj N moze dostizati vrijednosti i preko 
 * 10,000.
 */
public class Task8 {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			
		}
		int counter = 0;
		while (counter < args[i]) {
			counter++;
			boolean prime = counter % args[i] == 0;
			System.out.println(prime); 
		}
			
	}

}
