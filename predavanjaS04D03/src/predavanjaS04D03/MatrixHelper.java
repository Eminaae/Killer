package predavanjaS04D03;

import java.util.Scanner;

public class MatrixHelper {
	/**
	 * Filling matrix with elements
	 * 
	 * @param matrix
	 */
	public static void fillMatrix(int[][] matrix) {
		// kad bi pisali for each
		// for(int[] row : matrix) {
		// for(int el : row) {
		// el = 1; // ovo nece radit for each nije dobar za upis elemenata samo
		// za ispis ne mogu se menjati vrednosti
		// }
		// }
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out
						.printf("Enter the element at (%d, %d): ", i + 1, j + 1);
				matrix[i][j] = in.nextInt();
			}

		}

	}

	/**
	 * Printing 2D matrix
	 * 
	 * @param matrix
	 */
	public static void print2DArray(int[][] matrix) {
		for (int[] row : matrix) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
}
