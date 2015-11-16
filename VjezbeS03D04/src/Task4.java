/*
 * Generisi mi random broj u datom intervalu
 * Napisati metodu koja prima dva parametra, koja odredjuju opseg, i neka metoda vrati nasumicno generisan broj koji odgovara tom opsegu. Ukoliko nema brojeva u opsegu onda vracati 
 * samo −1.
 * Method name: getRandomNumber
 * Parameters:int min, int max
 * Returns: a random() number between min and max, inclusively
 * Examples: getRandomNumber(1, 4) => 1, 2, 3 ili 4
 * getRandomNumber(-4, 2)=>-4, -3, -2, -1, 0, 1 ili 2 getRandomNumber(3, 0)=>-1
 */
public class Task4 {
	public static int getRandomNumber(int number1, int number2) {
		int random = (int) (Math.random() * (number2 - number1));
        if (number2 == 0 && number1 > 0) {
		return -1;
        } else {
        	return random;
        }
	}

	public static void main(String[] args) {
		System.out.println(getRandomNumber(-1, 5));
	}

}
