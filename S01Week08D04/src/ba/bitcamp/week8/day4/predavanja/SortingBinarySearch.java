package ba.bitcamp.week8.day4.predavanja;

import java.util.Arrays;
import java.util.Random;

public class SortingBinarySearch {
	/**
	 * Searches for position of value in the given array
	 * @param a
	 * @param value
	 * @return
	 */
	
	public static int BinarySearch(int [] a, int value){
		int min = 0;
		int max = a.length - 1;
		
		while(max >= min){
		int mid = (min + max) / 2;
		if(a[mid] == value){
			return mid;
		}else if (a[mid] > value){ //value is on the left side
				max = mid -1;
					}else {//value is on the right
				min = mid + 1;
				}
			
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int[] array = new int[10];
		Random rnd = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(3 * array.length);

		}
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(BinarySearch(array, 26));
	}

}
