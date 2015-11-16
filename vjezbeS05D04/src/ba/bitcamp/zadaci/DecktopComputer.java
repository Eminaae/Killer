package ba.bitcamp.zadaci;

/*
 * DesktopComputer
 Predstavlja klasu koja opisuje jedan desktop racunar. To je podklasa StationaryComputer klase. Ovakvi racunari su namijenjeni za siroku upotrebu. Glavna ideja ovakvih 
 racunara je mogucnost konfiguracije i „stimanja“ po svojoj zelji.
 Klasa sadrzi sljedece atribute:
 * Koliko ima slobodnih mjesta za RAM memoriju
 * Da li je overclock-an racunar
 * Da li ima optical drive (za citanje DVD-ova)
 */
/**
 * This class reperesent desktop computer
 * 
 * @author kristina.pupavac
 *
 */
public class DecktopComputer extends StationaryComputer {
	private int freeRAMSpace;
	private boolean isOvelock;
	private boolean isOpticalDrive;

	public DecktopComputer(String system, int ram, int price,
			int processorSpeed, int power, int capacity, int freeRAMSpace,
			boolean isOvelock, boolean isOpticalDrive) {
		super(system, ram, price, processorSpeed, power, capacity);
		this.freeRAMSpace = freeRAMSpace;
		this.isOvelock = isOvelock;
		this.isOpticalDrive = isOpticalDrive;
	}

	/**
	 * @return the freeRAMSpace
	 */
	public int getFreeRAMSpace() {
		return freeRAMSpace;
	}

	/**
	 * @param freeRAMSpace
	 *            the freeRAMSpace to set
	 */
	public void setFreeRAMSpace(int freeRAMSpace) {
		this.freeRAMSpace = freeRAMSpace;
	}

	/**
	 * @return the isOvelock
	 */
	public boolean isOvelock() {
		return isOvelock;
	}

	/**
	 * @param isOvelock
	 *            the isOvelock to set
	 */
	public void setOvelock(boolean isOvelock) {
		this.isOvelock = isOvelock;
	}

	/**
	 * @return the isOpticalDrive
	 */
	public boolean isOpticalDrive() {
		return isOpticalDrive;
	}

	/**
	 * @param isOpticalDrive
	 *            the isOpticalDrive to set
	 */
	public void setOpticalDrive(boolean isOpticalDrive) {
		this.isOpticalDrive = isOpticalDrive;
	}

	/**
	 * 
	 */
	public void printTypeInfo() {
		System.out.println("Decktop computer. Sationary computer. ");
	}

	/**
	 * 
	 */
	public void printInformation() {
		super.printInformation();
		System.out.println("Free RAM space: " + freeRAMSpace + " Is overlock: "
				+ isOvelock + " Is optical drive: " + isOpticalDrive);
	}

}
