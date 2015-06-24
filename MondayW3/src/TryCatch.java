import java.util.InputMismatchException;
import java.util.Scanner;


public class TryCatch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/**
		 * Pokusacemo uzeti input od korisnika
		 */
		try {
			int input = in.nextInt();
			System.out.println(input);
		
		}catch(InputMismatchException e){
			System.out.println("Pogresan unos");// Ispis za korisnika
			e.printStackTrace();
		}
		System.out.println("Ovo je kraj programa");
		
	}

}
