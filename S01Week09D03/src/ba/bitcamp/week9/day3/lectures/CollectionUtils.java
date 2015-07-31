package ba.bitcamp.week9.day3.lectures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionUtils {

	public static void printStrings(Collection<String> strings){
		Iterator<String> iter = strings.iterator();
		while(iter.hasNext()){
			System.out.println(iter.hasNext());
		}
	}
	
	public static void main(String[] args){
		ArrayList<String> testStrnigs = new ArrayList<String>();
		CollectionUtils.printStrings(testStrnigs);
	}
	
	public static String maxElementRaw(Collection<?> strings){
		Iterator<?> iter = strings.iterator();
		String max = null;
		Object current = iter.next();
		return max;
		
	}
}
