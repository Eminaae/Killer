import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati program gdje korisnik unosi vrijednosti u a i b, koje su tipa int. Izračunati količnik,
 * tj. a/b. Napisati program tako da sređuje svaki exception koji se može desiti. Jedan od exceptiona koji se mogu desiti je
 *  da korisnik unese slova umjesto brojeva za a i b. U tom slučaju je potrebno upozoriti korisnika i dopustiti mu da ponovo unese vrijednosti.
 */
public class Task6 {

	public static void main(String[] args) {
		System.out.println("Input a and b: ");
		Scanner input = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		
		try {
		 num1 = input.nextInt();
		 num2 = input.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("Error: InputMismatchException!");
			System.out.println("Input a and b: ");
		}
		double div = 0;
		
        try {
        	 div = num1 / num2;
        } catch (ArithmeticException ex) {
        	System.out.println("Error: ArithmeticException!");
        	System.out.println("Input a and b: ");
        }
        System.out.println("Result is: " + div);
	}

}
