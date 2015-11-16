package predavanjaS08D03;

import java.util.ArrayList;
import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			Random rand = new Random();
			a.add(rand.nextInt(5));
		}
		System.out.println(a.toString());
		
		for (int i = 0; i < a.size() - 1; i += 2) {
			int temp = a.get(i);
			a.set(i, a.get(i + 1));
			a.set(i + 1, temp);
			
		}
		System.out.println(a.toString());
	}

}
