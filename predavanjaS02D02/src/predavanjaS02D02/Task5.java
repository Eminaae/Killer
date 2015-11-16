package predavanjaS02D02;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Unos: ");
		
		int num1 = in.nextInt();
		boolean isPrime = true;
		
		for  (int i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				isPrime = false;
				break;
			}	
		}
		if (isPrime == true) {
			System.out.println("Prost");
		} else {
			System.out.println("Nije prost");
			
		}
//		boolean div = true;
//		
//		for (int i = 2; i < num1; i++) {
//			if (num1 % i == 0) {
//				div = false;
//			    break;
//		} 
//		} if (div = true) {
//			System.out.println("Broj je prost");
//			} else {
//				System.out.println("Broj nije prost");
//			}

		in.close();
	}

}
