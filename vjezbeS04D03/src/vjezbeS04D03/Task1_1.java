package vjezbeS04D03;
/*
 * Napisati program u kojem se napravi 2D niz od 3 reda i 3 kolone. Isprintati taj niz na ekran (trebaju biti sve nule).
 */
public class Task1_1 {

	public static void main(String[] args) {
		int[][] array = new int [3][3];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
