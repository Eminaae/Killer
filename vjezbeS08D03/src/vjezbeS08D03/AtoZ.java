package vjezbeS08D03;

import java.util.Arrays;

public class AtoZ {
	
	public static void sorting (String... s) {
		Arrays.sort(s);
		for (String s1 : s) {
			System.out.print(s1 + " ");
		}
	}
	
	public static void main(String[] args) {
		String[] s = new String[] {"aba", "baba", "kada" , "wee" ,"cedevita"};
		sorting(s);

	}

}
