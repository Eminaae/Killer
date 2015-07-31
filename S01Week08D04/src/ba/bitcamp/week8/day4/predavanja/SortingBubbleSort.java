package ba.bitcamp.week8.day4.predavanja;

import java.util.Arrays;
import java.util.Random;

public class SortingBubbleSort {

	public static void main(String[] args) {
		int arraySize = 10;
		int[] array = new int [10];
		Random rnd = new Random();
		
		for(int i = 0; i < arraySize; i++){
			array[i] = rnd.nextInt(3*arraySize); //puni niz brojevima od 0 do 30
		}
		//Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		//for(int j = 0; j < arraySize; j++){
		long start = System.currentTimeMillis();
		boolean sorted = false; //pretpostavka, da bismo usli u while loop
		while(!sorted){
		for(int i = 0; i < arraySize - 1; i++){
			sorted = true; //kad udje u if rusi nam nasu pretpostavku
			if(array[i] > array[i + 1]){
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
				sorted = false;
			}
		}
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(System.currentTimeMillis()-start);
	}
}