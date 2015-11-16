package ifovi;

//Program koji određuje da li je unesena godina prestupna.

public class Task6 {

	public static void main(String[] args) {
		double year = 2006;
	 
		if (year % 4 == 0  || year % 400 == 0 && year % 100 == 0){
			System.out.println("Godina je prestupna");
		} else {
			System.out.println("Godina nije prestupna.");
		}
		
	

	}

}
