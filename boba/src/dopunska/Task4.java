package dopunska;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task4 {
	
	public static final Integer VALUE = 1;
	
	public static void main(String[] args) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		
		System.out.println("Enter n: ");
		Scanner input = new Scanner(System.in);
		Integer n = input.nextInt();

		System.out.println("Enter  key: ");
		Integer key;
		for (int i = 0; i < n; i++) {
			key = input.nextInt();
			if (map.containsKey(key)) {
				map.put(key, VALUE + 1);
			} else {
			map.put(key, VALUE);
			}
			
		}
		
		System.out.println(map);
		System.out.println(map.values());

	}

}
