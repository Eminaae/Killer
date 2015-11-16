public class Task3 {
	/**
	 * Write a program that will print any three-digit numbers that are prime,
	 * starting from 101 .. Prime number is a number that is divisible only by
	 * the number one and with themselves, for example. 5, 13, and 17th
	 * 
	 */
	public static void main(String[] args) {
        
		boolean prime = true;
		for (int i = 101; i < 1000; i++) {
			    prime = true;

				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						prime = false;
						break;
					}
				}
					if (prime == true) {
						System.out.println(i);
					}

		}

	}

}
