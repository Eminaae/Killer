package ba.bitcamp.week8.day3.vjezbe;

import java.util.Arrays;

/**
 * Partially filled array
 * 
 * @author emina.arapcic
 *
 */
public class Task03 {
	/**
	 * Napisati metodu koja prima niz String-ova kao varargs. Metoda vraća niz
	 * koji nema nijedan null u sebi. Ukoliko je dati niz {ABC, null, OAK123,
	 * null, JAVA} onda vraćeni niz je {ABC, OAK123, JAVA}.
	 * 
	 * @param args
	 */

	public static String[] partiallyFilled(String... s) {

		String[] arr = new String[0];

		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				arr = Arrays.copyOf(arr, arr.length + 1);
				arr[arr.length - 1] = s[i];
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(partiallyFilled("ABC", null, "OAK123", null,
				"JAVA")));
	}
}
