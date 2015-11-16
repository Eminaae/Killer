package dopunska;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task3 {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new TreeMap<>();
		ArrayList<Integer> list = new ArrayList();

		System.out.println("Enter n: ");
		Scanner input = new Scanner(System.in);
		Integer n = input.nextInt();

		System.out.println("Enter  key: ");
		System.out.println("Enter value: ");
		int counter1 = 0;
		
		for (int i = 0; i < n; i++) {
			Integer key = input.nextInt();
			map.put(key, input.nextInt());
			list.add(map.get(key));
			if (map.get(key) == map.get(key + 1)) {
				counter1++;
			}
		}
		
		System.out.println(counter1);

		Iterator<Integer> it = list.iterator();
		Integer value = 0;
		int counter = 0;
		while (it.hasNext()) {
			value = it.next();
			if (value == it.next()) {
				counter++;
			}
		}

		System.out.println(map);
		System.out.println(list);
		System.out.println("Number: " + value + " repets: " + counter);
	}

}
