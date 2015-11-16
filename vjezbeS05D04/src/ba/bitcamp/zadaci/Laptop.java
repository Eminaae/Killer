package ba.bitcamp.zadaci;

/*
 * Laptop
 Predstavlja klasu koja opisuje jedan laptop. To je podklasa PortableComputer klase. Ovakvi racunari su namijenjeni za siroku upotrebu, kada je prenosivost bitna. Glavna 
 stvar kod ovakvih racunara je prenosivost, mogucnost povezivanja i baterija.
 Klasa sadrzi sljedece atribute:
 * Koliko ima celija (cells) baterija
 * Da li računar ima Bluetooth
 * Da li ima numericku tastaturu
 */
/**
 * 
 * @author kristina.pupavac
 *
 */
public class Laptop extends PortableComputer {
	private int batteryCells;
	private boolean isBluetooth;
	private boolean isNumericKeyboard;

	public Laptop(String system, int ram, int price, int size, int display,
			boolean isWiFi, int batteryCells, boolean isBluetooth,
			boolean isNumericKeyboard) {
		super(system, ram, price, size, display, isWiFi);
		this.batteryCells = batteryCells;
		this.isBluetooth = isBluetooth;
		this.isNumericKeyboard = isNumericKeyboard;
	}

	/**
	 * @return the batteryCells
	 */
	public int getBatteryCells() {
		return batteryCells;
	}

	/**
	 * @param batteryCells
	 *            the batteryCells to set
	 */
	public void setBatteryCells(int batteryCells) {
		this.batteryCells = batteryCells;
	}

	/**
	 * @return the isBluetooth
	 */
	public boolean isBluetooth() {
		return isBluetooth;
	}

	/**
	 * @param isBluetooth
	 *            the isBluetooth to set
	 */
	public void setBluetooth(boolean isBluetooth) {
		this.isBluetooth = isBluetooth;
	}

	/**
	 * @return the isNumericKeyboard
	 */
	public boolean isNumericKeyboard() {
		return isNumericKeyboard;
	}

	/**
	 * @param isNumericKeyboard
	 *            the isNumericKeyboard to set
	 */
	public void setNumericKeyboard(boolean isNumericKeyboard) {
		this.isNumericKeyboard = isNumericKeyboard;
	}

	/**
	 * 
	 */
	public void printTypeInfo() {
		System.out.println("Laptop. Portable computer.");
	}

	/**
	 * 
	 */
	public void printInformation() {
		super.printInformation();
		System.out.println("Battery cells: " + batteryCells + " Is bluetooth: "
				+ isBluetooth + " Is numeric keyboard: " + isNumericKeyboard);
	}

}
