/*
 * Odredi da li moze biti binarni broj
 * Napisati metodu koja prima jedan broj i odredjuje da li dati broj može biti binarni broj, tj.
 * sadrzi samo jedinice i nule. Bonus: Rjesenje bez if i petlji! Koristi try/catch block. Method name: canBeBinary
 * Parameters:int num
 * Returns: true if num can be a binary number, false otherwise
 * Examples: canBeBinary(10110) => true canBeBinary(25) => false
 * canBeBinary(-11010) => false
 */
public class Task3 {
	public static boolean canBeBinary(int number) {
		int copyOfInput = number;
		while (copyOfInput != 0) {
			if (copyOfInput % 10 > 1) {
				return false;
			}
			copyOfInput = copyOfInput / 10;
		}
		return true;
	}
	public static void main(String[] args) {
		
		System.out.println(canBeBinary(13));

	}

}
