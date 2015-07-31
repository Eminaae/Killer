package ba.bitcamp.week8.day3.predavanja;

import java.util.ArrayList;
import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			Random rand = new Random();
			a.add(rand.nextInt(30));
		}
		System.out.println(a.toString());
		long start = System.currentTimeMillis();
		ArrayList<Integer> b = new ArrayList<>();
		
		for(int i = a.size() - 1; i >= 0; i--){
			
			b.add(a.get(i)); //u prvoj iteraciji pokazuje na i-ti element, pa taj broj dodajemo u novi prazan niz b
			//sve dok ne prodjemo kroz cijeli niz
		}
		System.out.println(b.toString());
		System.out.println(System.currentTimeMillis() - start);
	}
}
