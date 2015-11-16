package vjezbeS06D04;

public class Task6 {

	public static boolean isInArray(int[] array, int n) {
		return isInArray(array, n, 0);
	}

	public static boolean isInArray(int[] array, int n, int index) {
		if (index >= array.length) {
			return false;
		}
		if (array[index] == n) {
			return true;
		}
		index++;
		return isInArray(array, n, index);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 2, 5 };
		int n = 2;

		System.out.println(isInArray(arr, n));
	}

}
