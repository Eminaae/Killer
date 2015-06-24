package ba.bitcamp.week4;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter rows number: ");
		int rows = in.nextInt();
		System.out.println("Enter columns number: ");
		int columns = in.nextInt();
		int matrix[][] = new int[rows][columns];
		int sum = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextInt();
		}
	}
		
		for ( int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix [i].length; j++){
				sum += matrix [i][j];
			}
		}System.out.print(sum + " "); 
		
	}
}


