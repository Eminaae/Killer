package ba.bitcamp.zadaci;

/*
 * Napisati klasu PersonalComputer. To je klasa koja opisuje jedan PC racunar i to ce biti nasa glavna klasa. Ono sto opisuje svaki racunar je njegov operativni sistem
 * i neke od njegovih komponenti.
 Klasa sadrzi sljedece atribute:
 * Operativni sistem (npr. Android, Windows, Linux Ubuntu)
 * Koliko radne memorije (RAM) ima (mjeri se u 𝐺𝐵)
 * Koja je cijena (u KM)
 */
/**
 * This class represents personal computer
 * 
 * @author kristina.pupavac
 *
 */
public abstract class PersonalComputer {
	private String system;
	private int ram;
	private int price;

	/**
	 * 
	 * @param system
	 * @param ram
	 * @param price
	 */
	public PersonalComputer(String system, int ram, int price) {
		super();
		this.system = system;
		this.ram = ram;
		this.price = price;
	}

	/**
	 * Gets operation system
	 * 
	 * @return - return system name
	 */
	public String getSystem() {
		return system;
	}

	/**
	 * Sets system name
	 * 
	 */
	public void setSystem(String system) {
		this.system = system;
	}

	/**
	 * Gets ram
	 * 
	 * @return - returns computer ram
	 */
	public int getRam() {
		return ram;
	}

	/**
	 * Sets computer ram
	 * 
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}

	/**
	 * Gets computer price
	 * 
	 * @return - return computer price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Sets computer price
	 * 
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	public void printTypeInfo() {
		System.out.println(".");
	}

	/**
	 * 
	 */
	public void printInformation() {
		System.out.println("System: " + system + " Ram: " + ram + " Price: "
				+ price);
	}

}
