
public class Trocifreni {

	public static void main(String[] args) {
		int endInterval = 999;//u intervalu provjerava od 1 do 10 da li je br prost
		
		for(int i=101; i<= endInterval; i++){ // petlja od 101 do 1000
			//checks if number is prime
		
		boolean isPrime = true; //pretpostavimo da je prost
		
			for(int j=2; j < i; j++){//Ovdje provjeravamo da li je broj prost
			//if there is an i which can divide n n is not prime
				if(i % j == 0){
				isPrime=false;
				break; //ako smo nasli da br nije prost nema potrbe da dalje provjeravamo pa prekidamo
			}
		}
		if (isPrime == true){//ispisuje taj prost broj
			System.out.println(i);
			}
		}
		}
	}


