import java.util.Scanner;

/*
 * Ponavljanje brojeva u nizu
 * Iskodirati program gdje se korisnik pita koliko ce brojeva unijeti. Zatim unijeti sve te elemente, koji su tipa int, u niz. Na kraju ce se korisnik pitati koji broj želi da se
 * prebroji. Provjeriti koliko se taj broj pojavljuje u nizu i isprintati na ekran.
 */
public class Task3 {

	public static void main(String[] args) {
		System.out.println("Koliko brojeva zelis unijeti:");
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int arr[] = new int [n];
		System.out.println("Unesi brojeve: ");
		
		for (int i = 0; i < n; i++) {
			arr [i] =in.nextInt();
			}
		System.out.println("Koji broj zelis da prebrojis? ");
		int number = in.nextInt();
		
		int counter = 0; 
		for (int i = 0; i < n; i++) {
			if (number == arr[i]){
				counter++;
			}
		}
		System.out.println("Broj " + number + " se u nizu ponavlja " + counter + " puta." );
		
		in.close();
	}

}
