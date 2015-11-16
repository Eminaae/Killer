package vjezbes02d01;

//Program koji sadrzi pozitivni cijeli broj n. Ispisati na konzolu da li je taj broj
//prost, tj. moze se samo dijeliti sa 1 i sa samim sobom.

public class Trivial {

	public static void main(String[] args) {
		
		int n = 10;
		int brojac = 0;
		
		while (brojac < n){
			brojac++;	
			boolean div = brojac % n == 0; 
			System.out.println(div);
				
			}
			
			
		} 

	
	}




