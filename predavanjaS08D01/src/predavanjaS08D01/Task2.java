package predavanjaS08D01;

public class Task2 {
	
	public static boolean met2 (String s) {
		int[] signs = new int [255];
		for (int i = 0; i < s.length(); i++) {
			signs[s.charAt(i)]++;
			if (signs[i] != 1) {
				return false;
			}
		}
		return true;
		
	}
	
	
	public static boolean met1(String s1 , String s2 ) {
		if (s1.length() != s2.length()) {
			return false;
		}
		s1.toLowerCase();
		s2.toLowerCase();
		int[] signs = new int[255];
		for (int i = 0; i < s1.length(); i++) {
			signs[s1.charAt(i)]++;
			signs[s2.charAt(i)]--;
			}
		for (int i = 0; i < signs.length; i++) {
			if (signs[i] != 0) {
				return false;
			}
		}
		 return true;
	}
	

	public static void main(String[] args) {
		System.out.println(met1("abc", "cab"));

	}

}
