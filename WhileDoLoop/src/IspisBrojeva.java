import java.util.Scanner;


public class IspisBrojeva {

	public static void main(String[] args) {
		
		/*Scanner in = new Scanner(System.in);
		System.out.println("Unos broja");
		int num = in.nextInt();*/
		
		/*for(int i=1; i<=num; i++){
			if (num % i == 0)
				System.out.println(i);
			}
		*/
		
		//ispisuje parne brojeve unesenog broja
		
		/*for(int i=1; i<=num; i++){
			if (i % 2 == 0)
				System.out.println(i);
			}
		*/
		
		/*int factorial = 1;
		for(int i=1; i<=num; i++){
			    factorial*=i;		
				System.out.println(factorial);
			}
		*/
		/* int num1, num2;
		num1 = in.nextInt();
		num2 = in.nextInt();
		int lcd =-1;
		int min = num1;
		if (min >num2){
			min =num2;
		}
		for(int i=2; i<=min;i++){
			if(num1 % i == 0 && num2 % i == 0){
				lcd = 1;
				break;
			}
		}
		if(lcd != -1){
			System.out.println(lcd);
		}
			else{
				System.out.println("Nema NZD");
			}
		
		*/
		
		/*int m=9, n=9;
		
		
		for (int i=1; i <= m; i++){
			for (int j=1; j <= n; j++){
				int p=i*j;
				//System.out.print(p +" ");
				System.out.println("%2", i*j);
			}
			System.out.println();
				
			}
		
		*/
		int endInterval = 10;//u intervalu provjerava od 1 do 10 da li je br prost
		
		for(int i=1; i<= endInterval; i++){
			//checks if number is prime
		int n =i;
		boolean isPrime = true; //pretpostavimo da je prost
		
			for(int j=2; j < n; j++){//Ovdje provjeravamo da li je broj prost
			//if there is an i which can divide n n is not prime
				if(n % j == 0){
				isPrime=false;
				break; //ako smo nasli da br nije prost nema potrbe da dalje provjeravamo pa prekidamo
			}
		}
		if (isPrime == true){//ispisuje taj prost broj
			System.out.println(n);
			}
		}
		//znamo je li prost
		
		//in.close();
	
			
	}
}

