import ba.bitcamp.Planeta;


public class Objects {

	public static void main(String[] args) {
		//System.out.println(); //System je instanca System klase
		// u main pravimo instancu planete
		
		Planeta pl=new Planeta(1000,600,"Lopta", "Pluton");
		
		//pl je objekat tipa Planeta
		
		pl.dodajMasu(80);
		pl.dodajMasu(64);
		
		System.out.println("PL-TEZINA: " +pl.racunajTezinu());
		System.out.println("PL-MASA: " +pl.vrijednostMase());
		
		Planeta bl=new Planeta(435,444,"Kocka","Kockasia");
		System.out.println("BL-TEZINA: " +bl.racunajTezinu());
		System.out.println("BL-MASA: "+ bl.vrijednostMase());
		
		bl.dodajMasu(-500);
		System.out.println("BL-TEZINA: " +bl.racunajTezinu());
		System.out.println("BL-MASA: " +bl.vrijednostMase());
	}

}


