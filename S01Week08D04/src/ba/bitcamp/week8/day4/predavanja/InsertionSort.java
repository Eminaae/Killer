package ba.bitcamp.week8.day4.predavanja;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
	
	
	public static void InsertionSort(int[] a){
		for(int i = 1; i < a.length; i++){
			int temp = a[i]; //trenutni broj
			int location = i - 1;
			
			while(location >= 0 && temp < a[location] ){
				//location >= 0 da ne bismo dobili IndexOutOfBound
				//bitno da je ovaj uslov prvi, ako je zadovoljen ne provjerava se drugi uopste AND
				a[location +1] = a [location];
				location --; //smanjujemo lokaciju
			}
			a[location + 1] = temp;
		}
	}

	public static void main(String[] args) {
		int[] array = new int[10];
		Random rnd = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(3 * array.length);
		}
		
		System.out.println(Arrays.toString(array));
		InsertionSort(array);
		System.out.println(Arrays.toString(array));
		

	}

}
