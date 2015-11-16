package vjezbeS08D03;

import java.util.Arrays;

public class Shifting {

	public static char[] shift(char[] array) {
		
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];	
		}

		return array;
	}

	public static void main(String[] args) {
		char[] array = new char[] { 'A', 'B', 'C', 'D' };
		System.out.println(Arrays.toString(shift(array)));

	}

}
