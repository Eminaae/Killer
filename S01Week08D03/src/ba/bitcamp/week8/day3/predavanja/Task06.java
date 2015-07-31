package ba.bitcamp.week8.day3.predavanja;

import java.util.ArrayList;
import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();

		for (int i = 0; i < 11; i++) {
			Random rand = new Random();
			a.add(rand.nextInt(30));
		}
		System.out.println(a.toString());
		//long start = System.currentTimeMillis();
		ArrayList<Integer> b = new ArrayList<>();
		
		for(int i = 0; i < a.size() - 1; i += 2){
			int temp = a.get(i);
			a.set(i, a.get(i + 1));
			a.set(i + 1, temp);
			}
		
		System.out.println(a.toString());
		//System.out.println(System.currentTimeMillis() - start);
	}
}
