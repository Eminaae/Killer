package vjezbeS08D03;

public class IntegerToDay {
	
	public static String intToDay (int n) {
		String s1 = "";
		String[] s = new String[]{"Monady", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		try {
	     s1 += s[n -1];
		
		} catch (IndexOutOfBoundsException e){
			System.out.println("Out of limit!");
		};
		return s1;
		
//		String s = "";
//		ArrayList<String> list = new ArrayList<>();
//		list.add("");
//		list.add("Monady");
//		list.add("Tuesday");
//		list.add("Wednesday");
//		list.add("Thursday");
//		list.add("Friday");
//		list.add("Saturday");
//		list.add("Sunday");
//		
//		s += list.get(n);
//		return s;
	}
	
	public static void main(String[] args) {
		System.out.println(intToDay(10));

	}

}
