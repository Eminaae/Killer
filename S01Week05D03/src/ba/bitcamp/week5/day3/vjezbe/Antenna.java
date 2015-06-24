package ba.bitcamp.week5.day3.vjezbe;
/**
 * Represents antenna cell phone 
 * @author emina.arapcic
 *
 */
public class Antenna {
	
	private String producerName;
	private int signalStrength;
	private int discharging; // discharging battery
	
	/**
	 * Default constructors
	 * @param producerName
	 * @param discharging
	 */
	public Antenna(String producerName, int discharging){
		this.producerName = producerName;
		this.discharging = discharging;
		this.signalStrength = 4;
	}
	
	/**
	 * Returns manufacturer name
	 * @return
	 */
	public String getName(){
		return producerName;
	}
	
	/**
	 * Returns signal strength
	 * @return
	 */
	public int getSignal(){
		return signalStrength;
	}
	
	/**
	 * Sets signal strength
	 * @param signal
	 */
	public void setSignalStrength(int signal){
		this.signalStrength = signal;
	}
	
	/**
	 * Receives signal strength, as well as signal represented with string
	 * @param strength - signal strength
	 * @param signal
	 * @return - returns confirmation if signal is received and has meaning
	 */
	public boolean transmition(int strength, String signal) {
		String s = "";  // first three letters
		String s2 = "";	
		String s3 = ""; // country code number

		for (int i = 0; i <= 2; i++) {
			s += signal.charAt(i);
		}
		for (int i = 3; i < 6; i++) {
			s2 += signal.charAt(i);
		}
		for (int i = 3; i < signal.length(); i++) {
			s3 += signal.charAt(i);
		}
		/*Compare received signal to cell phone signal strength*/
		if (strength > signalStrength) { 
			return false;
		} else if (!s.equals("SMS") && !s.equalsIgnoreCase("CAL")) {
			return false;
		} else if (!s2.equals("387")) {
			return false;
		} else if (s3.length() < 11) {
			return false;
		} else {
			return true;
		}
	}
	
	public String toString(){
		String s = "Manufacturer " + producerName + "Signal strength " + signalStrength;
		return s;
		
	}
	
}
