package ba.bitcamp.week8.day3.predavanja;

import java.util.ArrayList;
import java.util.Random;

/**
 * removes all 2 digits in the list
 * 
 * @author emina.arapcic
 *
 */
public class Task02 {
	
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			Random rand = new Random();
			a.add(rand.nextInt(5));// raspon 3 puta veci od duzine niza, vraca
									// broj u rasponu od 0 do 300 ne ukljucujuci
									// 300 rand.nextInt(300)
		}
		System.out.println(a.toString()); // initial array list
		while (a.indexOf(2) != -1) {
			a.remove((Integer) 2);
		}
		
		System.out.println(a.toString()); // new array list after removing

	}

}
