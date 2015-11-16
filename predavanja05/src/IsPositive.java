

public class IsPositive {
	public static void main(String[] args) {
//		int broj = 10;
//		boolean pozitivno = broj >= 0;
//		
//		System.out.println("Da li je broj pozitivan? " + pozitivno);
		
		String prviArgument = args[0];
		int broj = Integer.parseInt(prviArgument);
		
		boolean pozitivan = broj >= 0;
		
		System.out.println("Positive: " + pozitivan);
		
	}

}
