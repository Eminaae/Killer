package ba.bitcamp.task3;

public class Main {

	public static void main(String[] args) {
		Clock c = new Clock(14, 6, 34);
		c.addToFile("clock.txt", Clock.AMPM_FORMAT);
		c.addToFile("clock.txt", Clock.AMPM_FORMAT_NO_SECONDS );
		c.addToFile("clock.txt", Clock.MILITARY_FORMAT);
		c.addToFile("clock.txt", Clock.MILITARY_FORMAT_NO_SECONDS);
		
		

	}

}
