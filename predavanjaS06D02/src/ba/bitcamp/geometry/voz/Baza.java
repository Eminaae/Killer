package ba.bitcamp.geometry.voz;

import ba.bitcamp.geometry.KompleksnoTijelo;
import ba.bitcamp.geometry.Krug;
import ba.bitcamp.geometry.Pravougaonik;

public class Baza extends KompleksnoTijelo{
	private double visina;
	private double duzina;
	private double velicinaTocka;

	public Baza(double duzina, double visina, double velicinaTocka){
		super(new Krug(velicinaTocka), new Krug(velicinaTocka), new Pravougaonik(duzina, visina));
		this.duzina = duzina;
		this.visina = visina;
		this.velicinaTocka = velicinaTocka;
	}

	@Override
	public String toString() {
		return String.format("Baza duzina = %f, visina = %f, velicna tocka = %f", duzina, visina, velicinaTocka);
	}
	
	
	

}
