import java.util.InputMismatchException;
import java.util.Scanner;


public class Task03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/**
		 * Pokusacemo uzeti input od korisnika
		 */
		try {
			int input = in.nextInt();
			System.out.println(input);
		
		}catch(InputMismatchException e){
			System.out.println("Wrong input");// Ispis za korisnika
			e.printStackTrace();
		}
		System.out.println("The end od programm");
		
	}
}

