package ba.bitcamp.task3;

/*
 * Napisati klasu koja predstavlja antenu mobitela. Antena ima sljedece atribute:
 * Proizvodjac antene
 * Trenutna jacina signala (0 – 4)
 * Potrosnja baterije (procenat baterije po satu)
 Napisati i sljedece  metode/konstruktore:
 * Konstruktor koji inicijalizira proizvodjaca antene i potrošnju baterije o Jačina signala, po default-u, je 4
 * Getteri za proizvodjaca  i jacinu signala
 * Setter za jacinu signala
 * Metoda koja prima jacinu signala, kao i signal u vidu jednog String-a
 Prva tri slova oznaavaju sta signal prenosi, npr.
 * CAL38761234567 oznacava poziv od broja 38761234567
 * SMS387654957542 oznacava poruku od broja 387654957542
 Metoda vraca da li je signal primljen i ima smisao (true/false)
 * Ukoliko jacina signala poruke je veca od jacine signala mobitela onda je false 
 * Ukoliko prva tri slova nisu ni CAL ni SMS onda je false
 * Ukoliko pozivni broj ne počinje sa 387 onda je false
 * Ukoliko pozivni broj ima manje od 11 cifara onda je false
 * U svakom drugom slucaju je true
 * toString() metoda koja stavlja u String ime proizvodjaca antene i jacinu signala
 */
/**
 * This class represents one anntena
 * 
 * @author kristina.pupavac
 *
 */
public class Anntena {
	public String name;
	public int signalPower;
	public int batterySate;

	/**
	 * Default constructor
	 * 
	 * @param name
	 * @param signalPower
	 * @param batterySate
	 */
	public Anntena(String name, int batterySate) {
		this.name = name;
		this.signalPower = 4;
		this.batterySate = batterySate;
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
	 * Gets signal power
	 * 
	 * @return signal power
	 */
	public int getSignalPower() {
		return signalPower;
	}

	/**
	 * Sets signal power
	 * 
	 * @param power
	 *            - signal power
	 * @throws IllegalArgumentException
	 *             ("Max signal power is 4!")
	 */
	public void setSignalPower(int power) {
		this.signalPower = signalPower + power;
		if (signalPower > 4) {
			throw new IllegalArgumentException("Max signal power is 4!");
		}
	}

	/**
	 * 
	 * @param mobPower
	 * @param signal
	 * @return
	 */
	public boolean isSignalRecived(int mobPower, String signal) {
		if (mobPower < signalPower) {
			if (signal.substring(0, 3).equals("CAL")
					|| signal.substring(0, 3).equals("SMS")) {
				if (signal.substring(3, 6).equals("387")) {
					if (signal.length() >= 14) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * Returns string with producer name and signal power
	 */
	public String toString() {
		String output = "Producer: " + name + " Signal power: " + signalPower;
		return output;
	}

}
