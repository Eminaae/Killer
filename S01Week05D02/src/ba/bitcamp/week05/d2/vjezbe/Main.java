package ba.bitcamp.week05.d2.vjezbe;

public class Main {

	public static void main(String[] args) {
		
		Temperature t = new Temperature(0);
		System.out.println(t.getTemperatureInK());
		System.out.println(t.getTemperatureInF());
		
		Glass g = new Glass("Water", 80, 70);
		System.out.println(g.getCurrentCapacity());
		
		System.out.println(g.getMaxCapacity());
		System.out.println(g.getTypeOfLiquid());
		g.addTypeOfLiquid("Soda", 60);

	}

}
