package ba.bitcamp.week06.day04.vjezbe;

import java.util.Arrays;

public class Task08 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		fillArray2(arr, 3);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void fillArray2(int[] array, int n){
		array[n] = n;
		fillArray2(array, n - 1, n - 1, true);
		fillArray2(array, n + 1, n - 1, false);
	}

	private static boolean fillArray2(int[] array, int left, int right, boolean b) {
		array[left] = left -1;
		array[right]= right -1;
		fillArray2(array, left-1, right-1, true);
		
		return b;	
	}

}
