/*
 * IllegalArgumentException
 * Otac NumberFormatException-a. Teži za uhvatiti. Sva sreća pa ga postoji u izobilju na TextIO planeti.
 */
public class Task4 {

	public static void main(String[] args) {
		try {
			TextIO.readFile("fileName.txt");
		} catch (IllegalArgumentException ex) {
			System.out.println("Error!");
			
		}

	}

}
