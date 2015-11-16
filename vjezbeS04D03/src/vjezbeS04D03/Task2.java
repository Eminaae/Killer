package vjezbeS04D03;

/*
 * Koristeci TextIO klasu, ucitati jednu matricu iz datoteke. Prva linija datoteke sadrzi brojeve N i M  sto oznacavaju broj redova i kolona 
 * matrice. Zatim u sljedecih N redova nalazi se M brojeva sto predstavlja elemente matrice. Isprintati datu matricu na ekran.
 */
public class Task2 {

	public static void main(String[] args) {
		//reading from file
		TextIO.readFile("src/vjezbeS04D03/numbers.txt");
		int n = TextIO.getInt();
		int m = TextIO.getInt();
		
		int[][] matrix = new int[n][m];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = TextIO.getInt();
			}
		}
		//printig matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
