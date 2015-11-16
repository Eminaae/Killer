package vjezbeS04D04;

/*
 * grades.in – Datoteka koja sadrzi matricu ocjena
 * Prvi red odgovara ocjenama prvog ucenika, drugi drugog, itd.
 * Prvi broj u prvom redu odgovara ocjeni iz prvog predmeta iz courses.in za prvog ucenika
 * Drugi broj u prvom redu odgovara ocjeni iz drugog predmeta za prvog ucenika
 */
public class Task3 {

	public static int[][] returnGrades() {
		TextIO.readFile("src/vjezbeS04D04/grades.in");
		int n = TextIO.getInt();
		int m = TextIO.getInt();

		int[][] gradesArray = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				gradesArray[i][j] = TextIO.getInt();
				System.out.print(gradesArray[i][j] + " ");
			}
			System.out.println();
		}
		return gradesArray;
	}

	public static void main(String[] args) {
		returnGrades();

	}

}
