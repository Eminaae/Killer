package ifovi;

//Program koji određuje da li je broj pozitivan ili negativan.

public class Task1 {

	public static void main(String[] args) {
		int number = 0;
		
		if (number > 0) {
			System.out.println("Broj " + number+ " je pozitivan.");
		} else if (number == 0){
			System.out.println("Broj " + number + " je nula");
		} else {
			System.out.println("Broj " +number + " je negativan.");
		}

	}

}
