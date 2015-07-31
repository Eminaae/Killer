package ba.bitcamp.week8.day3.vjezbe;

import java.util.Arrays;

/**
 * Find the one (binary search)
 * 
 * @author emina.arapcic
 *
 */
public class Task04 {

	/**
	 * Napisati metodu koja prima String. Pored toga, metoda prima i jedan
	 * karakter. Odrediti da li dati karakter postoji u datom String-u. Mora se
	 * koristiti binarna pretraga!
	 * 
	 * @param args
	 */

	private static int findTheOne(char[] arr, char c) {
		char[] a = { 'a', 'a', 'g', 'c', 'c' };
		int lowestPossibleLoc = 0;
		int highestPossibleLoc = a.length - 1;
		while (highestPossibleLoc >= lowestPossibleLoc) {
			int middle = (lowestPossibleLoc + highestPossibleLoc) / 2;
			if (a[middle] == c) {
				// N has been found at this index!
				return middle;
			} else if (a[middle] > c) {
				// eliminate locations >= middle
				highestPossibleLoc = middle - 1;
			} else {
				// eliminate locations <= middle
				lowestPossibleLoc = middle + 1;
			}
		}
		// At this point, highestPossibleLoc < LowestPossibleLoc,
		// which means that N is known to be not in the array. Return
		// a -1 to indicate that N could not be found in the array.
		return -1;
	}

	public static void main(String[] args) {
		char[] a = { 'a', 'a', 'b', 'b', 'b' };
		System.out.println(findTheOne(a, 'c'));
	}

}
