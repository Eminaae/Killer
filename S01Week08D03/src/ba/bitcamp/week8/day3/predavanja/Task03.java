package ba.bitcamp.week8.day3.predavanja;

import java.util.ArrayList;
import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		ArrayList <Integer> a = new ArrayList <Integer>();

		for (int i = 0; i < 10000; i++) {
			Random rand = new Random();
			a.add(rand.nextInt(3));// brisemo svaki treci element
		}
		long start = System.currentTimeMillis(); // trenutno vrijeme
		//System.out.println(a.toString()); // initial array list
		int temp = a.indexOf(2); //pretrazuje listu i vracapoziciju na kojoj se nalazi 2, index
		while (temp != -1) {
			a.remove(temp); //obrisi 2 sa mjesta na kojem si nasao 2
			temp = a.indexOf(2); //nadji narednu 2, ako nema dobijemo -1, kraj petlje
		}
		
		System.out.println(System.currentTimeMillis() - start); // new array list after removing


	}

}
