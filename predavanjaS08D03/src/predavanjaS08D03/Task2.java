package predavanjaS08D03;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			Random rand = new Random();
			a.add(rand.nextInt(5));
		}
		System.out.println(a.toString());
		
		for (int i = a.size() - 1; i >= 0; i--) {
			b.add(a.get(i));

		}
		System.out.println(b.toString());

	}

}
