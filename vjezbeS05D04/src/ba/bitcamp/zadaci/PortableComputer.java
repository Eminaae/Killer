package ba.bitcamp.zadaci;

/*
 * PortableComputer
 Predstavlja klasu koja opisuje jedan prenosivi racunar (PC). Ona predstavlja podklasu PersonalComputer klasi. Kod prenosivih racunara tezina i velicina racunara je obicno
 bitniji faktor. Kod ovakvih racunara obicno je ne mogue ili tesko promijeniti orginalne komponente koje su ugradjene u racunar.
 Klasa sadrzi sljedece atribute:
 * Tezina racunara (mjeri se u kg)
 * Velicina displeja (mjeri se u incima)
 * Da li podrzava Wi-Fi
 */
/**
 * This class represents portable computer
 * 
 * @author kristina.pupavac
 *
 */
public abstract class PortableComputer extends PersonalComputer {
	private int size;
	private int display;
	private boolean isWiFi;

	/**
	 * 
	 * @param system
	 * @param ram
	 * @param price
	 * @param size
	 * @param display
	 * @param isWiFi
	 */
	public PortableComputer(String system, int ram, int price, int size,
			int display, boolean isWiFi) {
		super(system, ram, price);
		this.size = size;
		this.display = display;
		this.isWiFi = isWiFi;
	}

	/**
	 * 
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * 
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * 
	 * @return
	 */
	public int getDisplay() {
		return display;
	}

	/**
	 * 
	 * @param display
	 */
	public void setDisplay(int display) {
		this.display = display;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isWiFi() {
		return isWiFi;
	}

	/**
	 * 
	 * @param isWiFi
	 */
	public void setWiFi(boolean isWiFi) {
		this.isWiFi = isWiFi;
	}

	/**
	 * 
	 */
	public void printInformation() {
		super.printInformation();
		System.out.println("Size: " + size + " Dispaly: " + display
				+ " Is WiFi: " + isWiFi);
	}

}
