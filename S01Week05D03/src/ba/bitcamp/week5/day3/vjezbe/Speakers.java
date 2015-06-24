package ba.bitcamp.week5.day3.vjezbe;
/**
 * Describing cell phone speakers
 * @author emina.arapcic
 *
 */
public class Speakers {
	private String nameProducer;
	private int price;
	private boolean isTurnOn =false;
	private int volume;
	private double battery;

	/**
	 * Default constructor
	 * @param nameProducer - Producer name
	 * @param price - Speakers price
	 * @param state - state is true (on) as default state
	 * @param currentVolume as default is 0
	 * @param battery Consumption of battery
	 */
	public Speakers(String nameProducer, int price, boolean state, int currentVolume, double battery){
		this.nameProducer = nameProducer;
		this.price = price;
		this.isTurnOn = false;
		this.volume = 0;
		this.battery = battery;
	}
	/**
	 * Returns producer name.
	 * @return
	 */
	public String getProducerName(){
		return nameProducer;
	}
	/**
	 * Cell phone speakers price. 
	 * @return price
	 */
	public int getPrice(){
		return price;
	}

	/**
	 * Returns current speakers volume.
	 * @return currentVolume
	 */
	public int currentVolume(){
		return volume;
	}
	
	/**
	 * Speakers on/off
	 * @return true or false
	 */
	public boolean isOn() {
		return isTurnOn;
	}

	/**
	 * Returns volume
	 * @return turn off speaker
	 */
	public int volumeSound() {
		return volume;
	}
	
	/**
	 * Turns on speakers.
	 */
	public void enable() {
		if (isTurnOn == false) {
			isTurnOn = true;
		}
	}
	
	/**
	 * Turns off speakers.
	 */
	public void disable() {
		if (isTurnOn == false) {
			isTurnOn = true;
		}
	}
	/**
	 * Decreases speakers volume.
	 */
	public void lowerVolume() {
		if (volume < 10 || isTurnOn == false) {
			volume = 0;
		} else {
			volume -= 10;
		}
	}
	
	/**
	 * Increases speakers volume.
	 */
	public void increaseVolume() {
		if (volume < 100 || isTurnOn == true) {
			volume += 10;
		}
	}

	public String toString() {
		String s = "";
		s = "Name of manufacturer: " + nameProducer + "\n";
		if (isTurnOn == true) {
			s = s +"Volume:" + volume + "\n";
		} else {
			s = s + "Off";
		}
		return s;
	}
}
