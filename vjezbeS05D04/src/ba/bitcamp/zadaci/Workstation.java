package ba.bitcamp.zadaci;

/*
 * Workstation
 Predstavlja klasu koja opisuje jednu radnu stanicu. To je podklasa StationaryComputer klase. Ovakvi racunari su mnogo „snazniji“ od standardnih desktop racunara, koji su 
 namijenjeni za siroku upotrebu. Radne stanice su namijenje za istrazivacki i naucni rad sa mnogo proracuna i kalkulacija.
 Klasa sadrzi sljedece atribute:
 * Koliko displeja ima racunar
 * Koliko procesorskih jezgri ima racunar
 * Da li ima ECC memoriju (true/false)
 */
/**
 * This class represent workstatino computer
 * 
 * @author kristina.pupavac
 *
 */
public class Workstation extends StationaryComputer {

	private int displayNumber;
	private int processorNucelus;
	private boolean isECCmemory;

	/**
	 * 
	 * @param system
	 * @param ram
	 * @param price
	 * @param processorSpeed
	 * @param power
	 * @param capacity
	 * @param displayNumber
	 * @param processorNucelus
	 * @param isECCmemory
	 */
	public Workstation(String system, int ram, int price, int processorSpeed,
			int power, int capacity, int displayNumber, int processorNucelus,
			boolean isECCmemory) {
		super(system, ram, price, processorSpeed, power, capacity);
		this.displayNumber = displayNumber;
		this.processorNucelus = processorNucelus;
		this.isECCmemory = isECCmemory;
	}

	/**
	 * @return the displayNumber
	 */
	public int getDisplayNumber() {
		return displayNumber;
	}

	/**
	 * @param displayNumber
	 *            the displayNumber to set
	 */
	public void setDisplayNumber(int displayNumber) {
		this.displayNumber = displayNumber;
	}

	/**
	 * @return the processorNucelus
	 */
	public int getProcessorNucelus() {
		return processorNucelus;
	}

	/**
	 * @param processorNucelus
	 *            the processorNucelus to set
	 */
	public void setProcessorNucelus(int processorNucelus) {
		this.processorNucelus = processorNucelus;
	}

	/**
	 * @return the isECCmemory
	 */
	public boolean isECCmemory() {
		return isECCmemory;
	}

	/**
	 * @param isECCmemory
	 *            the isECCmemory to set
	 */
	public void setECCmemory(boolean isECCmemory) {
		this.isECCmemory = isECCmemory;
	}

	/**
	 * 
	 */
	public void printTypeInfo() {
		System.out.println("Worksation. Sationary computer.");
	}

	/**
	 * 
	 */
	public void printInformation() {
		super.printInformation();
		System.out.println("Display number: " + displayNumber
				+ " Processor nucleus: " + processorNucelus + " Is ECCmemory: "
				+ isECCmemory);
	}

}
