package ba.bitcamp.week8.day3.predavanja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task05 {

	public static void main(String[] args) {

		ArrayList<String> a= new ArrayList(Arrays.asList("this", "is","lots","of", "fun", "for", "every","java","programmer"));
		
		System.out.println(a.toString());
	
		ArrayList<String> b = new ArrayList<>(); //an empty list
		
		for (int i = 0; i < a.size(); i++) {
			String temp = a.get(i); //uzimamo rijec koja nam treba, to se spasi u temp
			if(temp.length() ==4){
				b.add("****");
			}
				b.add(temp);
			}
			System.out.println(b.toString());
		}	
	}

