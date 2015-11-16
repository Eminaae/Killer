package predavanjas02d01;

import java.util.Scanner;

public class RandomGuees {

	public static void main(String[] args) {
		
		int maxBroj = 100;
		int zamisljeniBroj = (int)(Math.random()*maxBroj);
		System.out.println("Zamislio sma bro od nula do " + maxBroj);
	
		
		int pokusaj = 0;
		int brojPokusaja = 0;
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesi broj: ");
		
		do { 
			brojPokusaja++;
			
			pokusaj = ulaz.nextInt();
			
			if(pokusaj > zamisljeniBroj) {
				System.out.print("Unesi manji broj: ");
			} else if (pokusaj < zamisljeniBroj) {
				System.out.print("Unesi veci broj: ");
			}
			
		} while (pokusaj != zamisljeniBroj);
		System.out.println("Pogodjen broj " + zamisljeniBroj + "");

	}

}
