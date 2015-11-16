package ba.bitcamp.stringbulider;

public class Main {

	public static void main(String[] args) {
		StringBuilderCamp sbc = new StringBuilderCamp ();
		
		sbc.append("ABC");
		sbc.prepend("012");
		
		System.out.println(sbc);
		

	}

}
