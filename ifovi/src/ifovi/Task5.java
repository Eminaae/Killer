package ifovi;
//Program koji za dati rođendan, unesen u vidu dana i mjeseca, određuje da li
//je taj rođendan bio ili treba da bude ove godine.

public class Task5 {

	public static void main(String[] args) {
		int day = 22;
		int month = 5;
	
		
	if ( month < 5 != day < 22){
		System.out.println("Rodjendan je bio ove godine.");
	} else  if (month == 5 && day == 22){
		System.out.println("Srecan rodjendan!");
	} else {
		System.out.println("Rodjendan nije bio ove godine.");
	}

	}

}
