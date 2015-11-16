package vjezbes02d01;

//Program koji sadrzi pozitivni cijeli broj n. Ispisati na konzolu n!.

public class Factorial {

	public static void main(String[] args) {
		long n = 350;
		long n1 = n / 100;
		long n2 = n / 10;
		long num = 1;
		long factorial = 1;
		long residuum = 0;

		for (int i = 1; i <= n2; i++) {
			while (num < n1) {
				num++;
				factorial = factorial * num;
			}
			residuum += factorial;
			
		}System.out.println(residuum);
	}

}
