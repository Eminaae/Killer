package ba.bitcamp.week8.day1.predavanja;

public class Task1 {

	// char[] signs = new char[255];
	// signs[scharAt(i)]++;
	// Are all characters in the string different
	private static boolean compareElements(String s) {

		for (int i = 0; i < s.length(); i++) {
			String sub = s.substring(i + 1);

			for (int j = 0; j < sub.length(); i++) {
				if (s.charAt(i) == sub.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	// Da li je jedan string permutacija drugog

	public static boolean isPermutation(String a, String b) {
	    if (a.length() != b.length()) {
	        return false;
	    }

	    int[] signs = new int[256];
	    for (int i = 0; i < a.length(); ++i) {
	        ++signs[a.toLowerCase().charAt(i)];
	    }

	    for (int i = 0; i < b.length(); ++i) {
	        if (--signs[b.toLowerCase().charAt(i)] < 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	

	public static void main(String[] args) {

		System.out.println(compareElements("zzzzzz"));
		System.out.println(isPermutation("Bcaccc", "abcccc"));

	}

}
