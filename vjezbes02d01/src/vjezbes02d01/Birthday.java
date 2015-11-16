package vjezbes02d01;

//Program koji sadrzi datum jednog rodjendana (dan, mjesec, godina). Ispisati
//sve rodjendane koje je ta osoba imala do danas.

public class Birthday {

	public static void main(String[] args) {
		
		int day = 22;
		int month = 3;
		int year = 1987;
		
		while (year < 2015) {
			year = year + 1;
			
			System.out.println(day + "." + month + "." + year + ".");
		}

		
	}
}
