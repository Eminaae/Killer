package vjezbeS12D04;

import java.math.BigInteger;

public class RSA1 {
	
	

	public static void main(String[] args) {

		BigInteger num = new BigInteger("7842947251");

		for (int i = 2; num.divide(BigInteger.valueOf(2)).compareTo(
				BigInteger.valueOf(i)) > 0; i++) {

			if (num.mod(BigInteger.valueOf(i)) == BigInteger.valueOf(0)) {
				System.out
						.println(i + "\n" + num.divide(BigInteger.valueOf(i)));

				break;
			}
		}
	}

}
