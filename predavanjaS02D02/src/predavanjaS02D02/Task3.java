package predavanjaS02D02;

import java.util.Scanner;

//Faktorijel
public class Task3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Unos: ");
		int num = in.nextInt();
		int factorial = 1;

		for ( int i = 1; i <= num; i++) {
			factorial *= i;
			System.out.println(factorial);
		}
		in.close();

	}

}
