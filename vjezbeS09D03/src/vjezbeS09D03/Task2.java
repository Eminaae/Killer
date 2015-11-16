package vjezbeS09D03;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		for (int i = 0; i < 100000; i++) {
			list.add((int)(Math.random() * 99 + 1));
		}
		
		System.out.print("Enter number: ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		long t1 = System.currentTimeMillis();
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer n = it.next();
			
			if (n % number == 0) {
				it.remove();
			}
		}
		
		System.out.println(list);
		System.out.println(System.currentTimeMillis() - t1);
		in.close();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % number == 0) {
				list.remove(i);
			}
		}
		
		System.out.println(list);
		System.out.println(System.currentTimeMillis() - t1);
	}
}
