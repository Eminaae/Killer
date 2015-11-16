package predavanjaS03D05;

public class Task1 {
	public static String threeNPlusOne(int n) {
		String str = n + "";

		while (n != 1) {
			if (n % 2 == 0) {
				n = 3 * n + 1;
				str += " , " + n;
			} else {
				n = n / 2;
				str += " , " + n;
			}
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(threeNPlusOne(5));

	}

}
