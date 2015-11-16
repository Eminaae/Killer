package ba.bitcamp.task2;

/*
 * Napisati klasu koja opisuje bateriju mobitela. Baterija ima sljedece atribute:
 * Ime proizvodjaca baterije
 * Procenat baterije, tj. koliko ima baterije (0 – 100%)
 * Brzina punjenja (mjeri se u procentima po minuti)
 Klasa sadrzi sljedece metode/konstruktore:
 * Konstruktor koji inicijalizira ime proizvođača baterije i brzinu punjenja o Procenat baterije, po default-u, je 50%
 * Getteri za ime proizvodjaca baterije i za procenat baterije
 * Metoda koja prima parametar vremena i napuni bateriju u odnosu na brzinu punjenja
 * Metoda koja smanjuje procenat baterije za datu vrijednost parametra
 * toString() metoda koja stavlja u String ime proizvodjaca baterije i procenat baterije
 */
/**
 * This class reperesent battery
 * 
 * @author kristina.pupavac
 *
 */
public class Battery {

	private String name;
	private int batteryState;
	private int chargingSpeed;

	/**
	 * Default constructor sets battery state on 50%
	 * 
	 * @param name
	 * @param batteryState
	 * @param chargingSpeed
	 */
	public Battery(String name, int chargingSpeed) {
		this.name = name;
		this.batteryState = 50;
		this.chargingSpeed = chargingSpeed;
	}

	/**
	 * Gets producer name
	 * 
	 * @return producer name
	 */
	public String getProducerName() {
		return name;
	}

	/**
	 * gets battery state
	 * 
	 * @return battery state
	 */
	public int getBatteryState() {
		return batteryState;
	}

	/**
	 * Gets charging speed
	 * 
	 * @return charging speed
	 */
	public int getChargingSpeed() {
		return chargingSpeed;
	}

	/**
	 * Charge battery time * chargingSpeed
	 * 
	 * @param t
	 *            time
	 * @throws IllegalArgumentException
	 *             ("Battery is full! 100%")
	 */
	public void chargingBattery(int t) {

		this.batteryState = t * chargingSpeed;
		if (this.batteryState > 100) {
			this.batteryState = 100;
		}
	}

	/**
	 * Discharging battery for percentage value
	 * 
	 * @param procent
	 * @throws IllegalArgumentException
	 *             ("Battery is empty! 0%")
	 */
	public void dischargingBattery(int percentage) {

		this.batteryState = batteryState - percentage;
		if (this.batteryState < 0) {
			this.batteryState = 0;
		}

	}

	/**
	 * Printing string with producer name and battery state
	 */
	public String toString() {
		String output = "Producer: " + name + " Battery satate is : "
				+ batteryState + " %";
		return output;
	}
}
