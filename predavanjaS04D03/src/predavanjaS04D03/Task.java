package predavanjaS04D03;

public class Task {
	
	public static void print2DArray (int [][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void print1DArray (int[] array) {
		for(int el : array) {
			System.out.println(el);		
		}
	
	}
	//ne znam da li je dobro
	public static int[] getColumn (int[][] array, int column) {
		int [] oneColumn = new int [array.length];
		for (int i = 0; i < array.length; i++) {
			oneColumn [i] = 1;
		}
		return oneColumn;
	}
	public static void main(String[] args) {
		int[] array = new int [3];
		int[][] matrix = new int [4][2];
		//change(array);
		for(int el : array) {
			System.out.println(el);		
		}
		print2DArray(matrix);
		getColumn (matrix, 4);
		
	}

}
