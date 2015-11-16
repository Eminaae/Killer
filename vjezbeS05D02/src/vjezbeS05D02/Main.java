package vjezbeS05D02;

public class Main {

	public static void main(String[] args) {
		
		Temperature t1 = new Temperature(28);
		
		System.out.println("temperature in Celsius is: " + t1.getTemperatureInC());
		System.out.println("temperature in Kelvins is: " + t1.getTemperatureInK());
		System.out.println("temperature in Fahrenheits is: " + t1.getTemperatureInF());
		
		t1.setTemperature(34);
		
		System.out.println(t1.toString());
		

	}



}
