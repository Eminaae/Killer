package ba.bitcamp.task2;

public class Main {

	public static void main(String[] args) {
		
		Glass g1 = new Glass (5);
		
		System.out.println(g1.toString());
		
		g1.setGlass("voda", 2);
		System.out.println(g1.toString());
		
		System.out.println("Maksimalni kapacitet je: " + g1.getMaxCapacity());
		
		System.out.println("Trenutni kapacitet je: " + g1.getCurrentCapacity());
		
		g1.addLiquid("voda", 2);
		System.out.println(g1.toString());
		
		g1.addLiquid("voda", 6);
		System.out.println(g1.toString());
		
		g1.addLiquid("sok", 1);
		
		g1.emptyGlass();
		System.out.println(g1.toString());

	

	}

}
