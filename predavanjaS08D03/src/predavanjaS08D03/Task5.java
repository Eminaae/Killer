package predavanjaS08D03;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
	static Random rnd = new Random();
	
	public static int throwDice() {
		int diceOne = rnd.nextInt(6) + 1;
		int diceTwo = rnd.nextInt(6) + 1;
		return diceOne + diceTwo;
	}

	public static void main(String[] args) {
		int[] distribution = new int [13];
		int result;
		for (int i = 0; i < 360000; i++) {
			result = throwDice();
			distribution[result]++;
		}
		for (int i = 2; i < 13; i++) {
			System.out.println(i + "->" + distribution[i]);
		}
		
		System.out.println(Arrays.toString(distribution));

	}

}
