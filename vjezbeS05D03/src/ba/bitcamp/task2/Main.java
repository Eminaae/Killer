package ba.bitcamp.task2;

public class Main {

	public static void main(String[] args) {
		
		Battery b = new Battery ("Sony", 20); 
		System.out.println(b);
		
		b.chargingBattery(40);
		
		System.out.println(b);
		
		b.dischargingBattery(6);
		System.out.println(b);
		
		System.out.println("Producer name is: " + b.getProducerName());
		
		System.out.println("Battery state is: " + b.getBatteryState() + " %");
		
		

	}

}
