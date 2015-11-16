import java.util.Arrays;
import java.util.Scanner;

/*
 * String kao niz karaktera
 * Konstruisati program gdje se korisnik pita da unese jedan String. Napraviti niz karaktera jednak dužini tog niza i svaki karakter staviti na jedno mjesto u nizu.
 * Zatim je potrebno obrnuti taj niz i isprintati ga (ne prihvacam da ga odmah isprintate obrnuto, nego da prvo obrnete pa onda isprintate).
 */
public class Task4 {

	public static void main(String[] args) {
		System.out.println("Unesi string: ");
		Scanner in = new Scanner(System.in);
		String str = in.next();

		char arr[] = new char[str.length()];
		char arr1[] = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}

		for (int j = str.length() - 1; j >= 0; j--) {
			arr1[j] = str.charAt(j);
		}

		System.out.println(Arrays.toString(arr1));
		in.close();
	}

}
