package dopunska;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return o2 - o1;
			}

		});

		System.out.println("Enter n: ");
		Scanner input = new Scanner(System.in);
		Integer n = input.nextInt();

		System.out.println("Enter " + n + " numbers: ");

		for (int i = 0; i < n; i++) {
			set.add(input.nextInt());
		}

		System.out.println(set);

	}

}
