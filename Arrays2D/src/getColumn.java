import java.util.Scanner;

public class getColumn {

	public static void main(String[] args) {
		//TwoDArray();
		
		/*
		Scanner in = new Scanner(System.in);
		System.out.println("Insert number of rows: ");
		int rows = in.nextInt();
		System.out.println("Insert number of columns: ");
		int columns = in.nextInt();
				
		int [][] matrix = new int [rows][columns];
		MatrixHelper.fillMatrix(matrix);
		MatrixHelper.print2DArray(matrix);
		*/
	}
	

	public static void TwoDArray(){
		int [][] matrix = new int [4][5];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[0][3] = 4;
		matrix[0][4] = 5;
	
		matrix[1][0] = 6;
		matrix[1][1] = 7;
		matrix[1][2] = 8;
		matrix[1][3] = 9;
		matrix[1][4] = 10;
		
		matrix[2][0] = 11;
		matrix[2][1] = 12;
		matrix[2][2] = 13;
		matrix[2][3] = 14;
		matrix[2][4] = 15;
		
		matrix[3][0] = 16;
		matrix[3][1] = 17;
		matrix[3][2] = 18;
		matrix[3][3] = 19;
		matrix[3][4] = 20;
		
		int counter = 1;
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix [i].length; j++){
				matrix[i][j]=counter++;  //++counter => prvi clan je 2
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}	
	} 
	
	public static void print2DArray(int[][] array){
		for (int i = 0; i < array.length; i++){
		for (int j = 0; j < array [i].length; j++){
			System.out.print(array[i][j] + " ");
		}
		System.out.println();
		}
	}

	public static void getsColumn(int[][] matrix, int columnIndex){
		int[] column = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++){
			column[i] = matrix [i][columnIndex];
		}			
	}
}
