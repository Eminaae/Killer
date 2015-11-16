package predavanjaS08D04;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
	
	public static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int tmp = a[i];
			int loc = i - 1;
			while (loc >= 0 && tmp < a[loc]) {
				a[loc + 1] = a[loc];
				loc--;
			}
			a[loc + 1] = tmp ;
		}
	}
	
	public static void main(String[] args) {
		int arraySize = 10;
		int[] array = new int[arraySize];
		Random rnd = new Random();

		for (int i = 0; i < arraySize; i++) {
			array[i] = rnd.nextInt(3 * arraySize);
		}
		System.out.println(Arrays.toString(array));
		
		insertionSort(array);
		
		System.out.println(Arrays.toString(array));

	}

}
