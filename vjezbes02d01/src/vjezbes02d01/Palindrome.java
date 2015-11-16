package vjezbes02d01;

//Program koji ispisuje na ekran da li je dati pozitivni cijeli broj n palindrom. Palindrom je broj koji ima istu vrijednost gledajući ga sa desne i sa lijeve
//strane, npr. 1221, 959, 111 i 10501.

public class Palindrome {

	public static void main(String[] args) {

		int num = 101;
		int n = num;
		int reverse = 0;

		while (num != 0) {
			int remainder = num % 10;
			num = num / 10;
			reverse = reverse * 10 + remainder;
		}
		if (n == reverse) {

			System.out.println("palindrom");
		} else {
			System.out.println("nije palindrom");
		}

		// System.out.println(n);
		// System.out.println(reverse);

	}
}
