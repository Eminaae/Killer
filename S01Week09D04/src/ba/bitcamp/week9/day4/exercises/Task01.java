package ba.bitcamp.week9.day4.exercises;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Task01 {

	public static void main(String[] args) {

		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();

		Random rnd = new Random();

		for (int i = 0; i < 20; i++) {
			list1.add(rnd.nextInt(100));
		}
		System.out.println(list1);

		ListIterator<Integer> it = list1.listIterator();
		while (it.hasNext()) {
			list2.add(it.next());

		}
		while (it.hasPrevious()) {
			list2.add(it.previous());
		}
		System.out.print(list2);
	}

}
