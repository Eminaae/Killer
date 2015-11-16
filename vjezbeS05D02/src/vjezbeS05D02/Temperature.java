package vjezbeS05D02;

/*
 * Napisati klasu koja opisuje temperaturu napolju. Temperatura je spremljena u jedan atribut, u °C.
 * Napisati konstruktor koji inicijalizira vrijednost temperature
 * Napisati metodu getTemperatureInC() koja vracca temperaturu u Celzijusima
 * Napisati metodu getTemperatureInK() koja vraća temperaturu u Kelvinima
 * Napisati metodu getTemperatureInF() koja vracca temperaturu u Farenhajtim
 * Napisati metodu setTemperature(int) koja postavlja vrijednost temperature
 * Napisati javadoc za sve metode
 */
public class Temperature {
	private double temperature;

	/**
	 * Constructor temperature
	 * 
	 * @param - temperature
	 */
	Temperature(double temperature) {
		this.temperature = temperature;
	}

	/**
	 * Geting temperature in Celsius
	 * 
	 * @return - temperature in Celsius
	 */
	public double getTemperatureInC() {
		return temperature;
	}

	/**
	 * Convert temperature for Celsius to Kelvins
	 * 
	 * @return temperature - in Kelvins
	 */
	public double getTemperatureInK() {
		return temperature = temperature + 273.15;
	}

	/**
	 * Convert temperature from Celsius to Fahrenheit
	 * 
	 * @return temperature - in Fahrenheit
	 */
	public double getTemperatureInF() {
		return temperature = temperature * 1.8 + 32;
	}

	/**
	 * Seting temperature
	 * 
	 * @param temperature
	 *            - temperature we want to set
	 */
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	/**
	 * Puting results to sting ready for printing
	 */
	public String toString() {
		String output = "Temperature is: " + temperature;
		return output;
		
	}

}
