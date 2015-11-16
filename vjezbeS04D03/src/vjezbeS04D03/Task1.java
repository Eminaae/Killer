package vjezbeS04D03;
/*
 * Napisati metodu koja prima jedan 2D niz, u vidu kvadratne matrice 3𝑥3, i vraća da li je data matrica singularna, tj. da li je determinanta
 * te matrica 0. Napisati javadoc za ovu metodu! Determinanta matrice se moze računati na razne načine. Jedan od načina je sljedeci:
 * Metoda:boolean isSingular(int[][] matrix)
 */
public class Task1 {
	/**
	 * Checking is matrix singular, matrix is singular if determinate sum is zero 
	 * @param matrix - matrix
	 * @return - boolean true or false
	 */
	public static boolean isSingular (int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				//sum matrix elements
				sum = matrix[0][0] * matrix[1][1] * matrix[2][2] +
					matrix[0][1] * matrix[1][2] * matrix[2][0] +
					matrix[0][2] * matrix[1][0] * matrix[2][1] -
					matrix[0][2] * matrix[1][1] * matrix[2][0]-
					matrix[0][1] * matrix[1][0] * matrix[2][2] -
					matrix[0][0] * matrix[1][2] * matrix[2][1];
			}
		}
		//chackig is singular
		if (sum == 0) {
			return true;
		} 
		return false;
	}

	public static void main(String[] args) {
		int[][] matrix = {{2, 1, 1}, {-1, -1, 0}, {1, 0, 1}};
		System.out.println("Is matrix singular: " + isSingular(matrix));
	}

}
