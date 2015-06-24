package ba.bitcamp.week05.day05;

import java.util.Random;
import java.util.Scanner;

public class PogodiBroj {

	private int maxBroj;
	private int maxBrojPokusaja;

	public PogodiBroj(int maxBroj, int maxBrojPokusaja) {
		super();
		this.maxBroj = maxBroj;
		this.maxBrojPokusaja = maxBrojPokusaja;
	}

	public PogodiBroj(int maxBroj) {
		this(maxBroj, maxBroj / 100 + 1);
	}

	public PogodiBroj() {
		this(1000, 10);
	}

	public void igraj() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		Random rand = new Random();
		int zamisljeniBroj = rand.nextInt(maxBroj - 1) + 1;
		int brojac = 0;
		int broj = 0;

		while (brojac < maxBrojPokusaja) {
			brojac++;
			broj = in.nextInt();
			if (broj == zamisljeniBroj) {
				System.out.println("Bravo!");
				return;
			}
			if (broj < zamisljeniBroj) {
				System.out.println("Pokusaj veci broj");
			}
			if (broj > zamisljeniBroj){
				System.out.println("Pokusaj manji broj");
			}else{
				System.out.println("Niste pogodili");
			}
		}
	}

	@Override
	public String toString() {
		return "PogodiBroj [maxBroj=" + maxBroj + ", maxBrojPokusaja="
				+ maxBrojPokusaja + "]";
	}
	
}