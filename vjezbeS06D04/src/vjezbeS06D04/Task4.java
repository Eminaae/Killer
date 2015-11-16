package vjezbeS06D04;

public class Task4 {

	public static int getFibonaciNumber(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 1;
		}
		return (getFibonaciNumber(n - 1) + getFibonaciNumber(n - 2));

	}

	public static void main(String[] args) {
		System.out.println(getFibonaciNumber(9));

	}

}
