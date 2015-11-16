import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Exception Handling
 * Napraviti program koji od korisnika trazi da unese duzinu niza N. Zatim ce korisnik unijeti broj unosa K. U sljedecih K linija korisnik ce unositi po dva broja. Prvi broj oznacava 
 * indeks a drugi broj oznacava vrijednost koja ce se staviti na taj indeks. Napravite svoj program maksimalno siguran tako što svaki mogući Exception sanirate, npr. korisnik unese 
 * String umjesto broja ili ako unese los indeks.
 */
public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		int k;
		try {
			System.out.println("Input array length: ");
			n = in.nextInt();
			System.out.println("Number of inputs: ");
			k = in.nextInt();
			if (n < 0) {
				System.out.println("Error! negative argument.");
				System.out.println("Input again array length: ");
				n = in.nextInt();
			} else if (k < 0) {
				System.out.println("Error! negative argument.");
				System.out.println("Input number of inputs again: ");
				k = in.nextInt();
			}
			int arr [] = new int [k];
			for (int i = 0; i < k; i++) {
				System.out.println("Input index: ");
				int index = in.nextInt();
				System.out.println("Input value: ");
				int value = in.nextInt();
				arr [index] = value;
			
				if (index > k) {
					System.out.println("Too big for index! ");
					index = in.nextInt();
				}
			}
			System.out.println(Arrays.toString(arr));
		} catch (InputMismatchException ex) {
			System.out.println("Error! Not a number!");
		}

		in.close();
	}
}
