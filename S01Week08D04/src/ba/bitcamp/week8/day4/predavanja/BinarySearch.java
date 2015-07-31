package ba.bitcamp.week8.day4.predavanja;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
	
	private static int binarySearch(int [] array, int n){
		int lowest = 0;
		int highest = array.length -1;
		
		while(highest >= lowest){
			int middle = (lowest + highest)/2;
			if(array[middle] ==n){
				return middle;
			}else if(array[middle] > n){
				highest = middle -1;
			}else{
				lowest = middle +1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arraySize = 10;
		int[] array = new int[10];
		Random rnd = new Random();

		for (int i = 0; i < arraySize; i++) {
			array[i] = rnd.nextInt(3 * arraySize);

		}
		System.out.println(Arrays.toString(array));
		System.out.println(binarySearch(array, 26));
	}
}
