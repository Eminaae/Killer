package ba.bitcamp.week8.day3.predavanja;

import java.util.ArrayList;
import java.util.Random;

public class Task01 {

	public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<Integer>();
	
	for(int i = 0; i < 10; i++ ){
		Random rand = new Random();
		a.add(rand.nextInt(5));//raspon 3 puta veci od duzine niza, vraca broj u rasponu od 0 do 300 ne ukljucujuci 300 rand.nextInt(300)
	} 
	System.out.println(a.toString()); //initial array list
	
	a.remove((Integer)2); //Casting
	System.out.println(a.toString()); //new array list after removing
		
	}

}
