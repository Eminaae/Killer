package vjezbeS04D03;

import java.util.Scanner;

/*
 * Napisati program u kojem se napravi 2D niz proizvoljnog broja redova i kolona, tj. unesenih preko konzole. Zatim popuniti taj 2D niz sa 
 * elementima. Na kraju isprintati taj niz na konzolu.
 */
public class Task1_2 {

	public static void main(String[] args) {
		// Input array number of rows and columns
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int row = input.nextInt();
		System.out.print("Enter number of columns: ");
		int column = input.nextInt();

		int array[][] = new int[row][column];
		// Enter array elements
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("Enter array element index [" + (i + 1) + ","
						+ (j + 1) + "]: ");
				array[i][j] = input.nextInt();
			}
		}
		// printing array
		System.out.println("**2D ARRAY**");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}

}
