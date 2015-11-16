package predavanjaS02D02;
//da li su prosti ili ne do unesenog broja
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
			
			System.out.println("Unos: ");
			int num = in.nextInt();
			
			boolean isPrime = true;
			
			for (int i = 1; i <= num; i++ ) {
				isPrime = true; //resetovanje vrjednosti
				for  (int j = 2; j < i; j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}	
				}
				if (isPrime == true) {
					System.out.println( i + " " + isPrime);
				} 
				
			}
			in.close();
	}

}
