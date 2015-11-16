package vjezbeS06D04;

import java.util.Arrays;

public class Task5 {

	public static void fillArray(int[] array) {
		fillArray(array, 0);

	}

	public static void fillArray(int[] array, int index) {
		if (index == array.length) {
			return;
		}

		array[index] = index + 1;

		fillArray(array, index + 1);

	}

	public static void main(String[] args) {
		int[] arr = new int[6];
		fillArray(arr);
		System.out.println(Arrays.toString(arr));

	}

}
