package predavanjaS04D03;

import java.util.Scanner;

public class Task2 {
	
	/**
	 * Printing 2D array
	 * @param array - 2D array
	 */
//	public static void print2DArray (int [][] array) {
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Input nubmber of rows: ");
		int numberOfRow = input.nextInt();
		System.out.print("Input nubmber of rows: ");
		int numberOfColumn = input.nextInt();
		
		int[][] matrix = new int [numberOfRow][numberOfColumn];
		
		MatrixHelper.fillMatrix(matrix);
		MatrixHelper.print2DArray(matrix);
		
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				System.out.print("Input element on position [" + (i + 1) + " " + (j + 1) + "]: ");
//				int element = input.nextInt();
//				matrix[i][j] = element;
//			}
//		}
//		System.out.println("2D Array is: ");
//		print2DArray (matrix);
		input.close();
	}

}
