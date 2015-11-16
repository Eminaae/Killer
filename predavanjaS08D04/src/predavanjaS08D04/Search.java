package predavanjaS08D04;

import java.util.Arrays;
import java.util.Random;

public class Search {

	public static int BinarySearch(int[] a, int value) {

		int min = 0;
		int max = a.length - 1;

		while (min <= max) {
			int mid = (min + max) / 2;

			if (a[mid] == value) {
				return mid;
			} else if (a[mid] > value) { // value is on the left
				max = mid - 1;
			} else { // value is on the rigth
				min = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arraySize = 10;
		int value = 5;
		int[] array = new int[arraySize];
		Random rnd = new Random();

		for (int i = 0; i < arraySize; i++) {
			array[i] = rnd.nextInt(3 * arraySize);
		}
		System.out.println(Arrays.toString(array));

		Arrays.sort(array);

		int location = BinarySearch(array, value);
		System.out.println("Broj " + value + " je na lokaciji: " + location);
		System.out.println(Arrays.binarySearch(array, value));

	}

}
