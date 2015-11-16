package ba.bitcamp.interface12;

public class Kristina implements Adorable, Smart{
	public void print() {
		System.out.println("Happy birthday!");
		
	}

	@Override
	public void print2(String s) {
		System.out.println("Hello " + s + "!");
		
	}



}
