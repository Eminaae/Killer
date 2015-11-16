package ifovi;

//Program koji za dati datum ispisuje koji je datum sljedećeg dana.

public class Task7 {

	public static void main(String[] args) {
		int day = 30;
		int month = 6;
		int year = 2015;
		
		boolean leap = year % 4 == 0  || year % 400 == 0 && year % 100 == 0;
		
		if (month < 1 != month > 12){
			System.out.println("Taj mjesec ne postoji! Unesi ponovo!");
	
		} else if (day == 31 && month == 1) {
			month++;
			day = 1;
			year++;
			System.out.println(day + ".");
			System.out.println(month + ".");
			System.out.println(year + ".");
		} else if (day == 31 && month == 3) {
			month++;
			day = 1;
			year++;
			System.out.println(day + ".");
			System.out.println(month + ".");
			System.out.println(year + ".");
		} else if (day > 31 && month == 5) {
			month++;
			day = 1;
			year++;
			System.out.println(day + ".");
			System.out.println(month + ".");
			System.out.println(year + ".");
		} else if (day == 31 && month == 7) {
			month++;
			day = 1;
			year++;
			System.out.println(day + ".");
			System.out.println(month + ".");
			System.out.println(year + ".");
		} else if (day == 31 && month == 8) {
			month++;
			day = 1;
			year++;
			System.out.println(day + ".");
			System.out.println(month + ".");
			System.out.println(year + ".");
		} else if (day == 31 && month == 10) {
			month++;
			day = 1;
			year++;
			System.out.println(day + ".");
			System.out.println(month + ".");
			System.out.println(year + ".");
		} else if (day == 31 && month == 12) {
			month = 1;
			day = 1;
			year++;
			System.out.println(day + ".");
			System.out.println(month + ".");
			System.out.println(year + ".");
		} else if (day == 30 && month == 4) {
				month++;
				day = 1;
				year++;
				System.out.println(day + ".");
				System.out.println(month + ".");
				System.out.println(year + ".");
		} else if (day == 30 && month == 6) {
				month++;
				day = 1;
				year++;
				System.out.println(day + ".");
				System.out.println(month + ".");
				System.out.println(year + ".");
		} else if (day == 30 && month == 9) {
				month++;
				day = 1;
				year++;
				System.out.println(day + ".");
				System.out.println(month + ".");
				System.out.println(year + ".");
		} else if (day == 30 && month == 11) {
				month++;
				day = 1;
				year++;
				System.out.println(day + ".");
				System.out.println(month + ".");
				System.out.println(year + ".");
			
		} else if ( leap == true && month == 2 && day == 28) {
			month++;
		    day = 1;
		    year++;
		    System.out.println(day + ".");
			System.out.println(month + ".");
			System.out.println(year + ".");
	     } else { 
	    	day++;
	    	month++;
	    	year++;
	    	System.out.println(day + ".");
	    	System.out.println(month + ".");
	    	System.out.println(year + ".");
	   }

 }
}


