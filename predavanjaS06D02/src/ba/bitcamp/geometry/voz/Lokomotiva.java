package ba.bitcamp.geometry.voz;

import ba.bitcamp.geometry.KompleksnoTijelo;
import ba.bitcamp.geometry.Kvadrat;
import ba.bitcamp.geometry.Pravougaonik;

public class Lokomotiva extends Baza{
	double VelicinaKabine;


	public Lokomotiva(double duzina, double visina, double velicinaTocka, double VeicinaKabine, final double procentProzoraNaKabini, int brojDimnjaka) {
		super(duzina, visina, velicinaTocka);
	
		//dodaj kabinu kabina je kvadrat
		 dodajDio (new Kvadrat(VelicinaKabine)) {
			public double povrsina() {
				return super.povrsina() * (1-procentProzoraNaKabini);
			};
		
		 }
		//dodaj dimnjake
		for (int i = 0; i < brojDimnjaka; i++) {
			dodajDio(new Dimnjak(VelicinaKabine));
		}
	}
	
	private class Dimnjak extends KompleksnoTijelo {
		public Dimnjak (double visina) {
		super(new Pravougaonik(visina/3, visina), new Pravougaonik(visina/3 + 10, 10));
		}
	}

}
