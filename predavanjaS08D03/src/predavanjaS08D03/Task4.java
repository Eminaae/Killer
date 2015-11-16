package predavanjaS08D03;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programer"));
		System.out.println(a.toString());
		ArrayList <String> b = new ArrayList<String>();
		for (int i = 0; i < a.size(); i ++) {
			String temp = a.get(i);
			if (temp.length() == 4) {
				b.add("****");
				b.add(temp);
			} 
			b.add(temp);
		}
		System.out.println(b.toString());
	}

}
