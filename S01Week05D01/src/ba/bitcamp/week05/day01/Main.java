package ba.bitcamp.week05.day01;

public class Main {

	public static void main(String[] args, Integer cap) {
		
		Bag b = new Bag(maxCapacity); // Napravi torbu sa kapacitetom 40 
		System.out.println(b.getMaxCapacity()); // Isprinta 40 b.add(20);
		b.add(30); // Neće dodati jer je max. 40 
		System.out.println(b.getFreeSpace()); // Isprinta 20 b.add(20);
		System.out.println(b.getCurrentCapacity(cap)); // Isprinta 40
		
	}

}
