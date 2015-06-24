import java.util.InputMismatchException;
import java.util.Scanner;


public class ArgumentException {

	public static void main(String[] args) {
		//IllegalArgumentException
		Scanner in = new Scanner(System.in);
		
		try {
			int input = in.nextInt();
			System.out.println(input);
		
		}catch(IllegalArgumentException e){
			System.out.println("Input int number");// Ispis za korisnika
			e.printStackTrace();
		}
		System.out.println("The end of program");
		
	}

}

