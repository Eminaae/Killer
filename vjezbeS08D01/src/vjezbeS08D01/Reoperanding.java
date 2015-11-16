package vjezbeS08D01;

import java.util.Arrays;

public class Reoperanding {
	
	public static int[] reoperanding(int[] array) {
		int [] array1 = new int[array.length];
		
		for (int element : array) {
			if (element % 2 == 0) {	
				for (int el: array) {
					array1 = array;
				}
			}
		}
		return array1;
	}

	public static void main(String[] args) {
		int[] array = new int[] {1, 1, 9, 9, 1, 5, 2, 4};
		System.out.println(Arrays.toString(reoperanding(array)));


	}

}
