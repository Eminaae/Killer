/*Program koji sadrži datum jednog rođendana (dan, mjesec, godina). Ispisati
sve rođendane koje je ta osoba imala do danas.*/
public class Task02 {

	public static void main(String[] args) {
		int day = 25;
		int month = 5;
		int year = 2000;
		int currentYear = 2015;
		
		while (year <= currentYear){
		
			System.out.println(day + "." + month + "." + year +".");
			year++;
		}
		
	}

}
