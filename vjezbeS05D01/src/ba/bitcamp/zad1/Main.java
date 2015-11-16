package ba.bitcamp.zad1;

public class Main {

	public static void main(String[] args) {
		Bag b = new Bag (10);
		
		b.add(1);
		b.subtraction(3);
		System.out.println(b.getCurrentCapacity());
	    System.out.println(b.getFreeSpace());
	    
		
		

	}

}
