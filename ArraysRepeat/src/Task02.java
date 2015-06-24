import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter rows number: ");
		int rows = in.nextInt();
		System.out.println("Enter columns number: ");
		int columns = in.nextInt();
		int matrix[][] = new int[rows][columns];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

			}
		}
		matricaBool(false, matrix);
	}

	public static void matricaBool(boolean param, int[][] matrix) {
		if (param == true) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
		} else {
			for (int i = matrix.length-1; i >= 0; i--) {
				for (int j =matrix[i].length-1; j >= 0 ; j--) {
					System.out.print(matrix[j][i] + " ");
				}
				System.out.println();
			}
		}
	
	}
}
