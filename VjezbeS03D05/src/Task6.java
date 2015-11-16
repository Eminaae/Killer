import java.util.Arrays;

/*
 * Napisati metodu koja prima jedan cijeli broj 𝑁 i 𝑀. Iz metode vratiti niz dužine 10, i ispunjen brojevima 𝑀 od indeksa 𝑁. Pored toga, metoda mora throw-ati exception ako indeks 
 * ne valja.
 * Metoda:int[] getArray(int n, int m) Primjeri
 * getArray(2, 1)
 * getArray(0, 5)
 * getArray(10, 2)  IndexOutOfBoundsException
 * getArray(-1, 3)  IndexOutOfBoundsException
 */
public class Task6 {
	public static int[] getArray(int n, int m) {
		int arr[] = new int[10];
		for (int i = n; i < 10; i++) {
			try {
				if (n < 0 || n > m) {
					throw new ArrayIndexOutOfBoundsException();
				}
			} catch (ArrayIndexOutOfBoundsException ex) {
				ex.printStackTrace();
				System.out.println("ArrayIndexOutOfBoundsException je uhvacen!");
			}
			arr[i] = m;
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getArray(1, 3)));

	}

}
