package ba.bitcamp.week8.day3.vjezbe;

import java.util.Arrays;

/**
 * A to Z
 * @author emina.arapcic
 *
 */
public class Task05 {
	/**
	 * Napisati metodu koja prima niz String-ova kao varargs. 
	 * Metoda treba vratiti niz koji predstavlja date String-ove ali sortirane po abecedi.
	 * @param args
	 */

	public static String azFormat(Object... args) {
	String s = "a d f g";	
	Arrays.sort(args);
		System.out.println(Arrays.toString(args));
		return s;
	}
	public static void main(String... args) {
		
	    System.out.println(azFormat("a p f g"));
	    
	   
	}

}
