package predavanjaS05D05;

import java.util.Scanner;

public class PogodiBroj {
	private int maxBroj;
	private int maxBrojPokusaja;

	public PogodiBroj() {
		this(1000, 10);
	}

	public PogodiBroj(int maxBroj, int maxBrojPokusaj) {
		super();
		this.maxBroj = maxBroj;
		this.maxBrojPokusaja = maxBrojPokusaj;
	}

	public PogodiBroj(int maxBroj) {
		this(maxBroj, maxBroj / 100 + 1);
	}

	public String toString() {
		String s = "Pogodi broj izmedju: 0 i " + maxBroj + " u "
				+ maxBrojPokusaja + " pokusaja.";
		return s;
	}

	public void igraj() {
		int randomBroj = (int) (maxBroj * Math.random() + 1);
		int brojac = 0;

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Unesi broj: ");
			int mojBroj = input.nextInt();
			brojac++;
			if (mojBroj == randomBroj) {
				System.out.println("Pogodio si broj u " + brojac + " pokusaja."
						+ "Moj broj je bio: " + randomBroj);
				break;
			}
			if (brojac == maxBrojPokusaja) {
				System.out.println("Nisi pogodio broj u " + maxBrojPokusaja + " pokusaja.");
				System.out.println("Moj broj je bio: " + randomBroj);
				break;
			}
			if (mojBroj < randomBroj) {
				System.out.println("Premali broj. Pokusaj opet.");
			} else if (mojBroj > randomBroj) {
				System.out.println("Preveliki broj. pokusaj opet.");

			}

		}
		input.close();

	}

}
