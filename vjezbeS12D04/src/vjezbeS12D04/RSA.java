package vjezbeS12D04;


import java.util.Scanner;

public class RSA {

	public static void main(String[] args) {
		System.out.println("Input number: ");
		Scanner input = new Scanner(System.in);
		Integer inputNumber = input.nextInt();
		Integer prvi = 0;
		

		while (!isPrimeEfficient(inputNumber)) {
			for (int i = 2; i <= inputNumber; i++) {
				if (inputNumber % i == 0 && isPrimeEfficient(i)) {
					prvi = i;
					System.out.println(prvi);
				}	
			}
			break;
		}

	}

	public static boolean isPrimeEfficient(int num) {
		if (num == 0 || num == 1) {
			return false;
		}

		if (num == 2) {
			return true;
		}

		if (num % 2 == 0) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
