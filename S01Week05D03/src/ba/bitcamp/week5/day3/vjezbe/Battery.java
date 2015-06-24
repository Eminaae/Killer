package ba.bitcamp.week5.day3.vjezbe;
/**
 * Describes cell phone battery.
 * @author emina.arapcic
 *
 */
public class Battery {
	private String producerName;
	private double batteryStatus; // Percentage of charging
	private double batteryChargingSpeed; // Percentage per minute
	
	/**
	 * Default constructor
	 * @param makerName
	 * @param chargingSpeed
	 */
	public Battery(String producerName, double batteryChargingSpeed){
		this.producerName = producerName;
		this.batteryChargingSpeed = batteryChargingSpeed;
		batteryStatus = 50;	
	}
	
	/**
	 * Returns battery manufacturer
	 * @return
	 */
	public String getProducerName(){
		return producerName;
	}
	
	/**
	 * Returns battery charging speed in percentage per minute
	 * @return
	 */
	public double chargingSpeed(){
		return batteryChargingSpeed;
	}
	
	/**
	 * Sets time and charges battery compared to charging speed
	 * @param t
	 */
	public void setTime(int t){
		this.batteryStatus = batteryChargingSpeed*t;
	}
	
	/**
	 * Decreases percentage of charging battery
	 * @param value
	 */
	public void decreasePercentageBattery(int value){
		this.batteryStatus = batteryStatus - value;
	
	}
	
	public String toString(){
		String s = "Manufacturer " + producerName + "Status " + batteryStatus;
		return s;
		
	}
}
