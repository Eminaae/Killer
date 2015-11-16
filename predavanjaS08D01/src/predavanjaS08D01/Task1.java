package predavanjaS08D01;

public class Task1 {
	
	public static boolean met1(String params) {
		for (int i = 0; i < params.length(); i++) {
			String s = params.substring(i + 1);
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == params.charAt(i)) {
					return false;
				}
			}
		}
		 return true;
	}
	
	public static void main(String[] args) {
		System.out.println(met1("Kristina"));

	}

}
