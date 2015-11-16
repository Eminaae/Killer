package predavanjaS08D05;

public class Array2D {

	public static void main(String[] args) {
		int[][] array = { { 10, 20, 30, 40, 50 }, { 50, 40, 30, 20, 10 },
				{ 10, 20, 30, 40, 50 }, { 50, 40, 30, 20, 10 } };
		
		System.out.println("*******2DArray*******");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				System.out.print("*" + array[i][j] + "*");
			}
			System.out.println("");
		}
	}
}
