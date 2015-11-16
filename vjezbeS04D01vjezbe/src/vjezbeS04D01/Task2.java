package vjezbeS04D01;

import java.awt.Font;

/*
 * Napisati metodu koja prima jedan objekat tipa Font kao parametar. Ispisati na konzolu koji je font u pitanju, koja je velicina i da li je plain, italic i/ili bold. Pored toga, 
 * throw-ati NullPointerException ukoliko je dati parametar null.Napisati javadoc za ovu metodu! Potreban je opis i doc tag-ovi za parametar i za exception. 
 * Metoda:void printFontDetails(Font f)
 */
public class Task2 {

	public static void main(String[] args) {
		Font f = new Font("Cambria", Font.ITALIC, 18);
		
		printFontDetails(f);

	}
	/**
	 * Font type.
	 * @param f - font: name, size
	 * @throws - NullPointerException
	 */
	public static void printFontDetails(Font f) {
		if (f == null) {
			throw new NullPointerException("Font is empty.");
		}
		System.out.println("Name: " + f.getName());
		System.out.println("Size: " + f.getSize());
		if (f.isPlain()) {
			System.out.println("Font is plain.");
		} else if (f.isItalic()) {
			System.out.println("Font is italic.");
		} else if (f.isBold()) {
			System.out.println("Font is bold.");
		}
	}

}
