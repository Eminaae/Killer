package vjezbeS06D04;

public class Task2 {

	public static void printEverySecondNumber(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		printEverySecondNumber(n - 2);
	}

	public static void main(String[] args) {
		printEverySecondNumber(10);

	}

}
