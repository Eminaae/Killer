package vjezbeS08D01;

public class Repetitions {

	public static int numberOfN(int n, int... array) {
		int counter = 0;
		for (int element : array) {
			if (element == n) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 3 };
		System.out.println(numberOfN(3, array));
	}

}
