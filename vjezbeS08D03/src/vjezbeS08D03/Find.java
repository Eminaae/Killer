package vjezbeS08D03;

import java.util.Arrays;

public class Find {
	
	public static boolean finding (String s, char c) {
		if (Arrays.binarySearch(s.toCharArray(), c) > 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String s = "neki";
		char c = 'e';
		System.out.println(finding(s, c));

	}

}
