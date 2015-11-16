package predavanjaS11D04;

import java.util.Date;

public class Main3 {

	public static void main(String[] args) {

		Date start = new Date();

		PrimeCounter[] counters = new PrimeCounter[16];
		int startInterval = 1, endInterval = 1000000;
		int step = endInterval / counters.length;
		for (int i = 0; i < counters.length; i++) {
			counters[i] = new PrimeCounter(i * step, (i + 1) * step);
			counters[i].start();

		}

		
		for (int i = 0; i < counters.length; i++) {
			try {
				counters[i].join();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		System.out.println("Primes count: " + counters[0].getCount());

		Date end = new Date();
		long timeLapse = (end.getTime() - start.getTime()) / 1000;
		System.out.println("Time (s): " + timeLapse);
	}

}
