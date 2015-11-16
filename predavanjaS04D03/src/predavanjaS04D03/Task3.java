package predavanjaS04D03;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

	public static int[] getColumn(int[][] matrix, int column) {
		int[] oneColumn = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			oneColumn[i] = matrix[i][column];

		}
		return oneColumn;
	}
	
//	public static void printColumn (int[] oneColumn) {
//		for (int i = 0; i < oneColumn.length; i++) {
//			    int[] column = oneColumn[i]
//				System.out.print(column + " ");
//		}
//	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Input nubmber of rows: ");
		int numberOfRow = input.nextInt();
		System.out.print("Input nubmber of rows: ");
		int numberOfColumn = input.nextInt();

		int[][] matrix = new int[numberOfRow][numberOfColumn];

		MatrixHelper.fillMatrix(matrix);
		MatrixHelper.print2DArray(matrix);

		System.out.println(Arrays.toString(getColumn(matrix, 1)));

	}

}
