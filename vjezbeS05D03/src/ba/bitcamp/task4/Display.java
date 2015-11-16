package ba.bitcamp.task4;

/*
 * Napisati klasu koja opisuje displej mobitela. Displej ima sljedece atribute:
 * Ime proizvodjaca displeja
 * Trenutnu jacinu displeja (0 – 100)
 * Da li je displej ukljucen ili ne
 * Potrosnju baterije (procenat baterije po satu)
 Napisati i sljedece metode/konstruktore:
 * Konstruktor koji inicijalizira ime proizvodjaca i potrosnju baterije 
 * Po default-u, jacina displeja je 100
 * Metode turnOn() i turnOff() koje ukljucuju i iskljucuju displej
 * Metode koje smanjuju i povecavaju jacinu displeja za 10 (ukoliko je displej ukljucen)
 * toString() metoda koja stavlja u String ime proizvodjaca displeja
 * Ukoliko je displej ukljucen onda i trenutnu jacinu signala, u suprotnom „Off“
 */
/**
 * This class reperesents mobile display
 * 
 * @author kristina.pupavac
 *
 */
public class Display {
	private String name;
	private int displayPower;
	private boolean isOn;
	private int batteryState;

	/**
	 * Default constructor display is off and display power is 100
	 * 
	 * @param name
	 * @param batteryState
	 */

	public Display(String name, int batteryState) {
		this.name = name;
		this.displayPower = 100;
		this.isOn = false;
		this.batteryState = batteryState;
	}

	/**
	 * Turn on display
	 */
	public void turnOn() {
		this.isOn = true;
	}

	/**
	 * Turn off display
	 */
	public void turnOff() {
		this.isOn = false;
	}

	/**
	 * Gets battery state
	 * 
	 * @return battery state
	 */
	public int getBatteryState() {
		return batteryState;
	}

	/**
	 * Increase display power for 10
	 * 
	 * @throws IllegalArgumentException
	 *             ("Maximum display power is 100!")
	 */
	public void increaseDisplayPower() {
		this.displayPower = displayPower + 10;
		if (displayPower > 100) {
			throw new IllegalArgumentException("Maximum display power is 100!");
		}
	}

	/**
	 * Reducing dispaly power for 10
	 * 
	 * @throws IllegalArgumentException
	 *             ("Minimum display power is 0!")
	 */
	public void reduceDisplayPower() {
		this.displayPower = displayPower - 10;
		if (displayPower < 0) {
			throw new IllegalArgumentException("Minimum display power is 0!");
		}

	}

	/**
	 * String with producer name and display power state
	 */
	public String toString() {
		String output = "";
		if (isOn == true) {
			output = output + "Producer: " + name + " Display power is: "
					+ displayPower;
		} else {
			output = output + "Producer: " + name + " Display is Off";
		}
		return output;
	}

}
