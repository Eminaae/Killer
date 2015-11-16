package ba.bitcamp.geometry;

public class TestTijela {

	public static void main(String[] args) {
		KompleksnoTijelo kompleksno = new KompleksnoTijelo(new Krug(10), new Krug(10) , new Pravougaonik(60,10));
		kompleksno.dodajDio(new Kvadrat(10));
		//nemoze biti dio sma sebe
		//kompleksno.dodajDio(kompleksno);
		
		
		ITijelo[] testTijela = new ITijelo[] {new Krug(1), new Pravougaonik(5, 10), new Kvadrat(5)};
		
		for (ITijelo tijelo: testTijela) {
			System.out.println(tijelo.toString());
			System.out.println("Obim: " + tijelo.obim());
			System.out.println("Povrsina: " + tijelo.povrsina());
			System.out.println();
		}
		
		Krug k = new Krug (1);
		System.out.println("Povrsina: " + k.povrsina());
		System.out.println("Obim: " + k.obim());
		
		Kvadrat kv = new Kvadrat (10);
		System.out.println("Povrsina: " + kv.povrsina());
		System.out.println("Obim: " + kv.obim());

	}

}
