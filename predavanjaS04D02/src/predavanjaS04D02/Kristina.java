package predavanjaS04D02;

import java.util.Currency;


public class Kristina {
	/**
	 * 
	 * @param fromCurrencyName - Currency name to convert from
	 * @param fromCurrency - Given in file, value of currency we are converting from
	 * @param toCurrencyName - Currency name we want to convert to
	 * @param toCurrency - Given in file, value of currency we wont to convert to
	 * @param value - amount to be converted
	 * @return final value - converted amount
	 */
	public static double valueFinal (String fromCurrencyName, double fromCurrency, String toCurrencyName, double toCurrency, double value) {
		double valueFinal;
		switch (toCurrencyName) {
		case "EUR":
			return valueFinal = (value * toCurrency) / fromCurrency;
		case "GBP":
			return valueFinal = (value * toCurrency) / fromCurrency;
		case "INR":
			return valueFinal = (value * toCurrency) / fromCurrency;
		case "AUD":
			return valueFinal = (value * toCurrency) / fromCurrency;
		case "CAD":
			return valueFinal = (value * toCurrency) / fromCurrency;
		case "NZD":
			return valueFinal = (value * toCurrency) / fromCurrency;
		case "YNJ":
			return valueFinal = (value * toCurrency) / fromCurrency;
		case "BAM":
			return valueFinal = (value * toCurrency) / fromCurrency;
		case "HRK":
			return valueFinal = (value * toCurrency) / fromCurrency;
			
		default :  valueFinal = (value * toCurrency) / fromCurrency;
		}
		return valueFinal;
	
		
	
	}
	 public static void main (String args[]) {
		 System.out.println("Output: " + valueFinal("USD", 1, "EUR", 0.88, 11));
		 
	 }

}
