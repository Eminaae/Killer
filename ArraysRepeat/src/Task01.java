import java.util.Scanner;

public class Task01 {

		public static void main(String[] args) {
			Scanner in = new Scanner (System.in);
			int N = in.nextInt();
			int M = in.nextInt();
			
			int[][] array = matrixRandom(N,M);
			
			for (int i = 0; i < array.length; i++){
				for (int j = 0; j < array[i].length; j++){
					System.out.printf("%5d",array[i][j]);
				}
				System.out.println();
			}

		}
		
		
		public static int[][] matrixRandom(int N, int M){
			int[][] arr = new int [N][M];
			
			for (int i= 0; i < arr.length; i++){
				for (int j = 0; j < arr[i].length; j++){
					arr[i][j] = (int)((Math.random()*6)+5);
				}
			}
			return arr;
		}
}
	
	
