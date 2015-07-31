package ba.bitcamp.week8.day3.vjezbe;

import java.util.Arrays;

/**
 * Shifting an array
 * @author emina.arapcic
 *
 */
public class Task02 {
	
	public static void main(String[] args) throws IndexOutOfBoundsException{
		char[] arr = {'a', 'b', 'c', 'd'};
		System.out.println(Arrays.toString(arr));
		System.arraycopy(arr, 0, arr, 1, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
	
}
