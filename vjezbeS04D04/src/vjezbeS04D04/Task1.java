package vjezbeS04D04;

import java.util.Scanner;

/*
 * Napisati metodu koja prima int parametre N i M i vraca jednu matricu velicine NxM popunjenu sa random elementima od 5 do 10, ukljucujuci i 5 i 10.
 * Napisati metodu koja prima jedan boolean parametar, kao i jednu int matricu. Isprintati matricu normalno
 * ukoliko je dati boolean parametar false, a ukoliko je true onda je isprintati naopako.
 */
public class Task1 {
	/**
	 * Receives int parameters N and M, and returns the size of a matrix filled
	 * with random NxM elements between 5 to 10
	 * 
	 * @param n
	 *            - number of rows
	 * @param m
	 *            - number of columns
	 * @return matrix
	 */
	public static int[][] matrixReturn(int n, int m) {
		int matrix[][] = new int[n][m];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// random elemenst between 5 to 10
				int element = (int) (Math.random() * 6) + 5;
				matrix[i][j] = element;
			}
		}
		return matrix;
	}
	/**
	 * If boolean is true invert matrix
	 * @param b - boolean
	 * @param matrix - input marix
	 * @return matrixInvert
	 */
	public static int[][] isBoolean(boolean b, int[][] matrix5) {
		if (b == true) {
			int matrixInvert[][] = new int[matrix5.length][matrix5.length];
			for (int i = matrix5.length - 1; i >= 0; i--) {
				for (int j = matrix5[i].length - 1; j >= 0; j--) {
					matrixInvert[i][j] = matrix5[j][i];
				}
			}
			return matrixInvert;
		} else {
			return matrix5;
		}

	}

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// input pharameters
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		System.out.print("Enter m: ");
		int m = input.nextInt();
		// printing matrix
		int[][] matrix1 = matrixReturn(n, m);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("%2s ", matrix1[i][j]);
			}
			System.out.println();
		}
		
		//printing matrixInvert
		System.out.println("Invert matrix if boolean is true");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0 ; j < matrix1[i].length; j++) {
				System.out.printf("%2s ", isBoolean(false, matrix1)[i][j]);
			}
			System.out.println();
		}
		input.close();
	}

}
