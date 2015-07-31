package ba.bitcamp.week8.day3.vjezbe;

import java.util.Arrays;

public class Task04a {

	public static void main(String[] args) {
		/**
		 * Napisati metodu koja prima String. Pored toga, metoda prima i jedan
		 * karakter. Odrediti da li dati karakter postoji u datom String-u. Mora
		 * se koristiti binarna pretraga!
		 * 
		 * @param args
		 */

		// initializing unsorted char array
		char charArr[] = { 'f', 'b', 'c', 'd', 'e' };

		// sorting array
		Arrays.sort(charArr);

		System.out.print("The sorted char array is: ");
		for (char number : charArr) {
			System.out.print(number);

		}
		System.out.println();
		// value to be searched
		char searchVal = 'e';

		int retVal = Arrays.binarySearch(charArr, searchVal);

		System.out.println("The index of searched character is : " + retVal);
	}

}
