package predavanjaS08D01;

public class Task3 {
	
	public static boolean isSubstring (String s1, String s2) {
		s1 += s1;
		return s1.indexOf(s2) > -1;
		
	}

	public static void main(String[] args) {
		System.out.println(isSubstring("vozdra", "zdrav"));

	}

}
