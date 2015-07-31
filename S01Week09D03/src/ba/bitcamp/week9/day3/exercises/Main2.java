package ba.bitcamp.week9.day3.exercises;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		Random rand = new Random();

		//Adding random numbers to the list
		for (int i = 0; i < 10; i++) {

			list.add(rand.nextInt(100));
		}
		System.out.println(list);

		// User inserts number
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int divider = in.nextInt();

		Iterator<Integer> it = list.iterator();
		long start = System.currentTimeMillis();
		while (it.hasNext()) {

			Integer num = it.next();
			if (num % divider == 0) {
				it.remove();
			}
		}
		System.out.println(list);
		System.out.println(start);
		
		long start1 = System.currentTimeMillis();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) % divider == 0)
				list.remove(i);
		}
		
		System.out.println(start1);
		System.out.println(list);
	}

}
