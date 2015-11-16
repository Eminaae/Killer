/*
 * Odredi ekstenziju
 * Napisati metodu koja prima jedan String, koji predstavlja puni naziv jednog file-a.
 * Odrediti koja je ekstenzija tog file-a. Bonus: Neka vrati null ukoliko nema ekstenzije. Method name: getExtension
 * Parameters:String filename
 * Returns: the extension of the file
 * Examples: getExtension(„text.txt“) => „.txt“ getExtension(„program.exe“) => „.exe“ getExtension(„movie.avi“) => „.avi“
 */
public class Task2 {
	public static String getExtension(String filename) {
		String expresion = ".";
		int index = filename.indexOf(".");
		if (index > 0) {
			expresion = filename.substring(index);
			return expresion;
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		System.out.println(getExtension("textmnmb"));
	}

}
