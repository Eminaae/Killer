package vjezbeS08D03;

import java.util.Arrays;

public class Partially {

	public static String[] metoda(String... s) {
		int counter1 = 0;
		int counter2 = 0;
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				counter1++;			
			}
		}
		
		String[] s1 = new String[counter1];
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				s1[counter2] = s[i];
				counter2++;
			}
		}
		return s1;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(metoda("ABC", null, "OAK123", null,
				"JAVA")));

	}

}
