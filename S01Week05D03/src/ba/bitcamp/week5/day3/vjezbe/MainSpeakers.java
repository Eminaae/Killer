package ba.bitcamp.week5.day3.vjezbe;

public class MainSpeakers {

	public static void main(String[] args) {
	Speakers s = new Speakers("Samsung",44, true, 23 , 44);
	System.out.println(s.currentVolume());
	System.out.println(s.toString());
	System.out.println(s.volumeSound());
	System.out.println(s.getProducerName());;
	System.out.println(s.getPrice());
	
	Battery b = new Battery ("Nokia", 1000);
	System.out.println(b.toString());
    b.decreasePercentageBattery(10);
    
    Antenna a = new Antenna ("Wings ", 100);
    System.out.println(a);
    System.out.println(a.getSignal());
	
	

	}

}
