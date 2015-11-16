package ba.bitcamp.zadaci;

/*
 * PocketPC
 Predstavlja klasu koja opisuje jedan dzepni racunar. To je podklasa PortableComputer klase. Ovakvi racunari su namijenjeni za siroku upotrebu, kada je prenosivost bitna.
 Glavna stvar kod ovakvih racunara je prenosivost i funkcionalnost.
 Klasa sadrzi sljedece atribute:
 * Da li podrzava touch interface
 * Da li podrzava SIM kartice
 * Da li podrzava MicroSD kartice
 */
/**
 * This class reperesent pocket pc
 * 
 * @author kristina.pupavac
 *
 */
public class PocketPC extends PortableComputer {
	private boolean isTouch;
	private boolean isSIM;
	private boolean isMCSD;

	public PocketPC(String system, int ram, int price, int size, int display,
			boolean isWiFi, boolean isTouch, boolean isSIM, boolean isMCSD) {
		super(system, ram, price, size, display, isWiFi);
		this.isTouch = isTouch;
		this.isSIM = isSIM;
		this.isMCSD = isMCSD;

	}

	/**
	 * @return the isTouch
	 */
	public boolean isTouch() {
		return isTouch;
	}

	/**
	 * @param isTouch
	 *            the isTouch to set
	 */
	public void setTouch(boolean isTouch) {
		this.isTouch = isTouch;
	}

	/**
	 * @return the isSIM
	 */
	public boolean isSIM() {
		return isSIM;
	}

	/**
	 * @param isSIM
	 *            the isSIM to set
	 */
	public void setSIM(boolean isSIM) {
		this.isSIM = isSIM;
	}

	/**
	 * @return the isMCSD
	 */
	public boolean isMCSD() {
		return isMCSD;
	}

	/**
	 * @param isMCSD
	 *            the isMCSD to set
	 */
	public void setMCSD(boolean isMCSD) {
		this.isMCSD = isMCSD;
	}

	/**
	 * 
	 */
	public void printTypeInfo() {
		System.out.println("Pocket PC. Portable computer. ");
	}

	/**
	 * 
	 */
	public void printInformation() {
		super.printInformation();
		System.out.println("Is touch: " + isTouch + " Is SIM: " + isSIM
				+ " Is mcSD: " + isMCSD);

	}

}
