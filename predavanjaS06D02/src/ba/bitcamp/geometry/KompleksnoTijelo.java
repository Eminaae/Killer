package ba.bitcamp.geometry;

import java.util.Arrays;

public class KompleksnoTijelo implements ITijelo {

	ITijelo[] dijelovi;

	public KompleksnoTijelo(ITijelo... pocetniDijelovi) {
		dijelovi = pocetniDijelovi;
		//TODO provjeri da li su dijelovi razliciti od nul
	    //TO DO enkapsuliraj bolje - kopirja niz
	}

	public void dodajDio(ITijelo dio) {
		if (dio != null && dio != this) {
			ITijelo[] novi;
			novi = new ITijelo[] { dio }; // new ITijelo[1];
			novi = new ITijelo[dijelovi.length + 1];
			System.arraycopy(dijelovi, 0, novi, 0, dijelovi.length);
			novi[novi.length - 1] = dio;
			dijelovi = novi;
		} else {
			throw new UnsupportedOperationException(
					"Ne moze se dodati null dio jer samo sebe...");
		}

	}

	@Override
	public double povrsina() {
		// dijelovi ne moze biti null moze biti smao prazna niz
		double ukupnaPovrsina = 0;
		for (ITijelo dio : dijelovi) {
			ukupnaPovrsina += dio.povrsina();
		}
		return ukupnaPovrsina;

	}

	@Override
	public double obim() {
		// dijelovi ne moze biti null moze biti smao prazna niz
		double ukupanObim = 0;
		for (ITijelo dio : dijelovi) {
			ukupanObim += dio.obim();
		}
		return ukupanObim;
	}

	
	@Override
	public String toString() {
		return String.format("Komplekson tijelo(%s)", Arrays.toString(dijelovi));
	}
	
	

}
