package vjezbeS06D04;

import java.util.Arrays;

public class Task8 {

	public static void fillArray2(int[] array, int n) {
		array[n] = n;
		fillArray2(array, n - 1, n - 1, true);
		fillArray2(array, n + 1, n - 1, false);
	}

	public static void fillArray2(int[] array, int index, int n, boolean b) {
		if (b) {
			if (index == -1) {
				return;
			}
			array[index] = n;
			fillArray2(array, index - 1, n - 1, true);
		} else {
			if (index == array.length) {
				return;
			}
			array[index] = n;
			fillArray2(array, index + 1, n - 1, false);
		}

	}

	public static void main(String[] args) {
		int[] arr = new int[10];
		fillArray2(arr, 3);
		System.out.println(Arrays.toString(arr));
	}

}
