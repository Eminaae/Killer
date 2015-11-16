package predavanjaS09D03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ColectionUtils {
	
	public static void printStrings (Collection <String> strings) {
		Iterator<String> iter = strings.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	public static void printStringsRow (Collection  coll) {
		Iterator<?> iter = coll.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	public static String maxString (Collection<String> strings) {
		Iterator<String> iter = strings.iterator();
		String max = null;
		String current = iter.next();
		while (iter.hasNext() || max.compareTo(current) < 0) {
			if (max == null) {
				max = current;
			} 
		}
		return max;
	}
	
//	public static <T  extends Comparable T> maxElement (Collection<T> strings) {
//		Iterator<?> iter = strings.iterator();
//		Object max = null;
//		Object current = iter.next();
//		while (iter.hasNext() || max.compareTo(current) < 0) {
//			if (max == null) {
//				max = current;
//			} 
//		}
//		return max;
//	}
//	
	
	public static <T extends Comparable <T>> T withoutNulls (Collection<T> c) {
		
	}
	
	public static void main(String[] args) {
		ArrayList<String> testStrings = new ArrayList<String>(); 
		testStrings.add("ABC");
		testStrings.add("XYZ");
		
		printStrings(testStrings);
		printStringsRow(testStrings);
		
		String max = maxString(testStrings);
		
		System.out.println("\nMax: " + max);
	}

}
