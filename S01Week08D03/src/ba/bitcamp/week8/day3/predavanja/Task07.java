package ba.bitcamp.week8.day3.predavanja;

import java.util.ArrayList;
import java.util.Random;

public class Task07 {

	public static void main(String[] args) {

		int[] distribution = new int[13];
		int result;
		for (int i = 0; i < 360; i++) {

			result = throwDice();
			distribution[result]++;

		}
		for (int i = 1; i < 13; i++) {
			System.out.println(i + " -> " + distribution[i]);
		}
	}

	static Random rnd = new Random();

	/**
	 * Method throw dice
	 * 
	 * @return sum 
	 */
	private static int throwDice() {

		int diceOne = rnd.nextInt(6) + 1;
		int diceTwo = rnd.nextInt(6) + 1;
		return diceOne + diceTwo;

	}

}
