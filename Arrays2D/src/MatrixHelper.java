import java.util.Scanner;


public class MatrixHelper {

	public static void fillMatrix(int[][] matrix) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix [i].length; j++){
				System.out.printf("Enter the elements  (%d,%d)", i+1, j+1);
				matrix[i][j] = in.nextInt();
				}
	}

}
	public static void print2DArray(int[][] matrix){
		for(int[] row : matrix){
			for(int element : row){
				System.out.print(element + " ");		
			}System.out.println();
		}
	}
	
	public static void getsColumn(int[][] matrix, int columnIndex){
		int[] column = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++){
			column[i] = matrix [i][columnIndex];
		}			
	}
}
