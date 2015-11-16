package vjezbeS04D03;

/*
 * Napraviti metodu koja ispunjaje Minesweeper tablicu. Metoda prima 2D int niz gdje −1 predstavlja minu. Potrebno je ispuniti ostala polja 
 * odgovarajucim vrijednostima. Broj na jednom polju tablice oznacava koliko mina ima okolo toga polja, tj. 8 polja okolo. Ukoliko se na polju
 * nalazi broj 2, to znaci da imaju tacno dvije mine negdje okolo tog polja.
 */
public class Task3 {

	// public static void minesweeper(int[][] array) {

	public static void main(String[] args) {
		int array[][] = { { 0, 0, 0, 0, 0, -1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, -1, 0, 0, 0, 0, -1 },
				{ 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, -1, 0, -1 },
				{ 0, 0, 0, 0, -1, -1, 0, 0 }, { 0, -1, 0, 0, 0, 0, -1, 0 },
				{ 0, 0, 0, 0, -1, 0, 0, 0 } };


		int[][] arrayMine = new int[array.length][array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				if (array[i][j] == -1) {
					
					try {
						if (arrayMine[i][j - 1] != -1) {
							arrayMine[i][j - 1]++;
						}
					} catch (ArrayIndexOutOfBoundsException ex) {

					}
					try {
						if (arrayMine[i][j + 1] != -1) {
							arrayMine[i][j + 1]++;
						}
					} catch (ArrayIndexOutOfBoundsException ex) {

					}
					try {
						if (arrayMine[i + 1][j - 1] != -1) {
							arrayMine[i + 1][j - 1]++;
						}
					} catch (ArrayIndexOutOfBoundsException ex) {

					}
					try {
						if (arrayMine[i - 1][j + 1] != -1) {
							arrayMine[i - 1][j + 1]++;
						}
					} catch (ArrayIndexOutOfBoundsException ex) {

					}
					try {
						if (arrayMine[i - 1][j] != -1) {
							arrayMine[i - 1][j]++;
						}
					} catch (ArrayIndexOutOfBoundsException ex) {

					}
					try {
						if (arrayMine[i + 1][j] != -1) {
							arrayMine[i + 1][j]++;
						}
					} catch (ArrayIndexOutOfBoundsException ex) {

					}
					try {
						if (arrayMine[i + 1][j + 1] != -1) {
							arrayMine[i + 1][j + 1]++;
						}
					} catch (ArrayIndexOutOfBoundsException ex) {

					}
					try {
						if (arrayMine[i - 1][j - 1] != -1) {
							arrayMine[i - 1][j - 1]++;
						}
					} catch (ArrayIndexOutOfBoundsException ex) {

					}
					arrayMine[i][j] = -1;
				} 

			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%3d", arrayMine[i][j]);
			}
			System.out.println();
		}
	}

}
