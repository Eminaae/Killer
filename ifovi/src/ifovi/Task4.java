package ifovi;

//Program koji odredi da li se dati broj nalazi u između 0 i 25, između 25-50 ili
//je van tih opsega.

public class Task4 {

	public static void main(String[] args) {
		int num = 45;
		
		if ( num > 0 && num < 25) {
			System.out.println("Broj se nalazi izmedju 0 i 25.");
		} else if ( num > 25 && num < 50) {
			System.out.println("Broj se nalazi izmedju 25 i 50.");
		} else {
			System.out.println("Broj je van opsega.");
		}	
			

	}

}
