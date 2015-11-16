/*
 *  ArithmeticException
 * Rijetko viđen Exception. Teško ga uhvatiti. Mnogi su već odustali i ne pokušavaju ga uhvatiti u svojim kodovima. Pojavi se kada se matematika pobuni.
 */
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
         try {
		  int sum = number / 0;
         } catch (ArithmeticException ex) {
        	 System.out.println("Error!");
         }

	}

}
