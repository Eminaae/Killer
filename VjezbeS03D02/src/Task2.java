/*
 *  NumberFormatException
 * Kruže priče da ovaj Exception ima veze sa wrapper klasama, poput Integer klase. Nije sigurno, ali isto se misli da ima veze sa metodama koje parsiraju podatke.
 */
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		System.out.println("Enter string: ");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		try {
		   int num = Integer.parseInt(str);
		} catch (NumberFormatException ex) {
			System.out.println("Error!");
		}
	}

}
