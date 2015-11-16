package vjezbeS06D04;

public class Task3 {

	public static int getSum(int n) {
		if (n == 1) {
			return n;
		}

		return n + getSum(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(getSum(100));

	}

}
