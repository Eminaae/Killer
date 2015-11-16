package dopunska;

import java.awt.Point;
import java.util.HashSet;
import java.util.Iterator;

public class Example1 {

	/*
	 * Map Set List Stack Queue (Priority)
	 */

	public static void main(String[] args) {
		// ArrayList<Integer> list1 = new ArrayList<Integer>();
		// LinkedList<Integer> list2 = new LinkedList<Integer>();
		// TreeSet<Integer> set1 = new TreeSet<Integer>();
		// HashSet<Integer> set2 = new HashSet<Integer>();
		// HashMap<Integer, Integer> map1 = new HashMap();
		// TreeMap<Integer, Integer> map2 = new TreeMap();
		// Stack<Integer> stack = new Stack();
		// PriorityQueue<Integer> queue = new PriorityQueue();
		//

		// TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>(){
		// //ako zelimo da poredamo brojeve od najveceg do najmanjeg moramo
		// koristiit comarator,
		// //jer inace on sortira od najmanjeg do najveceg
		// @Override
		// public int compare(Integer o1, Integer o2) {
		// return o2 - o1;
		// }
		//
		// });
		//
		//
		// set.add(5);
		// set.add(1);
		// set.add(3);
		//
		// System.out.println(set);

		HashSet<Point> set = new HashSet<>();

		set.add(new Point(5, 0));
		set.add(new Point(0, 0));
		set.add(new Point(3, 2));
		set.add(new Point(-5, -5));

		// set.get(0); nema Gettera!!!
		// set.set(0, new Ponit(1, 1)); Nema settera!!!

		Iterator<Point> it = set.iterator();
		int counter = 0;
		while (it.hasNext()) {
			counter++;
			Point p = it.next();
	
			if (counter % 2 == 0) {
				System.out.println(p.x + " " + p.y);
			}

		}

		System.out.println(set);

	}

}
