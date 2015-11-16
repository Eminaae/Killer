package vjezbeS09D04;

import java.util.HashSet;
import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		System.out.println("Enter letters: ");
		Scanner in =  new Scanner(System.in);
		
		HashSet<Character> hset = new HashSet<>();
	
		String word = "";
		
		while (!word.equals("end")) {
			for (int i = 0; i < word.length(); i++) {
				hset.add(word.charAt(i));
			}
			word = in.next();
		}

		System.out.println(hset);
		
		System.out.println(hset.size());
		
		
		in.close();
	}

}
