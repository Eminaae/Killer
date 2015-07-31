package ba.bitcamp.week9.day4.exercises;

import java.util.Scanner;
import java.util.TreeSet;

public class Task02 {
	
	
	public static void main(String[] args){
		
		TreeSet<Character> ts = new TreeSet<Character>();
				
		Scanner in = new Scanner(System.in);
		
		String word = "";
		while(!word.equals("end")){
			System.out.println("Enter one word: ");
			word = in.next();
			for (int i = 0; i < word.length(); i++) {
				ts.add(word.charAt(i));
			}
		}
		
		System.out.println(ts);
		System.out.println(ts.size());
	}

}
