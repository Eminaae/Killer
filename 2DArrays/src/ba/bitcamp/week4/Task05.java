package ba.bitcamp.week4;

import java.util.Scanner;


public class Task05 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		TextIO.readFile("src/ba/bitcamp/week4/Numbers");
	
		int rows = TextIO.getInt();
		int columns = TextIO.getInt();
		
		int matrix[][] = new int[rows][columns];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] =TextIO.getInt();
			}
		}		
		for ( int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix [i].length; j++){
				System.out.print(matrix[i][j] + " ");
			} System.out.println();
		}
		
		
	
	}
}

