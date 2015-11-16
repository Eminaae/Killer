package vjezbeS04D03;

//import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
	public static void main (String[] args) {
		
		int[][] arr2 = new int[3][3];
		
		//System.out.println(arr2[0][0]); sta je na toj poziciji stampa
		arr2[0][0] = 12; //dodijeljije vrijednost
		
		//upis elemenata
		Scanner input = new Scanner (System.in);
		for (int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2 [i][j] = input.nextInt();
			}
			
			}

		
		//ispis elemenata
//		for (int i = 0; i < arr2.length; i++) {
//			//System.out.println(Arrays.toString(arr2[i])); moze i ovako
//			for(int j = 0; j < arr2[i].length; j++) {
//				System.out.print(arr2[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		//preko for each
		for(int i = 0; i < arr2.length; i++) {
			for(int val : arr2[i]) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
			
	}

}
