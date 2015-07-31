package ba.bitcamp.week10.day1.task02;

import java.util.Collection;
import java.util.Iterator;

public class MyArrayList {
	
	public static <T> T getFirst(Collection<T> col){
		Iterator<T> it = col.iterator();
		return it.next();		
	}
	
	public static <T> void add(T element) {
		
	}
	
	public static <T> T get(Collection<T> index) {
		Iterator<T> it = index.iterator();
		return it.next();
		
	}
	
	
public static void main(String[] args){
	
	
}
}
