package ba.bitcamp.week4;

import java.util.Scanner;

public class Arrays2D {

	public static void main(String[] args) {
		int[][] arr2 = new int[3][3];
		Scanner input = new Scanner (System.in);
		//	pristupanje elementu iz 2D niza
		//	System.out.println(arr2 [0][0]);
		//	vrijednost u elementu u nizu
		//arr2 [0][0] = 12;
		//System.out.println(arr2 [0][0]);
		
		/*for (int i =0; i < 3; i ++){
			for (int j = 0; j < 3; j++){
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
			}
		*/
		
		// Unosenje elemenata u niz (po redovima)
		
	/*	for (int i =0; i < arr2.length; i ++){
			for (int j = 0; j < arr2[i].length; j++){
				arr2 [i][j] = input.nextInt();
			}
		}
		
		*/
	/*	for (int i =0; i < arr2.length; i ++){
			for (int j = 0; j < arr2[i].length; j++){
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		*/
		for (int i =0; i < arr2.length; i ++){
			for(int val: arr2 [i]){
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}
		
}


