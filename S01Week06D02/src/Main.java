
public class Main {

	public static void main(String[] args) {
		Computer c= new Computer() {
		};
		
		System.out.println(c.getMac());
		System.out.println(c.getName());
		
		Server s = new Server("10:20:55:23:89", null, 25){};
		System.out.println(s);
	}

}
