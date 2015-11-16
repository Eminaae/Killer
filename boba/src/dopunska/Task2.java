package dopunska;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		ArrayList<Integer> set = new ArrayList();

		System.out.println("Enter n: ");
		Scanner input = new Scanner(System.in);
		Integer n = input.nextInt();

		System.out.println("Enter " + n + " numbers: ");

		for (int i = 0; i < n; i++) {
			set.add(input.nextInt());
		}

		set.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}

		});
		System.out.println(set);
		int counter = 0;
		int temp = set.get(0);
		
		for (int i = 0; i < n; i++) {
		
			if (set.get(i) == set.get(0)) {
				temp = set.indexOf(i);
				counter++;
			}
		}
		
		System.out.println("Number: " + temp + " repets: " + counter);

	}

}
