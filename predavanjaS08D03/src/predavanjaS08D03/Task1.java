package predavanjaS08D03;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < 10000; i++) {
			Random rand = new Random();
			a.add(rand.nextInt(5));
		}

		//System.out.println(a.toString());
		long start = System.currentTimeMillis();
		int temp = a.indexOf(2);
		while (temp != -1) {
			a.remove(temp);
			temp = a.indexOf(2);
		}
		//a.remove((Integer) 2);
		System.out.println(System.currentTimeMillis() - start);
		//System.out.println(a.toString());
	}
}
