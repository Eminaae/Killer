import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;


public class GuessGame {

	public static void main(String[] args) {
		int maxBroj = 100;
		int zamisljeni=(int)(Math.random()*maxBroj); //cast zamisljeni br u int
		
		System.out.println("Zamislio sam broj od 0 do " + maxBroj);
		
		
		int pokusaj, brojPokusaja = 0;
		Scanner ulaz = new Scanner(System.in);
		do{
			brojPokusaja++;
			System.out.println("Unesi broj: ");
			pokusaj=ulaz.nextInt();
			if (pokusaj > zamisljeni){
				System.out.println("Unesi manji broj>");
			}else {
				System.out.println("Unesi veci broj> ");
			}
		}while (pokusaj!=zamisljeni);
		System.out.println("pogodjen broj " +zamisljeni + " u " + brojPokusaja);
	}

}
