package predavanjas02d01;

public class Sum {

	public static void main(String[] args) {
		
		int brojeva = 100;
		int suma = 0;
		int broj = 1;
		do {
			suma += broj;
			broj++;	
		} while (broj <= brojeva); 
		
			System.out.println(suma);	
	}

}
