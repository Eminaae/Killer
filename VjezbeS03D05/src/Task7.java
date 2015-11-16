import java.util.Arrays;

/*
 * Napisati metodu koja prima jedan cijeli broj 𝑁 i 𝐾. Iz metode vratiti niz dužine 𝑁, i ispunjen brojevima od 1 do 𝐾. Pretpostavite da brojevi 𝑁 i 𝐾 će uvijek biti veći od 0.
 * Metoda:int[] getArray2(int n, int k) Primjeri
 * getArray2(9, 5)
 * getArray2(11, 3)
 * getArray2(5, 1)
 * getArray2(7, 100)
 */
public class Task7 {
	public static int[] getArray2(int n, int k) {

		int arr[] = new int[n];
		int counter = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = counter;
			counter++;
			if (counter > k) {
				counter = 1;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getArray2(9, 5)));

	}

}
