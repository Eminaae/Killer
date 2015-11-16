package vjezbeS06D04;

public class Task7 {

	public static boolean areTheSame(int[] a1, int[] a2) {
		return areTheSame(a1, a2, 0);
	}

	public static boolean areTheSame(int[] a1, int[] a2, int index) {
		if (index >= a2.length) {
			return false;
		}
		if (a1[index] == a2[index] && index == a1.length - 1) {
			return true;
		}
		index++;
		return areTheSame(a1, a2, index);
	}

	public static void main(String[] args) {
		int[] a1 = { 1, 4, 3, 2, 5 };
		int[] a2 = { 1, 4, 3, 2, 5 };

		System.out.println(areTheSame(a1, a2));
	}

}
