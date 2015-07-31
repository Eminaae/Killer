import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		// TwoDArray();

		int[][] matrix = new int[4][5];
		int counter = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = counter ++;
				
				System.out.print(matrix[i][j] + "    ");
			}System.out.println();
		}
		
	}
}
