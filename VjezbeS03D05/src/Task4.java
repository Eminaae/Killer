/*
 * Napisati metodu koja prima dva String-a. Jedan String označava ime file-a dok drugi predstavlja poruku koja se treba ispisati u spomenuti file.
 * Metoda:void writeToFile(String filename, String msg) Primjeri
 * writeToFile(„text.txt“, „BitCamp <3“)
 */
public class Task4 {
	public static void writeToFile(String filename, String msa) {
		TextIO.writeFile(filename);
		TextIO.putln(msa);
	}

	public static void main(String[] args) {
		writeToFile("text.txt", "BitCamp <3");
	}

}
