package vjezbeS10D01;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayList {
	private static Collection[] array;
	
	public MyArrayList(int n) {
		array = new Collection [n];
	}
	
	public static <T> void addLast (T value) {
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length] = (Collection<?>) value;
	}
	
	public static <T> void addFirst (T value) {
		array = Arrays.copyOf(array, array.length + 1);
		array[0] = (Collection<?>) value;
	}
	
	public void remove () {
		
	}
	

}
