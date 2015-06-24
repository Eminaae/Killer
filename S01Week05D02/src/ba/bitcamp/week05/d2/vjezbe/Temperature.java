package ba.bitcamp.week05.d2.vjezbe;

public class Temperature {
	private double temperature;
	/**
	 * Constructor initialize temperature
	 * @param temperature
	 */
	public Temperature(double temperature){
		this.temperature = temperature;
	}
	/**
	 * Returns temperature in Celsius degrees
	 * @param temperature
	 */
	public double getTemperatureInC(){
		return temperature;
	}
	/**
	 * Returns temperature in Kelvin degrees
	 * @return temperature converted from Celsius to Kelvin
	 */
	public double getTemperatureInK(){
		return temperature + 273.15;
	}
	/**
	 * Returns temperature in Farenheit degrees
	 * @return temperature converted from Celsius to Farenheit
	 */
	
	public double getTemperatureInF(){
		return temperature -17.2;
	}
	/**
	 * Sets temperature
	 * @param otherTemp
	 */
	public void set(int otherTemp){
		temperature = otherTemp;
	}
}
