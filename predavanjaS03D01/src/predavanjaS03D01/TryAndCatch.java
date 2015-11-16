package predavanjaS03D01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatch {

	public static void main(String[] args) {
		
		System.out.println("Input: ");
		Scanner in = new Scanner (System.in);
		try {
		int input = in.nextInt();
		System.out.println(input);
		in.close();
		} catch(InputMismatchException e) {
			System.out.println("Pogresan unos: ");
			e.printStackTrace();
		}
		System.out.println(" Ovo je kraj programa");
	}

}
