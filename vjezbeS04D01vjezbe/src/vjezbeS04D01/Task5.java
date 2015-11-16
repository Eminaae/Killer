package vjezbeS04D01;

/*
 * Napisati tri metode koje se zovu getMax. Prva metoda prima dva parametra tipa double i odredjuje koji dati parametar je veci. Druga metoda prima niz tipa int i odredjuje koji je 
 * element najveci. Treca  metoda prima niz tipa double i odredjuje koji je najveci. Sve tri metode se moraju zvati getMax (princip overloading metoda). Sve exception-e sanirati!
 * Drugi dio zadatka trazi od vas da koristite args parametre koji ce biti ulaz za treću getMax metodu i ispisuje na konzolu koji je najveci dati broj.
 * Napisati javadoc za ove metode! Potreban je opis i doc tag-ovi za parametre, return i exception-e. Zapakovati program u jar file i pokrenuti ga preko command line-a.
 */
public class Task5 {

	public static void main(String[] args) {
		System.out.println("Max of two double numbers is: " + getMax(2, 5));
		try {
			int arr[] = new int[args.length];
			for (int i = 0; i < args.length; i++) {
				arr[i] = Integer.parseInt(args[i]);
			}
			System.out.println("Max array element is :" + getMax(arr));
		} catch (NumberFormatException ex) {
			System.out.println("NumberFormatException");
		}

		try {
			double arr1[] = new double[args.length];
			for (int i = 0; i < args.length; i++) {
				arr1[i] = Integer.parseInt(args[i]);
			}
			System.out.println("Max array element is :" + getMax(arr1));
		} catch (NumberFormatException ex) {
			System.out.println("NumberFormatException");
		}

	}

	/**
	 * Max of two double numbers
	 * 
	 * @param num1
	 *            - first double number
	 * @param num2
	 *            - second double number
	 * @return - max of two numbers
	 */
	public static double getMax(double num1, double num2) {
		return Math.max(num1, num2);
	}

	/**
	 * Max integer array element
	 * 
	 * @param arr
	 *            - integer array
	 * @return - max array element
	 * @throws - IllegalArgumentException
	 */
	public static int getMax(int[] arr) {
		if (arr.length == 0) {
			throw new IllegalArgumentException(
					"You need at least one argument.");
		}
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	/**
	 * Max double aaray element
	 * 
	 * @param arr1
	 *            - double array
	 * @return -max array element
	 * @throws - IllegalArgumentException
	 */
	public static double getMax(double[] arr1) {
		if (arr1.length == 0) {
			throw new IllegalArgumentException(
					"You need at least one argument.");
		}
		double max = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > max) {
				max = arr1[i];
			}
		}
		return max;

	}

}
