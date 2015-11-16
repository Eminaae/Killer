package ba.bitcamp.task1;

/*
 * Napisati klasu koja opisuje zvucnik(e) mobitela. Zvucnici imaju sljedece atribute:
 * Ime proizvodjaca zvucnika
 * Cijena zvucnika
 * Da li su ukljuceni ili ne
 * Koliki je trenutni volume zvuka (max. je 100)
 * Kolika je potrosnja baterije (procenat baterije na sat)
 * Data klasa ima sljedece metode/konstruktore:
 * Konstruktor koji inicijalizira ime proizvodjaca, potrosnju baterije i cijenu o Po default-u zvucnici su iskljuceni, a volume je 0
 * Getteri za ime proizvodjaca, cijenu, da li su ukljuceni i koji je trenutni volume
 * enable() i disable() metode koje ukljucuju i iskljucuju zvucnike
 * lowerVolume() i increaseVolume() koje smanjuju i povecavaju volume zvuka za 10
 * Volume nikad ne smije ici ispod 0 ili iznad 100
 * toString() metoda koja stavlja u String ime proizvodjaca, kao i
 * Ukoliko su ukljuceni onda stavlja volume, u suprotnom stavi „Off“
 */
/**
 * This class represent speaker
 * @author kristina.pupavac
 *
 */
public class Speaker {

	private String name;
	private int price;
	private boolean isOn;
	private int volume;
	private int batteryState;
    
	/**
	 * Default constructor sound is set on 0
	 * @param name
	 * @param bateryState
	 * @param price
	 */
	public Speaker(String name, int bateryState, int price) {
		this.name = name;
		this.batteryState = bateryState;
		this.isOn = false;
		this.price = price;
		this.volume = 0;
	}

	/**
	 * Gets speaker name
	 * 
	 * @return speaker name
	 */
	public String getSpeakerName() {
		return name;
	}

	/**
	 * Gets speaker price
	 * 
	 * @return speaker price
	 */
	public int getSpeakerPrice() {
		return price;
	}

	/**
	 * Gets is off or on
	 * 
	 * @return true or false
	 */
	public boolean getIsOn() {
		return isOn;
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
	 * Gets speaker volume
	 * 
	 * @return
	 */
	public int getVolume() {
		return volume;
	}

	/**
	 * Sets speaker sound off
	 */
	public void enable() {
		isOn = true;
	}

	/**
	 * Sets speaker sound on
	 */
	public void disable() {
		isOn = false;
	}

	/**
	 * Lower speaker volume for 10
	 * 
	 * @param volume
	 *            speaker volume
	 * @throws IllegalArgumentException
	 *             ("Minimum sound is 0!")
	 */
	public void lowerVolume(int volume) {
		if (volume == 0) {
			throw new IllegalArgumentException("Minimum sound is 0!");
		} else {
			this.volume = this.volume - 10;
		}
	}

	/**
	 * Increase speaker volume for 10
	 * 
	 * @param volume
	 *            speaker volume
	 * @throws IllegalArgumentException
	 *             ("Maximum sound is 100!")
	 */
	public void increaseVolume(int volume) {
		if (volume == 100) {
			throw new IllegalArgumentException("Maximum sound is 100!");
		} else {
			this.volume = this.volume + 10;
		}
	}

	/**
	 * Printing string with name and speaker sound state
	 */
	public String toString() {
		String output = "";
		if (isOn == true) {
			return output = output + "Producer name: " + name + " Sound is on.";
		} else {
			return output = output + "Producer name: " + name
					+ " Sound is off.";
		}
	}
}
