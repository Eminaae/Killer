package ba.bitcamp.task1;

public class Main {

	public static void main(String[] args) {
		
		Speaker s = new Speaker ("Sony", 100, 50 );
		
		System.out.println(s);
		s.enable();
		
		System.out.println(s);
		
		System.out.println("Battery state is : " + s.getBatteryState() + "%");
		
		System.out.println("Is speaker on: " + s.getIsOn());
		
		s.increaseVolume(10);
		
		System.out.println("Volum is: " + s.getVolume() + " dB");
		
		s.lowerVolume(10);
		
		System.out.println("Volum is: " + s.getVolume() + " dB");
	}

}
