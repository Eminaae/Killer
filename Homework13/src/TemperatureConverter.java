
public class TemperatureConverter {

	public static void main(String[] args) {
		System.out.println(convertToKelvins(100));
	}
	
	/**
	 * Convert temperature from degrees Celsius to Kelvin.
	 * @param t - input, degrees Celsius temperature
	 * @return temp - converted degrees Celsius to Kelvins
	 */
	public static double convertToKelvins(double t){
		double temp = t + 273;	// formula for converting degrees Celsius to Kelvins
		return temp;
		
	}
}
