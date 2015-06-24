package ba.bitcamp.week4;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter rows number: ");
		int rows = in.nextInt();
		System.out.println("Enter columns number: ");
		int columns = in.nextInt();
		
		int array[][] = new int[3][3];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = in.nextInt();
			}
		}System.out.println(isSingular(array));
		
	}

	public static boolean isSingular(int[][] array) {
		boolean var = false;
		int det = 0;
			det = array[0][0] * array[1][1] * array[2][2] + array[0][1]
				* array[1][2] * array[2][0] + array[0][2] * array[1][0]
				* array[2][1] - array[0][1] * array[1][0] * array[2][2]
				- array[0][0] * array[1][2] * array[2][1] - array[0][2]
				* array[1][1] * array[2][0];

		if (det == 0) {
			var = true;
		} else {
			var = false;
		}
		return var;
	}
}
