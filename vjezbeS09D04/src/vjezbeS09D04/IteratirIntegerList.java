package vjezbeS09D04;

import java.util.LinkedList;
import java.util.ListIterator;

public class IteratirIntegerList {

	public static void main(String[] args) {
		LinkedList <Integer> list = new LinkedList<> ();
		
		for (int i = 0; i < 20; i++) {
			list.add((int)(Math.random() * 50 + 50));
		}
		
		System.out.println(list);
		
		LinkedList <Integer> list2 = new LinkedList<> ();
		
		ListIterator<Integer> it = list.listIterator();
		
		for (int i = 0; i < list.size(); i++) {
			list2.add(it.next());
		}
		
		System.out.println(list2);
		
		
		for (int i = 0; i < list.size(); i++) {
			list2.add(it.previous());
		}
		
		System.out.println(list2);
	}

}
