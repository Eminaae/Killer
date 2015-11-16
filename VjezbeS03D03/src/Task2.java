import java.util.Scanner;

/*
 * Niz sa unesenom duzinom
 * Napraviti program u kojem se korisnik preko konzole pita koliko ce dug niz biti. Zatim napraviti taj niz i pitati korisnika da unese sve te vrijednosti. 
 * Isprintati taj niz na ekran
 */
public class Task2 {

	public static void main(String[] args) {
		System.out.println("Koliko dugacak niz zelis? ");
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int arr [] = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr [i] = (int)(Math.random() * n + 1);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		 
     in.close();
	}

}
