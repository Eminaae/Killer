package ba.bitcamp.zadaci;

/*
 * StationaryComputer
 Predstavlja klasu koja opisuje jedan stacionarni racunar (PC). Ona predstavlja podklasu PersonalComputer klasi. Kod stacionarnih racunara snaga komponenti je obicno
 bitniji faktor.
 Klasa sadrzi sljedece atribute:
 * Brzina procesora (mjeri se u 𝐺𝐻𝑧)
 * Snagu koju pruza Power Supply Unit (mjeri se u W)
 * Koliki je kapacitet Hard Disk-a (mjeri se u TB)
 */
/**
 * This class represents stationary computer
 * 
 * @author kristina.pupavac
 *
 */
public abstract class StationaryComputer extends PersonalComputer {

	private int processorSpeed;
	private int power;
	private int capacity;
	
	public StationaryComputer(String system, int ram, int price, int processorSpeed, int power, int capacity) {
		super(system, ram, price);
		this.processorSpeed = processorSpeed;
		this.power = power;
		this.capacity = capacity;
	}

	/**
	 * 
	 * @return
	 */
	public int getProcessorSpeed() {
		return processorSpeed;
	}

	/**
	 * 
	 * @param processorSpeed
	 */
	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	/**
	 * 
	 * @return
	 */
	public int getPower() {
		return power;
	}

	/**
	 * 
	 * @param power
	 */
	public void setPower(int power) {
		this.power = power;
	}

	/**
	 * 
	 * @return
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * 
	 * @param capacity
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	/**
	 * 
	 */
	public void printInformation () {
		super.printInformation();
		System.out.println("Processor speed{ " + processorSpeed + " Power: " + power + " Capacity: " + capacity);
	}

}
