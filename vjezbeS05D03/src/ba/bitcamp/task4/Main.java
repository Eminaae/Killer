package ba.bitcamp.task4;

public class Main {

	public static void main(String[] args) {
		
		Display d  = new Display ("Sony", 50);
		System.out.println(d);
		
		System.out.println("Battery state is: " + d.getBatteryState());
		d.turnOn();
		System.out.println(d);
		d.reduceDisplayPower();
		System.out.println(d);
		d.increaseDisplayPower();
		d.increaseDisplayPower();
		System.out.println(d);

	}

}
