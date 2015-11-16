package predavanjaS02D05;

import ba.bitcamp.Planeta;

/**
 * Vjezbanje objekata u Javi
 * 
 * @author kristina.pupavac
 *
 */
public class Objects {
	public static void main(String[] args) {
		Planeta pl = new Planeta (1000, 600, "Lopta", "Pluton");
		pl.dodajMasu(80);
		pl.dodajMasu(64);
		pl.racunajTezinu();
		System.out.println("PL-TEZINA: " +pl.racunajTezinu());
		System.out.println("PL-MASA: " +pl.vrijednostMase());
		
		Planeta bl = new Planeta (435, 444, "Kocka", "Kockasia");
		if (bl != null){
		System.out.println("bL-TEZINA: " +bl.racunajTezinu());
		System.out.println("BL: " + bl.vrijednostMase());
			
		bl.dodajMasu(-300);
		System.out.println("bL-TEZINA: " +bl.racunajTezinu());
		System.out.println("BL: " + bl.vrijednostMase());
		}
	}
}
