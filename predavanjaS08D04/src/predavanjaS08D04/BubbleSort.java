package predavanjaS08D04;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		int arraySize = 100000;
		int[] array = new int[arraySize];
		Random rnd = new Random();
        long start = System.currentTimeMillis();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(3 * arraySize);
		}
		//System.out.println(Arrays.toString(array));

		for (int j = 0; j < arraySize; j++) {
			for (int i = 0; i < arraySize - 1; i++) {
				if (array[i] > array[i + 1]) {
					int tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = tmp;
				}
			}
		}
		//System.out.println(Arrays.toString(array));
		System.out.println(System.currentTimeMillis() - start);
	}

}
