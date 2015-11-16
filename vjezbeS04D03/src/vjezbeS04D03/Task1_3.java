package vjezbeS04D03;

/*
 * Napisati metodu koja prima 2D niz i vrati iz metode sumu svih elemenata matrice.
 */
public class Task1_3 {
	/**
	 * Suming array elemts
	 * @param array - input array
	 * @return - sum array elements
	 */
	public static int arraySum(int[][] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int array[][] = { { 1, 2 }, { 3, 4 } };
		// printing array
		System.out.println("**2D ARRAY**");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		//printing arraySum output (sum of array elements)
		System.out.print("Sum of array elements is: " + arraySum(array));
	}

}
