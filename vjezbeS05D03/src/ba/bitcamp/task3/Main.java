package ba.bitcamp.task3;

public class Main {
	
	public static void main (String[] args) {
	Anntena a = new Anntena ("Sony", 50);
	System.out.println(a);
	
	System.out.println("producer name is: " + a.getProducerName());
	
	System.out.println("Signal power is: " + a.getSignalPower());
	
	System.out.println(a.isSignalRecived(6, "CAL38761234567"));
	
	}
}
